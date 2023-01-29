package recursion;

public class Linearly1toNbacktrack {
	
	public static void backtrack(int i, int n) {
		if(i<1) {
			return;
		}else {
		backtrack(i-1,n);
		System.out.println(i);
		return;
		}
	}
	
	static class Nto1backtrack {
		 
		static void Nto1(int i, int n) {
			if(i>n) {
				return;
			}
			else {
				Nto1(i+1,n);
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int n=5;
		//backtrack(n,n);
		
		Nto1backtrack bt=new Nto1backtrack();
		bt.Nto1(1,n);

	}

}
