class Car{
	public String CarName;
	private String CarColor;
	
	protected String  CarEngine ;
	
	
	
	void SetCarColor(String n){
		CarColor=n;
	}
	
	public String GetCarColor() {
		return CarColor;
	}
	
}


public class p11_access extends Car {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.CarName="Audi r8";
		System.out.println(c1.CarName);
		c1.SetCarColor("red");
		System.out.println(c1.GetCarColor());
		p11_access p1 = new p11_access();
		
		p1.CarEngine="V8 Engine";
		System.out.println(p1.CarEngine);

	}

}
