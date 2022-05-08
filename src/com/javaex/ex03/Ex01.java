package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 1. split(",") 사용

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			String str = br.readLine();
			str.split(",");
			if (str == null) {
				
				break;
			}
			System.out.println(str);

		}

		br.close();
	}
}
