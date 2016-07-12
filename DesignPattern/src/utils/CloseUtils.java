package utils;

import java.io.Closeable;
import java.io.IOException;

public final class CloseUtils {
	private CloseUtils(){};
	
	public static void closeQuietly(Closeable closeable){
		if(null!=closeable){
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
