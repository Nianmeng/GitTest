package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * ʹ��if�ṹ�ж�ʵ���Ƿ��ܰᶯ����
 * @author ����
 * @data 2019��7��14�� ����1:38:59
 */
public class MoveDask {
	public static void main(String[] args) {
		int age;	//�û�������
		String sex;	//�û����Ա�
		System.out.println("�������������䣺");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();			//�û���������
		if(age < 0) {
			System.out.println("��Ǹ�����䲻��Ϊ������ϵͳ�Զ��˳���");
			System.exit(0);				//�˳�ϵͳ
		}else if(age < 5) {
			System.out.println("��Ǹ������̫С���᲻��������ӣ�");
			System.exit(0);				//�˳�ϵͳ
		}else if(age >= 7) {
			System.out.println("�����԰ᶯ���ӣ�");
			System.exit(0);				//�˳�ϵͳ
		}
		System.out.println("�����������Ա��� / Ů����");
		sex = input.next();				//��ȡ�û�������ַ���
		input.close();					//�ͷ���Դ
		if (age >= 5 && "��".equals(sex))		//�ж��û��Ƿ���԰ᶯ����
			System.out.println("�����ڿ��Ǹ�С���Ӻ��ˣ����԰ᶯ������ӵģ�");				
		else if (age >= 5 && "Ů".equals(sex))
			System.out.println("������ӿɲ���������ô������Ů�����ܰ�ö��ģ�");
		else
			System.out.println("�Ա����벻�Ϸ�Ŷ��ϵͳ�˳���");
	}
}
