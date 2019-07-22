package com.xuetang9.line.chapter2;
/**
 * 升级商场购物管理系统，实现购物结算功能
 * @author 念梦
 * @data 2019年7月11日 下午2:00:20
 *
 */
public class Shopping {
	public static void main(String[] args) {
		int shirtNum = 2;				//T恤的数量
		int tennisShoesNum = 1;			//网球鞋的数量
		int tennisRacketNum = 1;		//网球拍的数量
		double shirtPrice = 245;		//T恤的单价
		double tennisShoesPrice = 570;	//网球鞋的单价
		double tennisRacketPrice = 320;	//网球拍的单价
		double total;					//消费总金额
		total = 0.8 * (shirtPrice * shirtNum + tennisRacketNum * tennisRacketPrice + tennisShoesNum * tennisShoesPrice);
		System.out.println("消费总金额为：" + total);

	}

}
