package recursion;

 

public class CountConsonants {
	static boolean isConsonant(char ch) {
		ch=Character.toUpperCase(ch);
		if(ch == 'A'||ch == 'E'||ch == 'I'|| ch == 'O'||ch == 'U') {
			return false;
		}else
		return true;
	}
	
	static int totalConsonants(String str, int n) {
		if(n==1) {
			if(isConsonant(str.charAt(0))) 
				return 1;
			return 0;
		}
		
		
		if(isConsonant(str.charAt(n-1)))
		{
			return totalConsonants(str,n-1)+1;
			//return count;
		}else {
		return totalConsonants(str,n-1);
		}
	}

	public static void main(String[] args) {
		String str="boat";
		int n=str.length();
		int total = totalConsonants(str,n);
		System.out.println(total);

	}

}
