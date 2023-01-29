package recursion;

public class PrintLinearly1toN {
	
	static void fn(int i,int n) {
		if(i>n) {
			return;
		}else {
		System.out.println(i);
		fn(i+1,n);
		return ;
		}
	}
	
	static class reverseOrder{
		static void revFn(int i,int n) {
			if(i<1) {
				return;
			}else {
				System.out.println(i);
				revFn(i-1,n);
				return;
			}
		}
	}

	public static void main(String[] args) {
		int n=5;
		//fn(1,n);
		reverseOrder ro=new reverseOrder();
		ro.revFn(n,n);

	}

}
