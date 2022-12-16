package javaPractice.ch_14.collection;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	//Queue를 이용한 메시지 큐
	
	public String command;
	public String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}

public class MyQueue_02 {
	// Queue를 이용한 메시지 큐
	public static void main(String[] args) {
		// Stack은 class지만, Queue는 interface로 만들어졌기 때문에, LinkedList를 이용 (?)
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메시지 저장
		messageQueue.offer(new Message("sendMail", "박지훈"));
		messageQueue.offer(new Message("sendSMS", "박정우"));
		messageQueue.offer(new Message("sendKakaotalk", "김준규"));
		
		while (!messageQueue.isEmpty()) { // 메시지 큐가 비어있지 않으면,
			Message message = messageQueue.poll();	// 메시지 큐에서 1개의 메시지를 꺼냄
													// 맨 앞에 메시지를 꺼내고 삭제함. poll
			switch (message.command) {
				case "sendMail" :
					System.out.println(message.to + "님에게 메일을 보냈습니다.");
					break;
					
				case "sendSMS" :
					System.out.println(message.to + "님에게 메일을 보냈습니다.");
					break;
				
				case "sendKakaotalk" :
					System.out.println(message.to + "님에게 메일을 보냈습니다.");
					break;
			}
			
//			박지훈님에게 메일을 보냈습니다.
//			박정우님에게 메일을 보냈습니다.
//			김준규님에게 메일을 보냈습니다.
		}
	}

}
