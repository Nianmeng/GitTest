package pers.xuetang9.line.chapter5;

import java.util.Scanner;

/**
 * �¼۸���Ϸ
 * @author ����
 * @data 2019��7��19�� ����5:24:44
 */
public class GuessPrice {
	public static void main(String[] args) {
		int guessPrice;				//�û��µļ۸�
		final int price = 5000;		//Ҫ�²��������Ʒ�ĵļ۸�
		int num = 0;				//�û��²�Ĵ���
		char answer;				//�ж��û��Ƿ����ʸ����齱
		System.out.println("�����־ٰ��н��Żݻ�����ڱ��깺����һǧ�Ŀͻ���ƾ����СƱ��"
				+ "�����������Ʒ�۸��ý�Ʒ��");
		System.out.println("�������Ƿ��й�����һǧ��СƱ������/�ޣ�");
		Scanner input = new Scanner(System.in);
		answer = input.next().charAt(0);		//�����Ƿ��й���СƱ
		if(answer == '��') {
			for(int i = 0; i < 5; i++) {		//������ڳ����н�
				num++;		//ÿ��ѭ���齱������1
				System.out.println("�����������²�ļ۸񣨵�"+ num +"�Σ���");
				guessPrice = input.nextInt();	//�����û��²�ļ۸�
				if(guessPrice > price) {
					System.out.println("���²�ļ۸�ƫ����");
				}else if(guessPrice < price) {
					System.out.println("���²�ļ۸�ƫС��");
				}else {
					System.out.println("��ϲ��¶��ˣ���һ������" + num + "��");
					switch (num) {			//�ж��û����ʲô��Ʒ
					case 1:
						System.out.println("�������iPhone8S Plus Plus������һ̨��");
						break;
					case 2:
					case 3:
						System.out.println("������û�Ϊ��HUAWEI����ҫ�ֻ�zeroһ��");
						break;
					default:
						System.out.println("�������С�����������ഺ��һ��");
					}
				}
				if(num == 5 && guessPrice != price){	//���������λ�û�¶�
					System.out.println("��Ǹ�����²�Ĵ����Ѵ���Σ�û�л�ý�Ʒ�����´������ɣ�");
				}
				if(guessPrice == price)		//����¶��˽���ϵͳ
					System.exit(0);
			}
		}else {
			System.out.println("���Ĺ�����δ��һǧ�����ܲ���齱��");
		}
		input.close(); //�ͷ���Դ
	}
}
