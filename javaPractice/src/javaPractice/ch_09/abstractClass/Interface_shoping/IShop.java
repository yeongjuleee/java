package javaPractice.ch_09.abstractClass.Interface_shoping;

// ���θ� �԰��� ������ �������̽�, ��� ���θ��� IShop �������̽��� �����ؾ� ��
public interface IShop {
	// ���θ� Ŭ������ ������ �� �Բ� �����ؾ� �ϴ� �߻� �޼ҵ�
	public abstract void setTitle(String title);	// ���θ� ����(�̸�) ����
	public abstract void  genUser();				// ���θ��� �̿��� �� �ִ� ���� ����ڵ� ����
	public abstract void  genProduct();				// ���θ��� ���� ��ǰ�� ����
	public abstract void  start();					// ���θ� ���α׷��� �����ϴ� ���� �޼ҵ�

}
