package Java2;

import java.util.Scanner;

/**
 * 根据角色的内力值打印角色的能力描述
 * @author 念梦
 * @data 2019年4月13日 下午3:42:39
 *
 */
public class ShoppingDemmo {
	public static void main(String[] args){
		String info = null;	//角色信息
		Scanner input = new Scanner(System.in);
		System.out.println("请输入角色的内力值：");
		int power = input.nextInt();
		if(power >= 0 && power < 1000){
			info = "不堪一击";
		}else if(!(power < 1000 || power > 3000)){
			info = "毫不足虑";
		}
		System.out.println("雁南飞大侠" + info);
	}
}
