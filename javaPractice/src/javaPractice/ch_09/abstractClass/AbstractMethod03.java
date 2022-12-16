package javaPractice.ch_09.abstractClass;

/*
HttpServlet �߻� Ŭ������ LoginServlet, FileDownloadServlet Ŭ������ �ֽ��ϴ�.
���� Ŭ������ ��� ����� ���� LoginServlet, FileDownloadServlet Ŭ������ �ϼ��ϼ���.

��� ���
�α��� �մϴ�.
���� �ٿ�ε� �մϴ�.
*/

abstract class HttpServlet { // �߻� Ŭ����
	public abstract void service();
}

class LoginServlet extends HttpServlet { // �߻� Ŭ���� HttpServlet�� ��ӹ޴� LoginServlet Ŭ����
	// �θ� ������ X �޼ҵ常 ���� => �޼ҵ常 ���� �̿� ����	

	@Override
	public void service() {
	System.out.println("�α��� �մϴ�.");
	
	}
	
}

class FileDownloadServlet extends HttpServlet { // �߻� Ŭ���� HttpServlet�� ��ӹ޴� FileDownloadServlet Ŭ����
	// �θ� ������ X �޼ҵ常 ���� => �޼ҵ常 ���� �̿� ����	

	@Override
	public void service() {
		System.out.println("���� �ٿ�ε� �մϴ�.");
		
	}
	
	
}

public class AbstractMethod03 {

	public static void main(String[] args) {
		method(new LoginServlet());			// �α��� �մϴ�.
		method(new FileDownloadServlet());	// ���� �ٿ�ε� �մϴ�.

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
