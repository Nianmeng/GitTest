package FallSleep;

import java.util.Scanner;

/**
 * ���һ�����дʹ��˳�����ʾ�û�����һ���ַ���Ȼ�����д��滻Ϊ*�š�
 * �����дʣ����������ʡ���ŭ�����衢̰������ʳ��ɫ����
 * @author ����
 * @data 2019��5��29�� ����8:50:10
 *
 */
public class wuerjiu {
	public static void main(String[] args) {
		String[] sensitive = {"����", "����", "��ŭ", "����", "̰��", "��ʳ", "ɫ��"};
		System.out.println("������һ���ַ�����");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();					//��ȡ�û�������ַ���
		for (int i = 0; i < sensitive.length; i++) {	//ѭ�������滻
			str = str.replace(sensitive[i], "**");
		}
		System.out.println(str);						//����滻������
	}
}
