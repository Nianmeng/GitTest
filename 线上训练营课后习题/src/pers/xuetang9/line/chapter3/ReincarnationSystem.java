package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * ����Ͷ̥ϵͳ
 * @author ����
 * @data 2019��7��15�� ����1:58:36
 */
public class ReincarnationSystem {
	public static void main(String[] args) {
		int num;			//���ǵ�ѡ��
		System.out.println(" * �����鸻���˼ҵ�������\n" + 
				" * �뿴͸������ķ�����\n" + 
				" * �������˽����ļ�����\n" + 
				" * ����Ҫ�ģ������ﶼ����ʵ�֣�\n" + 
				" * ���ס��ϵͳ�����֡�����������Ͷ̥ϵ�y\n");
		System.out.println("\t\t\t\t��ӭ��������Ͷ̥ϵͳ��");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("ĳ���ǣ���ҪͶ̥��");
		System.out.println("��ѡ���Ա�");
		System.out.println("1���У���ѣ�\t\t2��Ů��50�ң�");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		switch (num) {
		case 2:
			System.out.println("�������Ϊ0���޷�ѡ��");
			System.out.println("ϵͳ������ʾ��\n"
					+ "��ֵ����ʹ�����������ḻ��");
			System.out.println("1������Ҫ��\t\t2��ûǮ����");
			num = input.nextInt();
			System.out.println("��ѡ��");
			switch (num) {
			case 1:
				System.out.println("��Ǹ�������˻����Ϊ0");
			case 2:
				System.out.println("�������ˣ�ûǮ���䣡");
			}
		case 1:
			System.out.println("��ѡ�����������Ѷȣ�");
			System.out.println("1���򵥣�1W�ң�\t\t2���еȣ�5000�ң�\n"
					+ "3�����ѣ�1000�ң�\t\t4����Ԩ����ѣ�");
			num = input.nextInt();
			switch (num) {
			default:
				System.out.println("��Ǹ�������˻����㣡");
			case 4:
				System.out.println("��Ԩ��������ɣ��Ҿ�ϲ����ս�Ѷȡ�");
				System.out.println("��ѡ�����");
				System.out.println("1���Ұ�����gang��װ��10W��\t\t2����������5W��\n"
						+ "3���ٶ�����5W��\t\t4����������5W��\t\t5����ƣ���ѣ�");
				num = input.nextInt();
				switch (num) {
				default:
					System.out.println("��Ǹ�������˻����Ϊ0");
				case 5:
					System.out.println("��ȥ��զ����ô���Ǿ�����ɡ�");
					System.out.println("��ѡ���ܣ�");
					System.out.println("1��׬Ǯ��1W�ң�\t\t2�����ã�1W�ң�\t\t3�����գ�1W�ң�\n"
							+ "4��������1W�ң�\t\t5�����棨500�ң�\t\t6��ë�����ᣨ��ѣ�");
					num = input.nextInt();
					switch (num) {
					default:
						System.out.println("��Ǹ�������˻����㣡");
					case 6:
						System.out.println("����ô�󣬸�ë�ۣ�");
						System.out.println("��ѡ���ࣺ");
						System.out.println("1��˧����װ1��1W�ң�\n"
								+ "2��˧����װ2��1W�ң�\n"
								+ "3���������ѣ�");
						num = input.nextInt();
						switch (num) {
						default:
							System.out.println("��Ǹ�������˻����㣡");
						case 3:
							System.out.println("���������������ɣ�");
							System.out.println("��л��ʹ�����ǵ�ϵͳ������ʲô�õĽ�����");
							System.out.println("1����\t\t2����");
							System.out.println("��Ȼ������Ҫ���飡��");
							num = input.nextInt();
							input.close(); 		//�ͷ���Դ
							switch (num) {
							default:
								System.out.println("���ˣ�������һ��ƽ��ˡ�");
								System.out.println("��ϲ�㣬ת���ɹ���");
							case 1:
								System.out.println("�������ӵ��أ�����");
								System.out.println("�ǳ���л���Ľ��飬ϵͳ��������һ�׺����沿�̺ۣ����̳Ǽ�50�ң����Զ�װ����");
								System.out.println("�Ρ���ת���С���");
								System.out.println("��ϲ�㣬ת���ɹ���");
							}
						}
					}
				}
			}
		}
	}
}
