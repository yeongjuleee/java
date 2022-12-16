package javaPractice.ch_07;

class Song {
	// 속성(변수 선언)
	String title; // 노래 제목
	String artist; // 가수
	int length; // 노래 길이
	
	// 기능(메소드 선언)
	
	// 오버로딩 사용하기
	public Song() {
		
	}
	
	public Song(String title) {
		this.title = title;
	}
	
	public Song(String title, String artist) {
		this(title);
		this.artist = artist;
	}
	
	public Song(String title, String artist, int length) {
		this(title, artist); // this에 title 과 artist를 저장함.
		this.length = length;
	}
	
	// 값을 문자열로 변환하기
	public String toString() {
		return "Song [title = " + title + ", artist = " + artist + ", length = " + length + "]";
	}
	
	
	/*
	Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	
	Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	Song(String title) {
		this.title = title;
	}
	
	Song() {
		
	}
	*/
}


public class DefaultConstructor06 {

	// 다중 생성자
	// 노래 한 곡을 나타내는 클래스 Song을 작성하라
	// this()를 사용하라
	// Song 클래스는 다음과 같이 정의한다
	// #필드
	// title : 노래 제목
	// artist : 가수
	// length : 곡의 길이 (단위 : 초)
	
	public static void main(String[] args) {
		Song song1 = new Song("BLT", "TREASURE", 180);
		Song song2 = new Song("Rolling In The Deep", "Adel");
		Song song3 = new Song("Bye Bye My Blue");
		Song song4 = new Song();
		
		System.out.println(song1.toString()); // Song{title= 'BLT', artist='TREASURE', length= 180}
		System.out.println(song2.toString()); // Song{title= 'Rolling In The Deep', artist='Adel'}
		System.out.println(song3.toString()); // Song{title= 'Bye Bye My Blue'} 
		System.out.println(song4.toString());
	}

}
