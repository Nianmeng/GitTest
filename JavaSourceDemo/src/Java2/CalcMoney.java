package Java2;

public class CalcMoney {

	public static void main(String[] args) {
		//确定循环变量
		int year = 2015;		//年份
		double money = 8000;	//交易额
		while(money <= 2000){
			year++;
			money = money * (1 + 0.25);
		}
		String str = String.format("%d年，交易额达到2000亿(%.2f亿元)", year, money);
		System.out.println(str);

	}

}
