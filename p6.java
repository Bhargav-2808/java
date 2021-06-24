class Emp{
	float salary;
	
	Emp(float s){
		salary=s;
	}
	
	public float GetSalary() {
		return salary;
	}
}
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(500000.5f);
		System.out.println("Salary is :"+e1.GetSalary());
		

	}

}
