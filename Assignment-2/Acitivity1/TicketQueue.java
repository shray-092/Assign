package capgemini;
import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    public static void main(String[] args) {

        Queue<String> ticketQueue = new LinkedList<>();

        ticketQueue.add("Customer 1");
        ticketQueue.add("Customer 2");
        ticketQueue.add("Customer 3");
        ticketQueue.add("Customer 4");
        ticketQueue.add("Customer 5");

        ticketQueue.poll();
        ticketQueue.poll();

        System.out.println("Remaining customers in queue:");
        for (String customer : ticketQueue) {
            System.out.println(customer);
        }
    }
}
