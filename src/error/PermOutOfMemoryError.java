package error;

import java.util.HashMap;
import java.util.Map;

/**
 * jvm 参数： -Xms5m -Xmx5m -Xmn2m -XX:NewSize=1m
 * @author admin
 *
 */
public class PermOutOfMemoryError {

	// 方法区
	@SuppressWarnings("unused")
	private static String[] strings = new String[100000];
	
	public static void main(String[] args) {
		Map<Object, PermOutOfMemoryError> map = new HashMap<Object, PermOutOfMemoryError>();
		int i = 0;
		
		do {
			map.put(String.valueOf(i), new PermOutOfMemoryError());
			i++;
		} while (i<100000);
	}
}
