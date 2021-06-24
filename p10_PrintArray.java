
public class p10_PrintArray {
	
	public static void PrintArray(int [] data , int index) {
		if(index!=-1) {
			PrintArray(data,index-1);
			System.out.println(data[index]);
		}
	}
	public static void PrintRArray(int [] data , int index) {
		if(index!=-1) {
			
			System.out.println(data[index]);
			PrintArray(data,index-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {1,2,3,4,5};
		
		
		System.out.println("Sequntial order : ");
		PrintArray(data,data.length-1);
		System.out.println("Reverse  order : ");
		PrintRArray(data,data.length-1);

	}

}
