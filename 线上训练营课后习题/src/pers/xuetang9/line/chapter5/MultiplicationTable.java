package pers.xuetang9.line.chapter5;
/**
 * ��ӡ�žų˷���
 * @author ����
 * @data 2019��7��18�� ����6:03:57
 */
public class MultiplicationTable {
	public static void main(String[] args) {
		int i;				//�ⲿѭ������
		int j;				//�ڲ�ѭ������
		int result;			//���˽��
		for(i = 1; i <= 9; i++) {		//��ѭ��������
			for(j = 1; j <= i; j++) {	//��ѭ��������
				result = i * j;			//������
				System.out.print(j + "*" + i + "=" + result + "\t");	//�����ӡ
			}
			System.out.println();	//����
		}
	}
}
