package FallSleep;

import java.util.Scanner;

/**
 * 要求用户输入5个正整数，
 * 程序把5个正整数中的最大值放到第一位，最小值放到最后一位。
 * @author 念梦
 * @data 2019年5月20日 下午11:28:54
 *
 */
public class wuerling {
	public static void main(String[] args) {
		final int N = 5;							//设置常量N 为5
		Scanner input = new Scanner(System.in);
		int[] num = new int[N];						//为数组num分配5个int类型的空间
		System.out.println("请输入五个正整数：");
		for (int i = 0; i < N; i++) {
			num[i] = input.nextInt();				//循环录入用户输入的数字
		}
		for (int i = 0; i < num.length; i++) {
			int max = num[i];						//假设第i个值为最大值
			int maxIndex = i;						//最大值的下标为i
			for (int j = i + 1; j < num.length; j++) {
				if(max < num[j]){					//如果第j个值大于max则将max的值和下标置为num[j]和j
					max = num[j];
					maxIndex = j;
				}
			}
			int temp = num[i];						//声明一个临时变量temp，将查找出的最大值于num[i]交换排序
			num[i] = num[maxIndex];
			num[maxIndex] = temp;
		}
		System.out.println("排序后的数字为：");
		for (int i = 0; i < num.length; i++) {		//打印由大到小排序后的数字
			System.out.print(num[i]+"\t");
		}
	}
}
