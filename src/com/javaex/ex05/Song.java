package com.javaex.ex05;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	//생성자
	public Song() {
		//메모리에 올리는 일
		System.out.println("Song(0)");
	}

	
	
	public Song(String title, String artist, String album, String composer) {
		this(title, artist, album, composer, "");
		System.out.println("Song(4)");
	}
	
	
	
	public Song(String title, String artist, String album, String composer, String year) {
		//메모리에 올리는 일
		this.title = title;
		this.artist = artist;
		this.album = album;
		
		//작곡가 이름이 최대 10글자 까지만 입력  코드:100줄
		this.composer = composer;
		
		//년도 2021년 이후 년도 들어오면 2021으로 처리  2023 -->2021   코드:200줄
		this.year = year;	
		
		System.out.println("Song(5)");
	}
	

	public Song(String title, String artist, String album, String composer, String year, int track) {
		//메모리 올리는 일
		this(title, artist, album, composer, year);
		
		this.track = track;
		System.out.println("Song(6)");
	}
	
	



	//메소드 - g/s
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	public void showInfo() {
		System.out.println(artist+", "+title+"("+album+", "+year+", "+ track+"번 track, "+composer+" 작곡)");                   
	}
	
}
