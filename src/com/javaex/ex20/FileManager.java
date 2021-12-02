package com.javaex.ex20;

import java.io.IOException;

public class FileManager {

	//필드 - 생략
	
	//생성자
	//public FileManager() {}
	
	//메소드 g/s
	
	//메소드 일반
	public void readFile() throws IOException{// c://config.txt 을 읽어오는 메소드
		
		//System.out.println("파일을 읽었습니다.");
		
	
	    System.out.println("강제예외상황발생");
		throw new IOException(); //파일을 못읽었을때 예외 발생
	
		
		
	}
	
	
}
