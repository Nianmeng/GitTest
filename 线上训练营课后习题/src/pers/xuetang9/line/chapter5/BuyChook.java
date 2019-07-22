package pers.xuetang9.line.chapter5;
/**
 * 买一只鸡需要5元，买一只母鸡需要3元，买三只小鸡需要1元。
 * 问花100元买100只鸡，共有多少种买法？
 * @author 念梦
 * @data 2019年7月19日 上午8:36:46
 */
public class BuyChook {
	public static void main(String[] args) {
		int num;		//鸡的个数
		int price;  	//需要钱数
		int count = 0;	//计数
		for (int i = 0; i < 100 / 5; i++) {				//公鸡数量范围
			for(int j = 0; j < 100 / 3; j++) {			//母鸡数量范围
				for(int k = 0; k < 100; k += 3) {		//小鸡数量范围
					num = i + j + k;					//每次循环总的鸡的数量
					price = i * 5 + j * 3 + k / 3;		//总的鸡的价格
					if(num == 100 && price == 100) {	//当满足鸡的数量与价格都为100时
						count++;						//计数加1
						System.out.println("公鸡"+i+"只，母鸡"+j+"只，小鸡"+k+"只");
					}
				}
			}	
		}
		System.out.println("总共有"+count+"种买法");
	}
}
