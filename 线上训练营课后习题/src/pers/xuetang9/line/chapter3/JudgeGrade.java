package pers.xuetang9.line.chapter3;

import java.util.Scanner;
/**
 * ��ɺɺ�μ���ĩ���ԣ���ĸ��ŵ��
 * ��100�֣����׸����򳵡�
 * >= 90�֣�ĸ�׸�����ʼǱ����ԡ�
 * >= 60�֣�ĸ�׸�����һ���ֻ���
 * <  60�֣�ɶ��û�С�
 * @author ����
 * @data 2019��7��14�� ����7:33:11
 */

public class JudgeGrade {
	public static void main(String[] args) {
		double grade;		//ɺɺ����ĩ�ɼ�
		System.out.println("��ĩ���Խ����ˣ���ɺɺ������ĩ�ɼ�������������������һ��һ�������ڻؼҵ�·�ϡ���");
		System.out.println("ɺɺ���˼��š�");
		System.out.println("��ĸ����ɺɺ������ѽ���о���ô���������ĩ���Կ��˶����ţ���");
		System.out.println("��������ĩ���Եĳɼ���");
		Scanner input = new Scanner(System.in);
		grade = input.nextDouble();
		input.close();		//�ͷ���Դ
		if (grade == 100) {
			System.out.println("ɺɺ�����Ͻ���©����Ц�ݣ���ѽ�����ǲ²��ҿ��˶��٣�");
			System.out.println("����©�������£���Ŷ����ɺɺ��ô���ģ�Ӧ�ÿ��˺ܺõĳɼ��ɣ���");
			System.out.println("ɺɺ��O(��_��)O~�����ǵ�Ȼ��������ο���100���ء���");
			System.out.println("���ף����ţ����ǵ�ɺɺ����ˣ�����ȥ��ȥ�ɣ����㵱����������");
			System.out.println("ɺɺ�����ţ�лл�ϰ֣��Ҿ�֪��������ˡ���");
		}else if (grade >= 90) {
			System.out.println("ɺɺ�����������ο���" + grade + "�֣���ô����������ɡ���");
			System.out.println("ĸ�ף����ţ�����������ͦ�õģ��ߣ��������ȥ��ʼǱ�����ȥ��");
			System.out.println("ɺɺ����ллĸ�״��ˣ���");
		}else if (grade >= 60) {
			System.out.println("ɺɺ�����ҡ��ҿ���" + grade + "�֣��������Ƿ��ģ��´���һ����ֹ��һ����֣���");
			System.out.println("ĸ�ף���û��ϵ������ɺɺ�Լ������ˣ��´�һ���ῼ�ĸ��ã��ߣ��������ȥ���ֻ�ȥ��");
			System.out.println("ɺɺ�������ţ��Ҿ�֪��������һֱ��������ô�á�");
		}else {
			System.out.println("ɺɺ��Ĭ��һ��������ҡ��ҡ�����ɺɺ����ɫ�仯������");
			System.out.println("���׷·�͸��һ�У������ˣ��㲻��˵�ˣ��������û������ɡ���");
			System.out.println("����һ�ٳ��š���");
		}
	}
}
