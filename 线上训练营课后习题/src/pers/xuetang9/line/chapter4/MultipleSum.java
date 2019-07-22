package pers.xuetang9.line.chapter4;
/**
 * 编程计算1至50中是7的倍数的数值之和
 * @author 念梦
 * @data 2019年7月17日 下午12:38:10
 */
public class MultipleSum {
	public static void main(String[] args) {
		int i = 1;		//循环变量
		int sum = 0;	//计算数值之和
		while(i <= 50) {
			if(i % 7 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1~50中7的倍数的数值之和为：" + sum);
	}
}
