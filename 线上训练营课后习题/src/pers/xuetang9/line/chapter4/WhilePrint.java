package pers.xuetang9.line.chapter4;
/**
 * 使用循环输出：100，95，90，85 … 5
 * @author 念梦
 * @data 2019年7月17日 上午12:35:33
 */
public class WhilePrint {
	public static void main(String[] args) {
		int i = 100;			//声明循环变量并赋初值为100
		while(i >= 5) {			//当i大于等于5时执行语句块
			System.out.print(i + " ");	//打印数字
			i -= 5;						//循环更新
		}
	}
}
