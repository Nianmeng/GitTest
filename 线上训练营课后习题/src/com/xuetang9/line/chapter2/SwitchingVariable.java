package com.xuetang9.line.chapter2;
/**
 * С�������ֱַ��������ƣ�����10�ͺ���8���ֽ������е��ơ�
 * ����ģ�����
 * @author ����
 * @data 2019��7��11�� ����2:19:28
 *
 */
public class SwitchingVariable {
	public static void main(String[] args) {
		int leftCard = 10;		//����ǰ�����е�ֽ��
		int rightCard = 8;		//����ǰ�����е�ֽ��
		System.out.println("�������ǰ���е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�" + leftCard);
		System.out.println("�����е�ֽ�ƣ�" + rightCard);
		int temp;				//��ʱ����
		temp = leftCard;		//�������Ƹ�����ʱ����
		leftCard = rightCard;	//�������Ƹ��������Ʊ���
		rightCard = temp;		//����ʱ�������������Ʊ���
		System.out.println("������������е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�" + leftCard);
		System.out.println("�����е�ֽ�ƣ�" + rightCard);
	}
}
