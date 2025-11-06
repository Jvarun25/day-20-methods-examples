package programs;
import java.util.Scanner;
public class Student {
	String name;
	int[] marks;
	public void setDetails(String n,int[] m) {
		this.name=n;
		this.marks=m;
	}
	public double caltotal() {
		double total=0;
		for(	int mark:marks) {
			total+=mark;
		}
		return total;
	}
	public double calavg() {
		double avg;
		avg=(caltotal())/marks.length;
		return avg;
	}
	public void display() {
		System.out.println("Student name: "+name+",total: "+caltotal()+",average: "+calavg());
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String a=sc.next();
		System.out.println("Number of subjects:");
		int b=sc.nextInt();
		int[] arr=new int[b];
		System.out.println("enter marks:");
		for(int i=0;i<b;i++)
		{
			arr[i]=sc.nextInt();
		}
		Student s=new Student();
		s.setDetails(a, arr);
		s.display();
		sc.close();
		
	}

}
