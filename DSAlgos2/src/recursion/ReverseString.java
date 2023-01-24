package recursion;

public class ReverseString {

	public static void main(String[] args) {
		String s="aditi";
		Rev(s);

	}

	private static String Rev(String s) {
		if(s==null||s.length()<1) {
			return s;
		}else {
			System.out.print(s.charAt(s.length()-1));
			return Rev(s.substring(0, s.length()-1));
		}
		
	}

}
