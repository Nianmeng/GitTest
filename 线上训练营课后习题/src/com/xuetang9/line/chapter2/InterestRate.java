package com.xuetang9.line.chapter2;

import java.util.Scanner;

/**
 * �������е���Ӧ֧���ı�Ϣ��
 * @author ����
 * @data 2019��7��11�� ����3:21:56
 *
 */
public class InterestRate {
	public static void main(String[] args) {
		float money;				//�������еı���
		float interest1 = 0.0225f;	//��������һ���������
		float interest2 = 0.027f;	//�������������������
		float interest3 = 0.0324f;	//�������������������
		float interest5 = 0.036f;	//�������������������
		float total1;				//һ�������Ӧ֧���ı�Ϣ��
		float total2;				//���������Ӧ֧���ı�Ϣ��
		float total3;				//���������Ӧ֧���ı�Ϣ��
		float total5;				//���������Ӧ֧���ı�Ϣ��
		System.out.println("��������Ҫ�������еĽ�");
		Scanner input = new Scanner(System.in);
		money = input.nextFloat();
		input.close();
		total1 = money * (1 + interest1);
		total2 = money * (1 + interest2);
		total3 = money * (1 + interest3);
		total5 = money * (1 + interest5);
		System.out.println("һ���Ϣ��Ϊ��" + total1);
		System.out.println("�����Ϣ��Ϊ��" + total2);
		System.out.println("�����Ϣ��Ϊ��" + total3);
		System.out.println("�����Ϣ��Ϊ��" + total5);
	}
}
