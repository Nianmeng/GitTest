package Java2;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args){
		Scanner input = new Scanner(Syetem.in);
		int choice = -1;	//用来保存用户的选择
		
		System.out.println("1、登录游戏");
		System.out.println("2、退出游戏");
		choice = input.nextInt();
		if(choice == 1){//进入主菜单
			System.out.println("1、传音入密");
			System.out.println("2、举目四望");
			System.out.println("3、会会老友");
			System.out.println("4、自我欣赏");
			System.out.println("5、观察地形");
			System.out.println("6、到此一游");
			System.out.println("请输入选择：");
			choice = input.nextInt();		
		}else if(choice == 2){//退出游戏
			System.exit(0);//正常退出java应用程序(Java Application)
			switch (choice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
				

			default:
				break;
			}
		}else{
			System.out.println("输入错误，游戏已退出");
		}
	}
}
