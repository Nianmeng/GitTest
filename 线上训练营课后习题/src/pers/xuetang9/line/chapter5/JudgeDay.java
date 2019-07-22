package pers.xuetang9.line.chapter5;

import java.util.Scanner;

/**
 * ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ���
 * @author ����
 * @data 2019��7��18�� ����4:26:37
 */
public class JudgeDay {
	public static void main(String[] args) {
		int year;			//�û�Ҫ��������
		int month;			//�û�Ҫ������·�
		int day;			//�û�Ҫ���������
		int total = 0;		//��������һ��ĵڼ���
		boolean leapYear;	//�ж��Ƿ�Ϊ����
		System.out.println("��������ݣ�");
		Scanner input = new Scanner(System.in);
		//�ж��û�������Ƿ�Ϊ��������
		while(!input.hasNextInt()) {
			System.out.println("����������ֲ��Ϸ������������룺");
			input.next();
		}
		year = input.nextInt();		//¼���û���������
		//�ж��û����������Ƿ�Ϊ����
		if (year % 4 == 0 && year %100 != 0 ||year % 400 == 0) {
			leapYear = true;
		}else {
			leapYear = false;
		}
		System.out.println("�������·ݣ�");
		//�ж��û�������Ƿ�Ϊ��������
		while(!input.hasNextInt()) {
			System.out.println("����������ֲ��Ϸ������������룺");
			input.next();
		}
		month = input.nextInt();	//¼���û�������·�
		while(true) {				//�ж��·������Ƿ�Ϲ�
			if(month <= 0 || month > 12) {
				System.out.println("û������·ݣ����û��������룺");
				month = input.nextInt();
			}else {
				break;
			}
		}
		System.out.println("���������ӣ�");
		//�ж��û�������Ƿ�Ϊ��������
		while(!input.hasNextInt()) {
			System.out.println("����������ֲ��Ϸ������������룺");
			input.next();
		}
		day = input.nextInt();		//¼���û����������
		while(true) {				//�ж����������Ƿ�Ϲ�
			if(day <= 0 || day > 31) {
				System.out.println("û��������ӣ����û��������룺");
				day = input.nextInt();
			}else {
				break;
			}
		}
		if(leapYear) {			//���Ϊ����
			switch (month) {	//���������·ݽ����ۼ�����
			case 12:
				total += 30;
			case 11:
				total += 31;
			case 10:
				total += 30;
			case 9:
				total += 31;
			case 8:
				total += 31;
			case 7:
				total += 30;
			case 6:
				total += 31;
			case 5:
				total += 30;
			case 4:
				total += 31;
			case 3:
				total += 29;
			case 2:
				total += 31;
			case 1:
				total += day;
			}
		}else {					//�����������
			switch (month) {	//���������·ݽ����ۼ�����
			case 12:
				total += 30;
			case 11:
				total += 31;
			case 10:
				total += 30;
			case 9:
				total += 31;
			case 8:
				total += 31;
			case 7:
				total += 30;
			case 6:
				total += 31;
			case 5:
				total += 30;
			case 4:
				total += 31;
			case 3:
				total += 28;
			case 2:
				total += 31;
			case 1:
				total += day;
			}
		}
		System.out.println("���ã���һ������һ��ĵ�" + total + "��");
		System.out.println("��л��ʹ�ñ�ϵͳ�����������");
		input.close();		//�ͷ���Դ
	}
}
