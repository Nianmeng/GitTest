package pers.xuetang9.line.chapter5;
/**
 * ��һֻ����Ҫ5Ԫ����һֻĸ����Ҫ3Ԫ������ֻС����Ҫ1Ԫ��
 * �ʻ�100Ԫ��100ֻ�������ж������򷨣�
 * @author ����
 * @data 2019��7��19�� ����8:36:46
 */
public class BuyChook {
	public static void main(String[] args) {
		int num;		//���ĸ���
		int price;  	//��ҪǮ��
		int count = 0;	//����
		for (int i = 0; i < 100 / 5; i++) {				//����������Χ
			for(int j = 0; j < 100 / 3; j++) {			//ĸ��������Χ
				for(int k = 0; k < 100; k += 3) {		//С��������Χ
					num = i + j + k;					//ÿ��ѭ���ܵļ�������
					price = i * 5 + j * 3 + k / 3;		//�ܵļ��ļ۸�
					if(num == 100 && price == 100) {	//�����㼦��������۸�Ϊ100ʱ
						count++;						//������1
						System.out.println("����"+i+"ֻ��ĸ��"+j+"ֻ��С��"+k+"ֻ");
					}
				}
			}	
		}
		System.out.println("�ܹ���"+count+"����");
	}
}
