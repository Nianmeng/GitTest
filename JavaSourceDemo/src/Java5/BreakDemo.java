package Java5;
/**
 * TODO
 * @author ����
 * @data 2019��4��14�� ����8:51:40
 *
 */
public class BreakDemo {

	public static void main(String[] args) {
		long count = 0;
		long startTime = System.currentTimeMillis();//1970-1-1�����ڵĺ�����
		System.out.println(Long.MAX_VALUE);
		while(true){//��ѭ��
			if(count++ == Long.MAX_VALUE){
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ѭ���ѽ���" + count);
		System.out.println("ѭ����ʱ��" + (endTime - startTime) + "����");
		System.out.println(endTime);
		System.out.println(startTime);
	}

}
