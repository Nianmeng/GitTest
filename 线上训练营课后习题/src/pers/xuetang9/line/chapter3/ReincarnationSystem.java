package pers.xuetang9.line.chapter3;

import java.util.Scanner;

/**
 * 自助投胎系统
 * @author 念梦
 * @data 2019年7月15日 下午1:58:36
 */
public class ReincarnationSystem {
	public static void main(String[] args) {
		int num;			//魂魄的选择
		System.out.println(" * 想体验富贵人家的生活吗？\n" + 
				" * 想看透人世间的繁华吗？\n" + 
				" * 想深入了解民间的疾苦吗？\n" + 
				" * 你想要的，在这里都可以实现，\n" + 
				" * 请记住本系统的名字————自助投胎系統\n");
		System.out.println("\t\t\t\t欢迎进入自助投胎系统！");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("某魂魄：我要投胎！");
		System.out.println("请选择性别：");
		System.out.println("1、男（免费）\t\t2、女（50币）");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		switch (num) {
		case 2:
			System.out.println("您的余额为0，无法选择！");
			System.out.println("系统友情提示：\n"
					+ "充值，可使您的人生更丰富！");
			System.out.println("1、老子要充\t\t2、没钱不充");
			num = input.nextInt();
			System.out.println("请选择：");
			switch (num) {
			case 1:
				System.out.println("抱歉，您的账户余额为0");
			case 2:
				System.out.println("……算了，没钱不充！");
			}
		case 1:
			System.out.println("请选择您的生存难度：");
			System.out.println("1、简单（1W币）\t\t2、中等（5000币）\n"
					+ "3、困难（1000币）\t\t4、深渊（免费）");
			num = input.nextInt();
			switch (num) {
			default:
				System.out.println("抱歉，您的账户余额不足！");
			case 4:
				System.out.println("深渊？就这个吧，我就喜欢挑战难度。");
				System.out.println("请选择出身：");
				System.out.println("1、我爸是李gang套装（10W）\t\t2、富二代（5W）\n"
						+ "3、官二代（5W）\t\t4、军二代（5W）\t\t5、穷逼（免费）");
				num = input.nextInt();
				switch (num) {
				default:
					System.out.println("抱歉，您的账户余额为0");
				case 5:
					System.out.println("我去，咋都这么贵，那就这个吧。");
					System.out.println("请选择技能：");
					System.out.println("1、赚钱（1W币）\t\t2、把妹（1W币）\t\t3、文艺（1W币）\n"
							+ "4、技工（1W币）\t\t5、泡面（500币）\t\t6、毛都不会（免费）");
					num = input.nextInt();
					switch (num) {
					default:
						System.out.println("抱歉，您的账户余额不足！");
					case 6:
						System.out.println("都这么贵，搞毛哇！");
						System.out.println("请选择长相：");
						System.out.println("1、帅哥套装1（1W币）\n"
								+ "2、帅锅套装2（1W币）\n"
								+ "3、随机（免费）");
						num = input.nextInt();
						switch (num) {
						default:
							System.out.println("抱歉，您的账户余额不足！");
						case 3:
							System.out.println("您的随机结果已生成！");
							System.out.println("感谢您使用我们的系统，您有什么好的建议吗？");
							System.out.println("1、有\t\t2、无");
							System.out.println("竟然还有脸要建议！！");
							num = input.nextInt();
							input.close(); 		//释放资源
							switch (num) {
							default:
								System.out.println("算了，不和你一般计较了。");
								System.out.println("恭喜你，转世成功！");
							case 1:
								System.out.println("垃圾！坑爹呢！！！");
								System.out.println("非常感谢您的建议，系统将赠送您一套豪华面部疤痕，（商城价50币）并自动装备！");
								System.out.println("滴……转生中……");
								System.out.println("恭喜你，转世成功！");
							}
						}
					}
				}
			}
		}
	}
}
