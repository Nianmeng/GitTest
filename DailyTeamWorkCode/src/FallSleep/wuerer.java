package FallSleep;

import java.util.Scanner;

/**
 * �����û��������ֵ����ӡ���������
 * @author ����
 * @data 2019��5��22�� ����8:44:07
 *
 */
public class wuerer {
	public static void main(String[] args) {
		System.out.println("������Ҫ��ӡ������ǵĲ�����");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int row1 = row;
		int[][] a = new int[row][row];	//�������飬����ռ�
		for(int i = 0; i < row; i++)
		{
			System.out.printf("%" + (8 * row1 / 2) + "c", ' ');//��ӡ�ո�
			row1--;	//���εݼ�
			for(int j = 0; j <= i; j++)
			{
				if(j == 0 || j == i)	//ÿһ�е�һλ�����һλ����Ϊ1
				{
					a[i][j] = 1;
				}
				else
				{
					a[i][j] = a[i-1][j] + a[i-1][j-1];	//����Ϊ��һ���������
					
				}
				System.out.printf("%-8d", a[i][j]);		//��ӡ��ֵ
			}
			System.out.println();
		}	
		
		
	}
}
