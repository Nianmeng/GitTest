package com.xuetang9.line.chapter2;
/**
 * �����̳��������ϵͳ��ʵ�ֹ�����㹦��
 * @author ����
 * @data 2019��7��11�� ����2:00:20
 *
 */
public class Shopping {
	public static void main(String[] args) {
		int shirtNum = 2;				//T��������
		int tennisShoesNum = 1;			//����Ь������
		int tennisRacketNum = 1;		//�����ĵ�����
		double shirtPrice = 245;		//T���ĵ���
		double tennisShoesPrice = 570;	//����Ь�ĵ���
		double tennisRacketPrice = 320;	//�����ĵĵ���
		double total;					//�����ܽ��
		total = 0.8 * (shirtPrice * shirtNum + tennisRacketNum * tennisRacketPrice + tennisShoesNum * tennisShoesPrice);
		System.out.println("�����ܽ��Ϊ��" + total);

	}

}
