package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * ��һ��������5λ��������
 * 1��������Ǽ�λ��
 * 2���ֱ��ӡÿһλ������
 * @author ����
 * @data 2019��7��14�� ����6:20:49
 */
public class Number {
	public static void main(String[] args) {
		int num;				//�û�Ҫ���������
		int numCount;			//�û��������ֵ�λ��
		int unitsDigit;			//��λ��
		int tensDigit;			//ʮλ��
		int hundredsDigit;		//��λ��
		int thousandDigit;		//ǧλ��
		int tenThounsandDigit;	//��λ��
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ��������֣�");
		num = input.nextInt();	//�û���������
		input.close();			//�ͷ���Դ
		String nums = num + "";	//ת��Ϊ�ַ���
		numCount = nums.length();	//��ȡ���ֵĳ���
		if (numCount > 5) {			//�ж��û�����������Ƿ�Ϸ�
			System.out.println("����������ֲ��Ϸ���ϵͳ�Զ��˳���");
			System.exit(0);			//������Ϸ��˳�����
		}
		System.out.println("���������ֵ�λ��Ϊ��" + numCount);
		switch (numCount) {			//�ж�ÿһλ�ϵ������Ƕ���
		case 5:
			tenThounsandDigit = num / 10000;
			System.out.println("��λ�ϵ�����Ϊ��" + tenThounsandDigit);
		case 4:
			thousandDigit = num / 1000 % 10;
			System.out.println("ǧλ�ϵ�����Ϊ��" + thousandDigit);
		case 3:
			hundredsDigit = num / 100 % 10;
			System.out.println("��λ�ϵ�����Ϊ��" + hundredsDigit);
		case 2:
			tensDigit = num / 10 % 10;
			System.out.println("ʮλ�ϵ�����Ϊ��" + tensDigit);
		case 1:
			unitsDigit = num % 10;
			System.out.println("��λ�ϵ�����Ϊ��" + unitsDigit);
		default:
			break;
		}
	}
}
