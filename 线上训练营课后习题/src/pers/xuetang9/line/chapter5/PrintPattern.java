package pers.xuetang9.line.chapter5;
/**
 * ��ӡ�����Ǻ�ͼ�����ֱ��ӡ
 * @author ����
 * @data 2019��7��18�� ����8:45:51
 */
public class PrintPattern {
	public static void main(String[] args) {
		//ͼ��1
		 for(int i = 0; i < 9; i++) {		//��ѭ�����ƻ���
			 for(int j = 0; j < 9; j++) {	
				 if(i == 0 || j == 8 || j == 0 || i == 8) {
					 System.out.print("*");//��ӡ�߽�*��
				 }else {
					 System.out.print(" ");//��ӡ�ո�
				 }	 
			 }
			 System.out.println();			//����
		 }
		  
		 //ͼ��2
		 System.out.println();
		 for(int i = 0; i < 9; i++) {		//��ѭ�����ƻ���
			 for(int j = 0; j < 9; j++) {
				 if(i == 0 || i == 8) {		//��ӡ��һ�к����һ�е�*����ո�
					 if(j < 3 || j > 5) {
						 System.out.print(" ");
					 }else {
						 System.out.print("*"); 
					 }
				 }
				 if(i == 1 || i == 7) {		//��ӡ�ڶ��к����һ�е�*����ո�
					 if(j == 1 || j == 7) {
						 System.out.print("*");
					 }else {
						 System.out.print(" ");
					 }
				 }
				 if(i > 1 && i < 7) {		//��ӡ�����*����ո�
					 if(j == 0 || j == 8) {
						 System.out.print("*");
					 }else {
						 System.out.print(" ");
					 }
				 }
			 }
			 System.out.println();
		 }
		 
		 //ͼ��3
		 System.out.println();
		 for(int i = 0; i < 9; i++) {				//��ѭ�����ƻ���
			 if(i < 3) {							//��ӡ�����������
				 for (int j = 3 - i; j > 0; j--){	//��ӡ��������Χ�Ŀո�
					 System.out.print(" ");
				 }
				 for(int j = 0; j < 2 * i + 1; j++) {//��ӡ�����ε�*��
					 System.out.print("*");
				 }
			 }else {			//��ӡ�������������һ����*��
				 for(int j = 0; j < 4; j++) {
					 if(j == 3) {
						 System.out.print("*");
					 }else {	//��ӡ*���ԱߵĿո�
						 System.out.print(" ");
					 }
				 }
			 }
			 System.out.println();
		 }
	}
}
