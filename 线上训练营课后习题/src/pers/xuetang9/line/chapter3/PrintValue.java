package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * �Ӽ�������3���������ֱ𸳸����ͱ���a��b��c��
 * Ȼ��������������մ�С�����˳����ڱ���a��b��c�У�
 * ���������������ֵ��
 * @author ����
 * @data 2019��7��14�� ����3:18:59
 */
public class PrintValue {
	public static void main(String[] args) {
		int a,b,c;		//�Ӽ����������������
		int temp;		//���ڽ������ֵ���ʱ����
		System.out.println("����������������ֵ��");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();	//�Ӽ�������ĵ�һ������
		b = input.nextInt();	//�Ӽ�������ĵڶ�������
		c = input.nextInt();	//�Ӽ�������ĵ���������
		input.close();			//�ͷ���Դ
		if (a > b) {			//�����һ�������ڵڶ������򽻻� 
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {			//����ڶ��������ڵ��������򽻻�
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {			//�����һ�������ڵڶ������򽻻�
			temp = a;
			a = b;
			b = temp;
		}
		System.out.printf("����������ֵ�ֱ�Ϊ��%d\t%d\t%d" , a , b , c);
	}
}
