package com.xuetang9.line.chapter2;

import java.util.Scanner;

/**
 * ��д����ʵ�ֽ������¶�ת��Ϊ�����¶Ȳ���ʾ
 * �ӿ���̨¼���¶���Ϣ
 * @author ����
 * @data 2019��7��11�� ����2:48:26
 *
 */
public class Temperature {
	public static void main(String[] args) {
		double fahrenheit;		//�����¶�
		double centigrade;		//�����¶�
		Scanner input = new Scanner(System.in);
		System.out.println("�����뵱ǰ�Ļ����¶ȣ�");
		fahrenheit = input.nextDouble();
		input.close();
		centigrade = (fahrenheit - 32) * 5 / 9;
		System.out.println("��ǰ���¶�Ϊ��\t" + centigrade + "��");
		System.out.println("\t\t" + fahrenheit + "�H");
	}
}
