package pers.xuetang9.line.chapter4;

import java.util.Scanner;

/**
 * �ж�һ�����ܱ�����9����
 * @author ����
 * @data 2019��7��17�� ����12:59:30
 */
public class JudgeExactDivision {
	public static void main(String[] args) {
		int num;			//�û�Ҫ���������
		int numNine = 0;	//�ܱ�����9�����ĸ���

		System.out.println("������һ��������");
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) {
			System.out.println("��������ֲ������ͣ����������룺");
			//hasNextInt�жϲ������ͺ󣬻����л��Ǵ����û����������
			//����ٴ�ʹ��hasNextInt..�жϣ��Ի�ó��������͵Ľ��
			//���������ﵥ��ʹ��input.next()���Ա㽫���������
			input.next(); 
		}
		num = input.nextInt();
		System.out.println("����������������ǣ�" + num);
		while (num >= 9 || num <= -9) {		//ѭ���ж�
			if(num % 9 == 0) {				//�ж��Ƿ��ܱ�9����	
				numNine++;					//�ۼ���
			}
			num /= 9;						//ѭ������
		}
		System.out.println("����ܱ�" + numNine + "��9����");
        input.close();			//�ͷ���Դ
	}
}
