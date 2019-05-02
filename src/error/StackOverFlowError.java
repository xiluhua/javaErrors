package error;

/**
 * jvm 参数： -Xms5m -Xmx5m -Xmn2m -XX:NewSize=1m
 * @author admin
 * @category 虚拟机栈（线程栈）溢出
 */
public class StackOverFlowError {

	public static void main(String[] args) {
		int i = 0;
		go(i);
	}

	@SuppressWarnings("unused")
	private static void go(int i) {
		System.out.println(i);
		String[] strings = new String[100000];
		i++;
		go(i);
	}
}
