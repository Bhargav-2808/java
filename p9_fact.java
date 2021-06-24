
public class p9_fact {

	public static  int fact(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact =1;
		
		fact= fact(4);
		System.out.println("Factorial is :"+fact);
	}
	

}
