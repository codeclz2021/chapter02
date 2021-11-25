package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song();
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear("2010");
		s1.setTrack(3);
		
		//System.out.println(s1.getArtist());
		s1.showInfo();
		//System.out.println(s1.toString());
		
		Song s2 = new Song();
		//Song s2 = new Song("거짓말", "BIGBANG", "Always", "G-DRAON", "2007", 2);
		s2.setTitle("거짓말");
		s2.setArtist("BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON");
		s2.setYear("2007");
		s2.setTrack(2);
		
		//s2.showInfo();
		//System.out.println(s2.toString());
		s2.showInfo();
		
		
		
		
	}

}
