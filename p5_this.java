class test {
	
	int maths;
	
	test(int maths){
		this.maths=maths;
	}
	
	public int  GetMaths() {
		return maths;
	}
	
	void a1() {
		System.out.println("Hello a1");
	}
	void a2() {
		System.out.println("a2 is called");
		this.a1();
	}
}
public class p5_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test(95);
		t.a2();
		
		System.out.println("Maths value is :"+ t.GetMaths());

	}

}
