package Java5;
/**
 * TODO
 * @author 念梦
 * @data 2019年4月14日 下午8:51:40
 *
 */
public class BreakDemo {

	public static void main(String[] args) {
		long count = 0;
		long startTime = System.currentTimeMillis();//1970-1-1到现在的毫秒数
		System.out.println(Long.MAX_VALUE);
		while(true){//死循环
			if(count++ == Long.MAX_VALUE){
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("循环已结束" + count);
		System.out.println("循环用时：" + (endTime - startTime) + "毫秒");
		System.out.println(endTime);
		System.out.println(startTime);
	}

}
