package pers.xuetang9.line.chapter4;

import java.util.Scanner;

/**
 * �Ӽ�������һ��������������1-7ʱ����ʾ��Ӣ����д
 * ��������������ʾ�û��������룬��������0ʱ��������
 * @author ����
 * @data 2019��7��17�� ����7:45:07
 */
public class JudgeWeek {
	public static void main(String[] args) {
		int num;	//�û����������
		System.out.println("��Ӽ���������һλ��������������0�˳�����");
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) {		//�ж��û�������Ƿ�������
			System.out.println("��������ֲ������ͣ����������룺");
			input.next(); 					//�������
		}
		num = input.nextInt();
		while(num != 0) {			//��numΪ0ʱ�˳�����
			switch (num) {
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 7:
				System.out.println("SUN");
				break;
			default:
				System.out.println("��������ֲ��Ϸ������������룺");
				break;
			}
			num = input.nextInt();				//���¶�ȡ�û�����
		}
		input.close(); 				//�ͷ���Դ
	}
}
