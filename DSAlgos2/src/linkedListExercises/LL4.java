package linkedListExercises;
import java.util.*;

public class LL4 {
	public static void removeNode(LinkedList list) {
		int temp=0;
		
		for(int i=0;i<list.size();i++) {
			temp=(int) list.get(i);
	    	if(temp>25) {
	    		list.remove(i);
	    	}
	    	System.out.println(list);
	    }
	}
	
	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<>();//declare your list
		    Scanner scan = new Scanner(System.in);//create a scanner
		    System.out.print("Enter the Nbr of element : ");
		    int nbr = scan.nextInt();//read the number of element
		    scan.nextLine();
		    do {
		        list.add(scan.nextInt());//read and insert into your list in one shot
		        scan.nextLine();
		        nbr--;//decrement the index
		    } while (nbr > 0);//repeat until the index will be 0

		    scan.close();//close your scanner
		    System.out.println(list);//print your list
		    
		    removeNode(list);
	}

}
