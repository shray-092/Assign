package capgemini;

import java.util.LinkedList;

public class AsTask2 {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Patient A");
        queue.add("Patient B");
        queue.add("Patient C");
        queue.add("Patient D");
        queue.add("Patient E");

        queue.addFirst("Emergency Patient");

        queue.remove();
        queue.remove();

        System.out.println("Current Queue:");
        for (String p : queue) {
            System.out.println(p);
        }
    }
}
