package pers.xuetang9.line.chapter5;
/**
 * 找出1000以内的所有完数
 * @author 念梦
 * @data 2019年7月18日 下午3:18:10
 */
public class PerfectNum {
	public static void main(String[] args) {
		int num = 1;		//表示1~1000的数字
		int sum = 0;		//保存累加和
		for(num = 1; num <= 1000; num++) {
			sum = 0;		//每次内循环前，和清零
			//在内循环中累加能整除的数字
			for(int i = 1; i <= num - 1; i++) {
				if(num % i == 0) {
					sum += i;	//累加能整除的数字
				}
			}
			//判断num和整除数字之和是否相等
			if(num == sum) {
				System.out.println("找到一个完数：" + num);
			}
		}
	}
} 

