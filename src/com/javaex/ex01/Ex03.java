package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	//보조는 섞어서 쓰지않는다
	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg"); //주
		BufferedInputStream bin = new BufferedInputStream(in); //보조
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사시작");
		while (true) {
			int data = bin.read();
			
			if(data == -1) {
				System.out.println("복사끝"+data);
				break;
			}
			
			bout.write(data);
		}
		
		bout.close();
		//out.close();
		
		bin.close();
		//in.close(); bin.close가 통제하기에 필요없다
	}
}
