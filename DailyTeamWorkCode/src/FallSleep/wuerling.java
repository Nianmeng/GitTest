package FallSleep;

import java.util.Scanner;

/**
 * Ҫ���û�����5����������
 * �����5���������е����ֵ�ŵ���һλ����Сֵ�ŵ����һλ��
 * @author ����
 * @data 2019��5��20�� ����11:28:54
 *
 */
public class wuerling {
	public static void main(String[] args) {
		final int N = 5;							//���ó���N Ϊ5
		Scanner input = new Scanner(System.in);
		int[] num = new int[N];						//Ϊ����num����5��int���͵Ŀռ�
		System.out.println("�����������������");
		for (int i = 0; i < N; i++) {
			num[i] = input.nextInt();				//ѭ��¼���û����������
		}
		for (int i = 0; i < num.length; i++) {
			int max = num[i];						//�����i��ֵΪ���ֵ
			int maxIndex = i;						//���ֵ���±�Ϊi
			for (int j = i + 1; j < num.length; j++) {
				if(max < num[j]){					//�����j��ֵ����max��max��ֵ���±���Ϊnum[j]��j
					max = num[j];
					maxIndex = j;
				}
			}
			int temp = num[i];						//����һ����ʱ����temp�������ҳ������ֵ��num[i]��������
			num[i] = num[maxIndex];
			num[maxIndex] = temp;
		}
		System.out.println("����������Ϊ��");
		for (int i = 0; i < num.length; i++) {		//��ӡ�ɴ�С����������
			System.out.print(num[i]+"\t");
		}
	}
}
