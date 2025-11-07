package programs;
import java.util.Scanner;
public class TicketTracker {
    static int totalTickets = 0;
    int[] tickets;
    public static void updateTotal(int add) {
        if (add >= 0 && totalTickets + add <= 5000) {
            totalTickets += add;
        }
    }
    public void updateConcert(int index, int add) {
        if (add >= 0 && tickets[index] + add <= 5000 && totalTickets + add <= 5000) {
            tickets[index] += add;
            totalTickets += add;
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
        totalTickets = sum;
        int index = scanner.nextInt();
        int staticTickets = scanner.nextInt();
        int instanceTickets = scanner.nextInt();
        updateTotal(staticTickets);
        TicketTracker tracker = new TicketTracker();
        tracker.tickets = array;
        tracker.updateConcert(index, instanceTickets);
        System.out.println(totalTickets);
        for (int i = 0; i < n; i++) {
            System.out.print(tracker.tickets[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
        scanner.close();
    }
}
