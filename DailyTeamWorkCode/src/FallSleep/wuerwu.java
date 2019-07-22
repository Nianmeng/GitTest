package FallSleep;

import java.util.Scanner;
/**
 * 用户输入十个分数，然后程序去掉最高分和最低分后求平均分，保留一位小数。
 * @author 念梦
 * @data 2019年5月27日 下午12:56:07
 *
 */
public class wuerwu {
	public static void main(String[] args) {
		final int N = 10;			//数组空间常量
		double sum = 0;				//数之和
		double avg = 0;				//数的平均值
		double[] grands = new double[N];	//声明数组，分配空间
		Scanner input = new Scanner(System.in);
		System.out.println("请输入十个分数：");
		for (int i = 0; i < N; i++) {		//循环录入十个分数
			grands[i] = input.nextDouble();
		}
		for (int i = 0; i < grands.length - 1; i++) {			//由小到大冒泡排序
			for (int j = 0; j < grands.length - i - 1; j++) {
				if(grands[j] > grands[j + 1]){
					double temp = grands[j];
					grands[j] = grands[j + 1];
					grands[j + 1] = temp;
				}
			}
		}
		System.out.println("您输入的十个分数由小到大排列为：");
		for (int i = 0; i < grands.length; i++) {		//显示排序后的数字
			System.out.printf("%.1f\t", grands[i]);
		}
		for (int i = 0; i < grands.length - 1; i++) {	//将最小值排到最后
			grands[i] = grands[i + 1];
		}
		System.out.printf("\n去除一个最大值和一个最小值后的数为：\n");
		for (int i = 0; i < grands.length - 2; i++) {	//打印去除最大值和最小值后的值
			System.out.printf("%.1f\t", grands[i]);
			sum += grands[i];							//计算数的和
		}
		avg = sum / 8.0;								//计算数的平均值
		System.out.printf("\n程序去掉最高分和最低分后求得平均分的值为：%.1f", avg);
	}
}

