package FallSleep;
/**
 * 用*号打印一个三层的圣诞树（代码越少越好）
 * @author 念梦
 * @data 2019年5月23日 下午10:09:54
 *
 */
public class wuersan {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++){
			for (int j = 3; j > i; j--) {
				System.out.printf(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
