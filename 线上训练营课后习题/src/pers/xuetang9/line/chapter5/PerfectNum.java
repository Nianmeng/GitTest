package pers.xuetang9.line.chapter5;
/**
 * �ҳ�1000���ڵ���������
 * @author ����
 * @data 2019��7��18�� ����3:18:10
 */
public class PerfectNum {
	public static void main(String[] args) {
		int num = 1;		//��ʾ1~1000������
		int sum = 0;		//�����ۼӺ�
		for(num = 1; num <= 1000; num++) {
			sum = 0;		//ÿ����ѭ��ǰ��������
			//����ѭ�����ۼ�������������
			for(int i = 1; i <= num - 1; i++) {
				if(num % i == 0) {
					sum += i;	//�ۼ�������������
				}
			}
			//�ж�num����������֮���Ƿ����
			if(num == sum) {
				System.out.println("�ҵ�һ��������" + num);
			}
		}
	}
} 

