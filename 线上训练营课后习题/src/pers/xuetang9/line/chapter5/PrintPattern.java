package pers.xuetang9.line.chapter5;
/**
 * 打印三个星号图案，分别打印
 * @author 念梦
 * @data 2019年7月18日 下午8:45:51
 */
public class PrintPattern {
	public static void main(String[] args) {
		//图案1
		 for(int i = 0; i < 9; i++) {		//外循环控制换行
			 for(int j = 0; j < 9; j++) {	
				 if(i == 0 || j == 8 || j == 0 || i == 8) {
					 System.out.print("*");//打印边界*号
				 }else {
					 System.out.print(" ");//打印空格
				 }	 
			 }
			 System.out.println();			//换行
		 }
		  
		 //图案2
		 System.out.println();
		 for(int i = 0; i < 9; i++) {		//外循环控制换行
			 for(int j = 0; j < 9; j++) {
				 if(i == 0 || i == 8) {		//打印第一行和最后一行的*号与空格
					 if(j < 3 || j > 5) {
						 System.out.print(" ");
					 }else {
						 System.out.print("*"); 
					 }
				 }
				 if(i == 1 || i == 7) {		//打印第二行和最后一行的*号与空格
					 if(j == 1 || j == 7) {
						 System.out.print("*");
					 }else {
						 System.out.print(" ");
					 }
				 }
				 if(i > 1 && i < 7) {		//打印其余的*号与空格
					 if(j == 0 || j == 8) {
						 System.out.print("*");
					 }else {
						 System.out.print(" ");
					 }
				 }
			 }
			 System.out.println();
		 }
		 
		 //图案3
		 System.out.println();
		 for(int i = 0; i < 9; i++) {				//外循环控制换行
			 if(i < 3) {							//打印三层的三角形
				 for (int j = 3 - i; j > 0; j--){	//打印三角形周围的空格
					 System.out.print(" ");
				 }
				 for(int j = 0; j < 2 * i + 1; j++) {//打印三角形的*号
					 System.out.print("*");
				 }
			 }else {			//打印三角形下面的那一束的*号
				 for(int j = 0; j < 4; j++) {
					 if(j == 3) {
						 System.out.print("*");
					 }else {	//打印*号旁边的空格
						 System.out.print(" ");
					 }
				 }
			 }
			 System.out.println();
		 }
	}
}
