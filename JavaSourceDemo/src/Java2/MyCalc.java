package Java2;

import java.util.Scanner;

/**
 * ʵ�ּ򵥵ļ��������ܣ��Ӽ��˳�ȡģ
 * @author ����
 * @data 2019��4��14�� ����7:17:18
 *
 */
public class MyCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2,result;	//������������һ���������
		String op = "";				//���������ֵΪ���ַ���
		String choice = null;		//�û���ѡ���Ƿ����
		do{
			System.out.println("����������������");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.print("�������������");
			op = input.next();
			//������������жϣ�������Ӧ�ļ���
			switch (op) {
			case "+":
				result = num1 + num2;
				break;

			default:
				break;
			}
			System.out.print("�Ƿ�������㣿(y/)");
			choice = input.next();
		}while("y".equalsIgnoreCase(choice));

	}

}
