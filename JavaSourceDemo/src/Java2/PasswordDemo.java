package Java2;

import java.util.Scanner;

/**
 * 
 * @author ����
 * @data 2019��4��13�� ����11:32:01
 *
 */
public class PasswordDemo {
	public static void main(String[] args){
		final String PASSWORD = "123456";//����
		Scanner input = new Scanner(System.in);
		String password = null;//����
		String userName = "";
		int  i = 0;
		while(i < 3){
			System.out.println("���������룺");
			password = input.next();
			i++;
			if(!PASSWORD.equals(password)){
				if(i == 3){
					System.out.println("������������Ѵ����Σ�ǿ���˳�ϵͳ��");
					System.exit(0);
				}
			}else{
				i = 9;//��θĽ���
				i = Integer.MAX_VALUE;//��i��ֵΪ����������ֵ��
			}
		}
		System.out.println("������ȷ���ɹ���½��ϵͳ��");
	}
}
