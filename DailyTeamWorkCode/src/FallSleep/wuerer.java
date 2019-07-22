package FallSleep;

import java.util.Scanner;

/**
 * 根据用户输入的数值，打印杨辉三角形
 * @author 念梦
 * @data 2019年5月22日 下午8:44:07
 *
 */
public class wuerer {
	public static void main(String[] args) {
		System.out.println("请输入要打印杨辉三角的层数：");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int row1 = row;
		int[][] a = new int[row][row];	//声明数组，分配空间
		for(int i = 0; i < row; i++)
		{
			System.out.printf("%" + (8 * row1 / 2) + "c", ' ');//打印空格
			row1--;	//依次递减
			for(int j = 0; j <= i; j++)
			{
				if(j == 0 || j == i)	//每一行第一位和最后一位数字为1
				{
					a[i][j] = 1;
				}
				else
				{
					a[i][j] = a[i-1][j] + a[i-1][j-1];	//否则为上一行俩数相加
					
				}
				System.out.printf("%-8d", a[i][j]);		//打印数值
			}
			System.out.println();
		}	
		
		
	}
}
