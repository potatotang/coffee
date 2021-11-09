package day12;

import java.io.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BtnEvt implements ActionListener {
	Ex01 main;
	JFileChooser fc = new JFileChooser("src/day12");
	public BtnEvt() {}
	public BtnEvt(Ex01 main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		switch(str) {
		case "불러오기":
			doOpen();
			break;
		case "저장하기":
			doSave();
			break;
		}
	}
	
	public void doOpen() {
		int kind = fc.showOpenDialog(main.fr);
		File f = null;
		if(kind == JFileChooser.APPROVE_OPTION) {
			f = fc.getSelectedFile();
			
		} else return;
		
		// 읽어서 내용 출력
		// 스트림 준비
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			StringBuffer buff = new StringBuffer();
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				
				buff.append(str + "\r\n");
			}
			main.area.setText(buff.toString());
			
		} catch(Exception e) {
			
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}
	
	public void doSave() {
		int kind = fc.showSaveDialog(main.fr);
		File file = null;
		if(kind == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
		} else {
			return;
		}
		
		// 내용 저장...
		// main의 area의 내용을 읽어서 파일에 쓴다.
		
		// 데이터 만들고
		String str = main.area.getText();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(str);
			bw.flush();
			
			JOptionPane.showMessageDialog(main.fr, file.getName() + " ] 파일 저장에 성공했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch(Exception e) {}
		}
	}
}
