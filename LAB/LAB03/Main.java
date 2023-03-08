
public class Main {



	public static void main(String[] args) {
		
		
//		Link Nipuna = new Link("Nipuna", 53.5);
//		Link Aravinda = new Link("Aravinda",78.0);
//		Link Prashani = new Link("Prashani", 69.5);
//		
//		
//		Nipuna.next=Aravinda;
//		Aravinda.next=Prashani;
//		Prashani.next=Nipuna;
//		
//		Nipuna.displayLink();
//		Aravinda.next.displayLink();
//		Prashani.next.next.displayLink();
//		
		LinkList studentList = new LinkList(null);
		
		studentList.insertFirst("Prashani", 69.5);
		studentList.insertFirst("Aravinda",78.0);
		studentList.insertFirst("Nipuna", 53.5);
		
		
		studentList.displayList();
		
		studentList.deleteLink();
		
		

	}

}
