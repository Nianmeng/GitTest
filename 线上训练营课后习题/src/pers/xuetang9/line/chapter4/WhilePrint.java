package pers.xuetang9.line.chapter4;
/**
 * ʹ��ѭ�������100��95��90��85 �� 5
 * @author ����
 * @data 2019��7��17�� ����12:35:33
 */
public class WhilePrint {
	public static void main(String[] args) {
		int i = 100;			//����ѭ������������ֵΪ100
		while(i >= 5) {			//��i���ڵ���5ʱִ������
			System.out.print(i + " ");	//��ӡ����
			i -= 5;						//ѭ������
		}
	}
}
