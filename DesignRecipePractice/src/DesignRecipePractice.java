import java.util.Arrays;


public class DesignRecipePractice {

	public static String[] intersperse(String[] arr, String s) {
		if (arr == null) {
			return null;
		} else if (arr.length == 0) {
			return arr;
		} else {
		    String[] ret = new String[arr.length * 2 - 1];
		    for (int i = 0; i < arr.length - 1; i++) {
		    	ret[i *2] = arr[i];
		    	ret[i * 2 + 1] = s;
		    }
		    ret[ret.length - 1] = arr[arr.length - 1];
		    return ret;
		}
	}
			
	
	// Arrays.toString(..)
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersperse(null, "h")));
		System.out.println(Arrays.toString(intersperse(new String[] {"a"}, "h")));
		System.out.println(Arrays.toString(intersperse(new String[] {"a","b","c"}, null)));
		System.out.println(Arrays.toString(intersperse(null,null)));
		System.out.println(Arrays.toString(intersperse(new String[] {}, "b")));
		System.out.println(Arrays.toString(intersperse(new String[] {"a","b","c"}, "h")));
	}

}
