package FallSleep;

import java.util.Scanner;

/**
 * 现在给出两个数组，数组A和数组B，由用户输入数值。
 * 将两个数组进行合并，合并成数组C。
 * 升序排列，如有相同数值，只保留一个
 * @author 念梦
 * @data 2019年5月21日 下午7:59:01
 *
 */
public class wueryi {
	public static void main(String[] args) {
		int j = 0;		//数组B的变量下标
		int num1;		//数组A的长度
		int num2;		//数组B的长度
		int num3;		//数组C的长度
		double temp;	//临时变量
		int deleteIndex;//要删除的数字下标
		int count = 0;	//计数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入在数组A中要输入的数字的个数：");
		num1 = input.nextInt();
		double[] A = new double[num1];
		System.out.println("请输入要在数组A中输入的数字：");
		for (int i = 0; i < A.length; i++) {
			A[i] = input.nextDouble();
		}
		System.out.println("请输入在数组B中要输入的数字的个数：");
		num2 = input.nextInt();
		double[] B = new double[num2];
		System.out.println("请输入要在数组B中输入的数字：");
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
		System.out.println("排序前数组C中的数字为：");
		for (int i = 0; i < C.length; i++) {
			System.out.printf(C[i] + "\t");
		}
		for (int i = 0; i < C.length - 1; i++) {
			for (int k = 0; k < C.length - i - 1; k++) {
				if(C[k] > C[k + 1]){		//冒泡排序升序
					temp = C[k];
					C[k] = C[k + 1];
					C[k + 1] = temp;
				}
			}
		}
		System.out.println("排序后数组C中的数字为：");
		for (int i = 0; i < C.length; i++) {
			System.out.printf(C[i] + "\t");
		}
		for (int i = 0; i < C.length - 1; i++) {
			if(C[i] == C[i + 1]){			//如果前后两个数字相等
				deleteIndex = i + 1;
				count++;
				for (int k = deleteIndex; k < num3 - count; k++) {
					C[k] = C[k + 1];		//循环将后面一个数覆盖前面一个数
				}
			}
		}
		System.out.println("排序删除相同数字后数组C中的数字为：");
		for (int i = 0; i < num3 - count / 2; i++) {
			System.out.printf(C[i] + "\t");
		}
	}
}
