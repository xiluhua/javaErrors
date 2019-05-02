package error;

import java.util.HashMap;
import java.util.Map;

/**
 * jvm ²ÎÊý£º -Xms5m -Xmx5m -Xmn2m -XX:NewSize=1m
 * @author admin
 *
 */
public class HeapOutOfMemoryError {
	
	// ¶Ñ
	@SuppressWarnings("unused")
	private String[] strings = new String[100000];
	
	public static void main(String[] args) {
		Map<Object, HeapOutOfMemoryError> map = new HashMap<Object, HeapOutOfMemoryError>();
		int i = 0;
		
		do {
			map.put(String.valueOf(i), new HeapOutOfMemoryError());
			i++;
		} while (i<100000);
	}
}
