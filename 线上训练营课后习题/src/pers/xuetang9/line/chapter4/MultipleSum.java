package pers.xuetang9.line.chapter4;
/**
 * ��̼���1��50����7�ı�������ֵ֮��
 * @author ����
 * @data 2019��7��17�� ����12:38:10
 */
public class MultipleSum {
	public static void main(String[] args) {
		int i = 1;		//ѭ������
		int sum = 0;	//������ֵ֮��
		while(i <= 50) {
			if(i % 7 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1~50��7�ı�������ֵ֮��Ϊ��" + sum);
	}
}
