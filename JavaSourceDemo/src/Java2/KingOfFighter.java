package Java2;

import java.util.Scanner;

/**
 * ʹ��ѭ��ʵ�ּ򵥵� 
 * @author ����
 * @data 2019��4��14�� ����1:38:50
 *
 */
public class KingOfFighter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";	//�û�������Ƿ����
		String name = null;
		do{
			System.out.println("��ӭ�������ε��������磬�������һ���쵱�������֣�");
			name = input.nextLine();
			System.out.println("ͷ�Σ������뽭����");
			System.out.println("�������ţ�" + name);
			System.out.println(name + "�������������Ľ���������(y/n)");
			answer = input.nextLine();
		}while(!"y".equalsIgnoreCase(answer));
		System.out.printf("��%s���������뽭������С֮�������˱ܣ�", name);
	}

}
