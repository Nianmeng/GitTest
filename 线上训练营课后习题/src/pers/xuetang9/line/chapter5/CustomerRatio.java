package pers.xuetang9.line.chapter5;

import java.util.Scanner;

/**
 * �̳�Ϊ������۶��Ҫ�Թ˿͵������Σ�30��֮�ϻ�֮�£�
 * ���е��飨����10�Σ���������������εĹ˿ͱ���
 * @author ����
 * @data 2019��7��18�� ����8:03:12
 */
public class CustomerRatio {
	public static void main(String[] args) {
		int age;			//�˿͵�����
		int bigAge = 0;		//����30�������
		int smallAge = 0;	//С��30�������
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("�������" + (i + 1) + "λ�˿͵����䣺");
			while(!input.hasNextInt()) {	//�ж������Ƿ�Ϸ�
				System.out.println("����������䲻�Ϸ������������룺");
				input.next();		//�建��
			}
			age = input.nextInt();	//����˿͵�����
			if(age < 0) {			//����������Ϊ����ʱ
				System.out.println("0�����£����ڶ��������ٸ���һ��ѡ��Ļ���!");
				i--;				//ѭ��������һ
				continue;			//��������ѭ��
			}
			if(age > 30) {
				bigAge++;			//���˿��������30ʱ����bigAge +1
			}else if (age < 30) {
				smallAge++;			//���˿�����С��30ʱ����smallAge +1
			}else {					//���˿��������30ʱ������
				System.out.println("�����������Ϊ30����ϵͳ���Զ����ԣ�");
			}
		}
		System.out.println("30��֮�ϵĹ˿���30��֮�µĹ˿͵ı���Ϊ��"
				+ bigAge + " : " + smallAge);
		input.close();		//�ͷ���Դ
	}
}
