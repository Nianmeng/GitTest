package pers.xuetang9.line.chapter3;

import java.util.Scanner;
/**
 * 刘珊珊参加期末考试，父母承诺：
 * 达100分，父亲给她买车。
 * >= 90分，母亲给她买笔记本电脑。
 * >= 60分，母亲给她买一部手机。
 * <  60分，啥都没有。
 * @author 念梦
 * @data 2019年7月14日 下午7:33:11
 */

public class JudgeGrade {
	public static void main(String[] args) {
		double grade;		//珊珊的期末成绩
		System.out.println("期末考试结束了，刘珊珊拿着期末成绩单，怀着忐忑的心情一步一步的走在回家的路上……");
		System.out.println("珊珊打开了家门。");
		System.out.println("父母：“珊珊回来了呀，感觉怎么样，这次期末考试考了多少呐？”");
		System.out.println("请输入期末考试的成绩：");
		Scanner input = new Scanner(System.in);
		grade = input.nextDouble();
		input.close();		//释放资源
		if (grade == 100) {
			System.out.println("珊珊的脸上渐渐漏出了笑容，我呀，你们猜猜我考了多少？");
			System.out.println("父亲漏出了兴致，“哦，看珊珊那么开心，应该考了很好的成绩吧！”");
			System.out.println("珊珊：O(∩_∩)O~，“那当然啦，我这次考了100分呢。”");
			System.out.println("父亲：“嗯，我们的珊珊最棒了！我们去买车去吧，给你当做奖励。”");
			System.out.println("珊珊：“嗯，谢谢老爸，我就知道您最好了。”");
		}else if (grade >= 90) {
			System.out.println("珊珊：“我嘛，我这次考了" + grade + "分，怎么样，还不错吧。”");
			System.out.println("母亲：“嗯，不错不错，考的挺好的，走，妈妈带你去买笔记本电脑去！");
			System.out.println("珊珊：“谢谢母亲大人！”");
		}else if (grade >= 60) {
			System.out.println("珊珊：“我…我考了" + grade + "分，不过你们放心，下次我一定不止这一点儿分！”");
			System.out.println("母亲：“没关系，我们珊珊自己尽力了，下次一定会考的更好，走，妈妈带你去买手机去！");
			System.out.println("珊珊：“嗯嗯，我就知道，妈妈一直都对我这么好。");
		}else {
			System.out.println("珊珊沉默了一会儿，“我…我……”珊珊的脸色变化不定。");
			System.out.println("父亲仿佛看透了一切，“好了，你不用说了，你这次又没考及格吧。”");
			System.out.println("场面一再沉寂……");
		}
	}
}
