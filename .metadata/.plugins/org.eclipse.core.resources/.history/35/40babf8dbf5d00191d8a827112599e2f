package Java2;
/**
 * 将给定的钱数分成 较小货币单位
 * @author 念梦
 * @data 2019年4月13日 下午2:34:27
 *
 */
import java.util.Scanner;
public class RMB {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入小钱钱的数量：");
		double money = input.nextDouble();
		
		//处理元部分
		int yuan = (int)money;
		int numOfShiYuan = yuan / 10;
		int numOfWuYuan = yuan % 10 / 5;
		int numOfYiYuan = yuan % 10 - 5;
		
		int jiao = ((int)(money * 10)) % 10;
		int numOfWuJiao = jiao / 5;
		int numOfYiJiao = jiao - 5;
		
		System.out.println(numOfShiYuan);
		System.out.println(numOfWuJiao );
	}

}
