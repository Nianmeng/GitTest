package Java5;

import java.util.Scanner;

/**
 * ��������Ϸ
 * @author ����
 * @data 2019��4��14�� ����11:53:55
 *
 */
public class GuessDemo {
	public static void main(String[] args) {
		//�û�Ҫ�µ�����
		//�û�Ҫ�µĴ���
		final int price = 5000;	//����,���ܸ���
		int guessPrice = -1;
		int count = 0;			//�û��µĴ���
		for (int i = 0; i < 5; i++) {
			System.out.println("������������Ʒ�ĵ��ۣ�(" + ++count + "��)");
			guessPrice = new Scanner(System.in).nextInt();
		}
		
	}
}
