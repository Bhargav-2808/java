class ReturnObj{
	int i;
	
	ReturnObj(int i){
		
		this.i=i;
	}
	
	public ReturnObj  SquareValue() {
		
		ReturnObj s = new ReturnObj(i*i);
		return s;
		
		
	}
	
	public void show() {
		System.out.println("Square value is : " + i);
	}
	
}
public class p8_return_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnObj x1=new ReturnObj(6);
		ReturnObj x2;
		
		x2=x1.SquareValue();
		x2.show();
		
	}

}
