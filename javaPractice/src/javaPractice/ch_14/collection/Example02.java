package javaPractice.ch_14.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javaPractice.ch_14.collection_Member.Member;

// BoardDao ��ü�� getBoardList() �޼ҵ带 ȣ���ϸ�  List<Board>Ÿ���� �÷����� ����
// main() �޼ҵ� ����ÿ� �Ʒ��� ���� ��µ� �� �ֵ��� BoardDao�� getBoardList() �޼ҵ带 �ۼ��϶�

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
	
	// ��� 1. 
//	public List<Board> getBoardList() { // �ٷ� �޼ҵ� ����
//		List<Board> boardList = new ArrayList<Board>();	// �޼ҵ� �� ��ü ����
//		boardList.add(new Board("����1", "����1"));	// �޼ҵ� ���� ���� �Է�
//		boardList.add(new Board("����2", "����2"));
//		boardList.add(new Board("����3", "����3"));
//		return boardList;	// �޼ҵ� ��ȯ
//	}
	
	// ��� 2.
	List<Board> boardList = new ArrayList<Board>(); //��ü ����
	
	public BoardDao() {	// ������ ����
		boardList.add(new Board("����1", "����1"));
		boardList.add(new Board("����2", "����2"));
		boardList.add(new Board("����3", "����3"));
	}
	
	public List<Board> getBoardList() {	// �޼ҵ�� ��ȯ
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
		��� ��� :
		
			����1-����1
			����2-����2
			����3-����3
			
		�� �������� �Ͻÿ�.
		*/
	}

}
