package Java2;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args){
		Scanner input = new Scanner(Syetem.in);
		int choice = -1;	//���������û���ѡ��
		
		System.out.println("1����¼��Ϸ");
		System.out.println("2���˳���Ϸ");
		choice = input.nextInt();
		if(choice == 1){//�������˵�
			System.out.println("1����������");
			System.out.println("2����Ŀ����");
			System.out.println("3���������");
			System.out.println("4����������");
			System.out.println("5���۲����");
			System.out.println("6������һ��");
			System.out.println("������ѡ��");
			choice = input.nextInt();		
		}else if(choice == 2){//�˳���Ϸ
			System.exit(0);//�����˳�javaӦ�ó���(Java Application)
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
			System.out.println("���������Ϸ���˳�");
		}
	}
}
