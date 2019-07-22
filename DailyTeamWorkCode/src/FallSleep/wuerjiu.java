package FallSleep;

import java.util.Scanner;

/**
 * 设计一个敏感词过滤程序，提示用户输入一串字符，然后将敏感词替换为*号。
 * （敏感词：傲慢、嫉妒、暴怒、懒惰、贪婪、暴食、色欲）
 * @author 念梦
 * @data 2019年5月29日 下午8:50:10
 *
 */
public class wuerjiu {
	public static void main(String[] args) {
		String[] sensitive = {"傲慢", "嫉妒", "暴怒", "懒惰", "贪婪", "暴食", "色欲"};
		System.out.println("请输入一串字符串：");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();					//获取用户输入的字符串
		for (int i = 0; i < sensitive.length; i++) {	//循环查找替换
			str = str.replace(sensitive[i], "**");
		}
		System.out.println(str);						//输出替换后的语句
	}
}
