DROP SEQUENCE MEMBSEQ;

create sequence membseq
    start with 1001
    maxvalue 9999
--    increment by 2
    nocycle
    nocache
;

SELECT membseq.nextval, membseq.currval FROM dual;
SELECT membseq.currval FROM dual;

/*
    START WITH  ����  : ���۰�
    MAXVALUE    ����  : �ִ밪
    MINVALUE    ����  : �ּҰ�
    INCREMENT BY ���� : ������
    CYCLE �Ǵ� NOCYCLE    : �ִ밪�� ���������� ó������ �ٽ� �ݺ��ؼ� ������ ����
    CACHE �Ǵ� NOCACHE    : ��ȣ�� ���� ���� ��ŭ �̸� ���� ĳ�ÿ� ����ؼ� ����� ������ ����
                            �⺻���� CACHE 10
                            
                            
    ����ϴ� ���
        �������̸�.NEXTVAL
        
    ���� ]
        NEXTVAL - ���� ��ȣ�� ����
        CURRVAL - ������ ���� ��ȣ�� ����ϴ� ����
*/

CREATE TABLE member (
    mno NUMBER(4)
        CONSTRAINT MEMB_NO_PK PRIMARY KEY,
    id VARCHAR2(10 CHAR)
        CONSTRAINT MEMB_ID_UK UNIQUE
        CONSTRAINT MEMB_ID_NN NOT NULL,
    pw VARCHAR2(10 CHAR)
        CONSTRAINT MEMB_PW_NN NOT NULL,
    name VARCHAR2(10 CHAR)
        CONSTRAINT MEMB_NAME_NN NOT NULL,
    tel VARCHAR2(13 CHAR)
        CONSTRAINT MEMB_TEL_UK UNIQUE
        CONSTRAINT MEMB_TEL_NN NOT NULL,
    mail VARCHAR2(50 CHAR)
        CONSTRAINT MEMB_MAIL_UK UNIQUE
        CONSTRAINT MEMB_MAIL_NN NOT NULL,
    isshow CHAR(1) DEFAULT 'Y'
        CONSTRAINT MEMB_SHOW_CK CHECK(isshow IN ('Y', 'N'))
        CONSTRAINT MEMB_SHOW_NN NOT NULL
);

INSERT INTO
    member(mno, name, id, pw, tel, mail)
VALUES(
    1000,
    '������', 'euns', '12345', '010-1234-5678', 'euns@cnu.ac.kr'
)
;


INSERT INTO
    member(mno, name, id, pw, tel, mail)
VALUES(
    1,
    '�ڼ���', 'banjang', '12345', '010-9876-5432', 'banjang@cnu.ac.kr'
)
;
INSERT INTO
    member(mno, name, id, pw, tel, mail)
VALUES(
    membseq.nextval,
    '����', 'jenny', '12345', '010-1111-1111', 'jenny@cnu.ac.kr'
)
;

create table board(
    bno NUMBER(4)
        CONSTRAINT BRD_NO_PK PRIMARY KEY,
    title VARCHAR2(100 CHAR)
        CONSTRAINT BRD_TTL_NN NOT NULL,
    body VARCHAR2(4000)
        CONSTRAINT BRD_BODY_NN NOT NULL,
    bmno NUMBER(4)
        CONSTRAINT BRD_MNO_FK REFERENCES member(mno)
        CONSTRAINT BRD_MNO_NN NOT NULL,
    wdate DATE DEFAULT sysdate
        CONSTRAINT BRD_DATE_NN NOT NULL,
    isshow CHAR(1) DEFAULT 'Y'
        CONSTRAINT BRD_SHOW_CK CHECK(isshow IN ('Y', 'N'))
        CONSTRAINT BRD_SHOW_NN NOT NULL
);

create table reboard(
    rbno NUMBER(4)
        CONSTRAINT RBRD_NO_PK PRIMARY KEY,
    body VARCHAR2(4000)
        CONSTRAINT RBRD_BODY_NN NOT NULL,
    rbmno NUMBER(4)
        CONSTRAINT RBRD_MNO_FK REFERENCES member(mno)
        CONSTRAINT RBRD_MNO_NN NOT NULL,
    upno NUMBER(4)
        CONSTRAINT RBRD_UPNO_FK REFERENCES reboard(rbno),
    bgroup NUMBER(4)
        CONSTRAINT RBRD_GROUP_NN NOT NULL,
    step NUMBER(2)  DEFAULT 1
        CONSTRAINT RBRD_STEP_NN NOT NULL,
    rb_isshow CHAR(1) DEFAULT 'Y'
        CONSTRAINT RBRD_SHOW_CK CHECK(rb_isshow IN('Y', 'N'))
        CONSTRAINT RBRD_SHOW_NN NOT NULL
);

INSERT INTO 
    reboard(rbno, rbmno, body, bgroup)
VALUES(
    1001, 1000, 'ù��° ��....', 1001
);

truncate table reboard;

INSERT INTO
    reboard(rbno, rbmno, body, upno, bgroup, step) 
VALUES(
    (SELECT NVL(MAX(rbno) + 1, 1001) FROM reboard),
    (SELECT mno FROM member WHERE id = 'jenny'),
    'ù��° ���� ù ���...', 1001,
    (SELECT bgroup FROM reboard WHERE rbno = 1001),
    (SELECT step + 1 FROM reboard WHERE rbno = 1001)
);


ALTER TABLE 
    reboard
ADD wdate Date default sysdate
    CONSTRAINT RBD_DATE_NN NOT NULL
;

SELECT
    LPAD(' ', (step - 1) * 7, ' ') || ' | '|| rbno 
    || ' | '|| body || ' | '|| rbmno || ' | '|| upno || ' | '|| wdate
    
FROM
    reboard
ORDER BY
    bgroup desc
;
alter table reboard
drop constraint RBRD_GROUP_FK;


alter table 
    reboard
modify bgroup VARCHAR2(4000) 
    CONSTRAINT RBD_GROUP_NN NOT NULL
;

select
    LPAD(' ', (level - 1) * 7, ' ') || ' | '|| rbno || ' | '|| body || ' | '|| rbmno || ' | '|| upno || ' | '|| wdate
from
    reboard
start with
    upno is null
connect by
    PRIOR rbno = upno
order siblings by
    wdate desc
;

ALTER TABLE
    member
ADD jdate Date DEFAULT sysdate
    CONSTRAINT MEMB_DATE_NN NOT NULL
;

commit;