class Change_{
	
	int length=50;
	
	void ChangeData(Change_ r1) {
		r1.length=r1.length+50;
		
	}
	
	
	
}
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("hello");
		Change_ r1 = new Change_();
		
		System.out.println("Before Change "+r1.length);

		r1.ChangeData(r1);
		System.out.println("After Change "+r1.length);
	}

}
