package javaPractice.ch_14.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javaPractice.ch_14.collection_Member.Member;

// BoardDao 객체의 getBoardList() 메소드를 호출하면  List<Board>타입의 컬렉션을 리턴
// main() 메소드 실행시에 아래와 같이 출력될 수 있도록 BoardDao의 getBoardList() 메소드를 작성하라

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
}

class BoardDao {
	
	// 방법 1. 
//	public List<Board> getBoardList() { // 바로 메소드 생성
//		List<Board> boardList = new ArrayList<Board>();	// 메소드 내 객체 생성
//		boardList.add(new Board("제목1", "내용1"));	// 메소드 실행 내용 입력
//		boardList.add(new Board("제목2", "내용2"));
//		boardList.add(new Board("제목3", "내용3"));
//		return boardList;	// 메소드 반환
//	}
	
	// 방법 2.
	List<Board> boardList = new ArrayList<Board>(); //객체 생성
	
	public BoardDao() {	// 생성자 생성
		boardList.add(new Board("제목1", "내용1"));
		boardList.add(new Board("제목2", "내용2"));
		boardList.add(new Board("제목3", "내용3"));
	}
	
	public List<Board> getBoardList() {	// 메소드로 반환
		return boardList;
	}

}


public class Example02 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
		/*
		출력 결과 :
		
			제목1-내용1
			제목2-내용2
			제목3-내용3
			
		가 나오도록 하시오.
		*/
	}

}
