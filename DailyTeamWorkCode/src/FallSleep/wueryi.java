package FallSleep;

import java.util.Scanner;

/**
 * ���ڸ����������飬����A������B�����û�������ֵ��
 * ������������кϲ����ϲ�������C��
 * �������У�������ͬ��ֵ��ֻ����һ��
 * @author ����
 * @data 2019��5��21�� ����7:59:01
 *
 */
public class wueryi {
	public static void main(String[] args) {
		int j = 0;		//����B�ı����±�
		int num1;		//����A�ĳ���
		int num2;		//����B�ĳ���
		int num3;		//����C�ĳ���
		double temp;	//��ʱ����
		int deleteIndex;//Ҫɾ���������±�
		int count = 0;	//����
		Scanner input = new Scanner(System.in);
		System.out.println("������������A��Ҫ��������ֵĸ�����");
		num1 = input.nextInt();
		double[] A = new double[num1];
		System.out.println("������Ҫ������A����������֣�");
		for (int i = 0; i < A.length; i++) {
			A[i] = input.nextDouble();
		}
		System.out.println("������������B��Ҫ��������ֵĸ�����");
		num2 = input.nextInt();
		double[] B = new double[num2];
		System.out.println("������Ҫ������B����������֣�");
		for (int i = 0; i < B.length; i++) {
			B[i] = input.nextDouble();
		}
		num3 = num1 + num2;
		double[] C = new double[num3];
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i];
		}
		for (int i = A.length; i < C.length; i++) {
			C[i] = B[j];
			j++;
		}
		System.out.println("����ǰ����C�е�����Ϊ��");
		for (int i = 0; i < C.length; i++) {
			System.out.printf(C[i] + "\t");
		}
		for (int i = 0; i < C.length - 1; i++) {
			for (int k = 0; k < C.length - i - 1; k++) {
				if(C[k] > C[k + 1]){		//ð����������
					temp = C[k];
					C[k] = C[k + 1];
					C[k + 1] = temp;
				}
			}
		}
		System.out.println("���������C�е�����Ϊ��");
		for (int i = 0; i < C.length; i++) {
			System.out.printf(C[i] + "\t");
		}
		for (int i = 0; i < C.length - 1; i++) {
			if(C[i] == C[i + 1]){			//���ǰ�������������
				deleteIndex = i + 1;
				count++;
				for (int k = deleteIndex; k < num3 - count; k++) {
					C[k] = C[k + 1];		//ѭ��������һ��������ǰ��һ����
				}
			}
		}
		System.out.println("����ɾ����ͬ���ֺ�����C�е�����Ϊ��");
		for (int i = 0; i < num3 - count / 2; i++) {
			System.out.printf(C[i] + "\t");
		}
	}
}
