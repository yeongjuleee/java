package javaPractice.ch_14.collection;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	//Queue�� �̿��� �޽��� ť
	
	public String command;
	public String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}

public class MyQueue_02 {
	// Queue�� �̿��� �޽��� ť
	public static void main(String[] args) {
		// Stack�� class����, Queue�� interface�� ��������� ������, LinkedList�� �̿� (?)
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// �޽��� ����
		messageQueue.offer(new Message("sendMail", "������"));
		messageQueue.offer(new Message("sendSMS", "������"));
		messageQueue.offer(new Message("sendKakaotalk", "���ر�"));
		
		while (!messageQueue.isEmpty()) { // �޽��� ť�� ������� ������,
			Message message = messageQueue.poll();	// �޽��� ť���� 1���� �޽����� ����
													// �� �տ� �޽����� ������ ������. poll
			switch (message.command) {
				case "sendMail" :
					System.out.println(message.to + "�Կ��� ������ ���½��ϴ�.");
					break;
					
				case "sendSMS" :
					System.out.println(message.to + "�Կ��� ������ ���½��ϴ�.");
					break;
				
				case "sendKakaotalk" :
					System.out.println(message.to + "�Կ��� ������ ���½��ϴ�.");
					break;
			}
			
//			�����ƴԿ��� ������ ���½��ϴ�.
//			������Կ��� ������ ���½��ϴ�.
//			���رԴԿ��� ������ ���½��ϴ�.
		}
	}

}
