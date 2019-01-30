package exception;

/**
 * 0 ���� �������� �õ��� ���� ��
 * �߻���ų ���ܸ� �����ϴ� Ŭ����
 * ------------------------------------
 * ��� ���� Ŭ������ �Ϲ� Ŭ������ �����ϰ� ���� ����
 * ------------------------------------
 * ���� Ŭ���� ���ǽ� ���� ��
 * 1. ��� ����, ������, �޼ҵ� ���Ǵ� ����
 * 2. Exception Ŭ������ �ݵ�� ���
 * 3. ���� Ŭ������ �̸��� �ݵ�� Exception ���� �������� �Ͽ�
 *    �� Ŭ������ ���� Ŭ�������� ����
 * ------------------------------------
 * ���� ��ü�� ���� ���� ��
 * 1. new �� �����ϴ� �� ����     
 * 2. new �� ������ 
 *    throw (������) �߻� ���Ѿ� �� 
 * 
 * @author PC38206
 *
 */
public class DivideZeroException extends Exception {

	// 1. ��� ���� �����
	private String reason;
	
	// 2. ������ �����
	// (1) �Ű������� ���� �⺻ ������ : �߻� ������ ���� �Ҵ�
	public DivideZeroException() {
		this.reason = "0���� �������� �õ��� �ֽ��ϴ�.";
	}
	
	// (2) �Ű������� �ִ� ������ : �߻� ������ �ܺο��� ���޹���
	public DivideZeroException(String reason) {
		this.reason = reason;
	}

	// 3. �޼ҵ� �����
	@Override
	public String toString() {
		return this.reason;
	}
	
}