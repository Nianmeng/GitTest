package Java2;

public class CalcMoney {

	public static void main(String[] args) {
		//ȷ��ѭ������
		int year = 2015;		//���
		double money = 8000;	//���׶�
		while(money <= 2000){
			year++;
			money = money * (1 + 0.25);
		}
		String str = String.format("%d�꣬���׶�ﵽ2000��(%.2f��Ԫ)", year, money);
		System.out.println(str);

	}

}
