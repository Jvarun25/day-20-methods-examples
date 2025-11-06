package programs;
import java.util.Scanner;
public class StepTracker {
	int steps;
	
	public void display(int steps) {
		String st="Keep going";
		if(steps>10000) {
			st="Excellent!";
		}
		if(steps>5000 && steps<=10000) {
			st="Good job!";
		}
		
		System.out.println(st);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StepTracker ste=new StepTracker();
		ste.display(sc.nextInt());
		sc.close();
	}

}