import java.util.*;
public class p14_cla {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int x,y,s;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition\n2.substraction\n3.Multiplication\n4.division");
		System.out.println("Enter the choise number");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println(x+y);
			break;
		case 2:
			System.out.println(x-y);
			break;
		case 3:
			System.out.println(x*y);
			break;
		case 4:
			System.out.println(x/y);
			break;
		default:
			System.out.println("invalid choise");
		}
		
		
		
	}

}
