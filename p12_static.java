class Details{
	static int NextId=1;
	int id;
	String name;
	
	Details(String n){
		
		this.id=NextId++;
		this.name=n;
	}
	
	public void show() {
		System.out.println("Name : "+name+"\n Id : "+id+"\nEmail Id : "+name+id+"@gmail.com" );
	}
	
	public void ShowNextId() {
		System.out.println("Next Employee Id will be : "+NextId);
	}
	
	public void finalize() {
		--NextId;
	}
	
	
}
public class p12_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details A = new Details("AA");
		Details B = new Details("BB");
		Details C = new Details("CC");
		
		A.show();
		B.show();
		C.show();
		
		A.ShowNextId();
		B.ShowNextId();
		C.ShowNextId();
		{
			Details D = new Details("DD");
			Details E = new Details("EE");
			
			D.show();
			E.show();
			
			D=null;
			E=null;
			System.gc();
			System.runFinalization();
			
			
			
		}
		A.ShowNextId();
		
		
		
	}

}
