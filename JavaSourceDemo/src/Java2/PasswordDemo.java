package Java2;

import java.util.Scanner;

/**
 * 
 * @author 念梦
 * @data 2019年4月13日 下午11:32:01
 *
 */
public class PasswordDemo {
	public static void main(String[] args){
		final String PASSWORD = "123456";//常量
		Scanner input = new Scanner(System.in);
		String password = null;//密码
		String userName = "";
		int  i = 0;
		while(i < 3){
			System.out.println("请输入密码：");
			password = input.next();
			i++;
			if(!PASSWORD.equals(password)){
				if(i == 3){
					System.out.println("密码输入错误已达三次，强制退出系统！");
					System.exit(0);
				}
			}else{
				i = 9;//如何改进？
				i = Integer.MAX_VALUE;//让i的值为整型里的最大值！
			}
		}
		System.out.println("密码正确，成功登陆本系统！");
	}
}
