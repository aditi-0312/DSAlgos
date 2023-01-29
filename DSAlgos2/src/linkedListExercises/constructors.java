package linkedListExercises;

public class constructors {
	private String name;
	private int id;
	
	
	public constructors() {
		name = "aditi";
		id=45;
	}
	
	public int getId() {
		return id;
	}
	
	public constructors(String n, int i) {
		name =n;
		id=i;
	}
	
	
	public static void main(String[] args) {
		constructors obj = new constructors("Adi", 12);
		constructors obj1 = new constructors();

		
		System.out.println(obj.id);
		System.out.println(obj.name);
		
		System.out.println(obj1.name);
		System.out.println(obj1 .id);
		
	}

}
