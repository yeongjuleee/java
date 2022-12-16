package javaPractice.ch_07;

class Song {
	// �Ӽ�(���� ����)
	String title; // �뷡 ����
	String artist; // ����
	int length; // �뷡 ����
	
	// ���(�޼ҵ� ����)
	
	// �����ε� ����ϱ�
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
		this(title, artist); // this�� title �� artist�� ������.
		this.length = length;
	}
	
	// ���� ���ڿ��� ��ȯ�ϱ�
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

	// ���� ������
	// �뷡 �� ���� ��Ÿ���� Ŭ���� Song�� �ۼ��϶�
	// this()�� ����϶�
	// Song Ŭ������ ������ ���� �����Ѵ�
	// #�ʵ�
	// title : �뷡 ����
	// artist : ����
	// length : ���� ���� (���� : ��)
	
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
