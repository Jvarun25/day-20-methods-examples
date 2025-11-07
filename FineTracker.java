package programs;
import java.util.Scanner;
public class FineTracker {
    static int totalFines = 0;
    int[] fines;
    public static void updateTotal(int add) {
        if (add >= 0 && totalFines + add <= 100) {
            totalFines += add;
        }
    }
    public void updatePatron(int index, int add) {
        if (add >= 0 && fines[index] + add <= 100) {
            fines[index] += add;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        totalFines = sum;
        int index = scanner.nextInt();
        int staticFines = scanner.nextInt();
        int instanceFines = scanner.nextInt();
        updateTotal(staticFines);
        FineTracker tracker = new FineTracker();
        tracker.fines = array;
        tracker.updatePatron(index, instanceFines);
        System.out.println(totalFines);
        for (int i = 0; i < n; i++) {
            System.out.print(tracker.fines[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
        scanner.close();
    }
}
