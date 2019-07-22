package pers.xuetang9.line.chapter5;
/**
 * 打印九九乘法表
 * @author 念梦
 * @data 2019年7月18日 下午6:03:57
 */
public class MultiplicationTable {
	public static void main(String[] args) {
		int i;				//外部循环变量
		int j;				//内部循环变量
		int result;			//数乘结果
		for(i = 1; i <= 9; i++) {		//外循环控制行
			for(j = 1; j <= i; j++) {	//内循环控制列
				result = i * j;			//计算结果
				System.out.print(j + "*" + i + "=" + result + "\t");	//输出打印
			}
			System.out.println();	//换行
		}
	}
}
