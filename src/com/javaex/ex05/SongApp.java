package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
	
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		//System.out.println(s01.toString());
		
		//5개는 생성자 초기화  트랙번호는 세터로 초기화
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007");
		s02.setTrack(2);
		//System.out.println(s02.toString());
		
		
		System.out.println("----------------------");
		//6개 모든 필드값 초기화 하는 생성자 사용
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", "2012", 4 );
		System.out.println(s03.toString());
		System.out.println("----------------------");
		
		
		Song s04 = new Song("벚꽃엔딩2", "버스커버스커2", "버스커버스커1집2", "장범준2");
		System.out.println(s04.toString());
		System.out.println("----------------------");
	
		
		//아이유출력
		s01.showInfo();
		
		//빅뱅출력
		s02.showInfo();
		
		//버스커버스크
		s03.showInfo();
		
		
	}

}
