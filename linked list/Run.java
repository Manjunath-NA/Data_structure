package ds;

public class Run {
	public static void main(String[] args) {
		LL list=new LL();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insertatstart(0);
		list.insertat(4, 22);
		
		//list.insertat(4, 6);
		
		list.show();
		System.out.println("After deletion");
		list.delete(2);
		list.show();
	}

}
