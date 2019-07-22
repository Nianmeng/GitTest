package Java2;

import java.util.Scanner;

/**
 * 使用循环实现简单的 
 * @author 念梦
 * @data 2019年4月14日 下午1:38:50
 *
 */
public class KingOfFighter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";	//用户输入的是否继续
		String name = null;
		do{
			System.out.println("欢迎来到念梦的武侠世界，请大侠起一个响当当的名字！");
			name = input.nextLine();
			System.out.println("头衔：【初入江湖】");
			System.out.println("江湖名号：" + name);
			System.out.println(name + "大侠，满意您的江湖名号吗？(y/n)");
			answer = input.nextLine();
		}while(!"y".equalsIgnoreCase(answer));
		System.out.printf("【%s】大侠重入江湖，宵小之辈速速退避！", name);
	}

}
