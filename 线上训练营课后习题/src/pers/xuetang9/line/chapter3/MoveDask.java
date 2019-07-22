package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * 使用if结构判断实现是否能搬动桌子
 * @author 念梦
 * @data 2019年7月14日 下午1:38:59
 */
public class MoveDask {
	public static void main(String[] args) {
		int age;	//用户的年龄
		String sex;	//用户的性别
		System.out.println("请输入您的年龄：");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();			//用户输入年龄
		if(age < 0) {
			System.out.println("抱歉，年龄不能为负数，系统自动退出！");
			System.exit(0);				//退出系统
		}else if(age < 5) {
			System.out.println("抱歉，您还太小，搬不动这个桌子！");
			System.exit(0);				//退出系统
		}else if(age >= 7) {
			System.out.println("您可以搬动桌子！");
			System.exit(0);				//退出系统
		}
		System.out.println("请输入您的性别（男 / 女）：");
		sex = input.next();				//读取用户输入的字符串
		input.close();					//释放资源
		if (age >= 5 && "男".equals(sex))		//判断用户是否可以搬动桌子
			System.out.println("您现在可是个小男子汉了，可以搬动这个桌子的！");				
		else if (age >= 5 && "女".equals(sex))
			System.out.println("这个桌子可不是像你这么柔弱的女孩子能搬得动的！");
		else
			System.out.println("性别输入不合法哦，系统退出！");
	}
}
