package pers.xuetang9.line.chapter4;

import java.util.Scanner;

/**
 * ����һ��������������е����ֵ����Сֵ����������0����ѭ��
 * @author ����
 * @data 2019��7��17�� ����5:12:51
 */
public class JudegSize {
	public static void main(String[] args) {
		int maxNum = 0;		//��������ֵ
		int minNum = 0;		//�������Сֵ
		int num;			//�û��������
		int temp = 0;		//��ʱ����
		int count = 0;		//����
		System.out.println("������һ����������������0�˳���");
		Scanner input = new Scanner(System.in);
		while((num = input.nextInt()) != 0) {		//�û�ѭ������
			count++;						//������
			if(count == 1) {				//�������Ϊһʱ
				minNum = num;				//�����ָ������ֵ
				maxNum = num;				//�����ָ�����Сֵ
			}
			if(count == 2) {				//�������Ϊ2ʱ
				temp = num;					//�����ָ�����ʱ����
			}
			if(count > 1) {					//�������������1ʱ
				if(temp < minNum) {			//���¸���������Сֵʱ
					minNum = temp;			//���¸���������Сֵ
				}
				if(temp > maxNum) {			//���¸����������ֵʱ
					maxNum = temp;			//���¸����������ֵ
				}
				temp = num;					//���¸���������ʱ����
			} 
		}
		System.out.println(minNum + "\t" + maxNum);
		input.close(); 			//�ͷ���Դ
	}
}
