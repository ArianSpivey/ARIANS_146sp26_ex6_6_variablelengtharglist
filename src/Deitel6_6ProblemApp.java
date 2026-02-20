/**
 *
 * @author ARIANS
 */
public class Deitel6_6ProblemApp {

    public static void main(String[] args) {

        // Initialization Phase
        int[] values = {5, 10, 15, 20, 25};
        int[] copy = new int[values.length];

        // Processing Phase: copy array
        for (int i = 0; i < values.length; i++) {
            copy[i] = values[i];
        }

        // Display results 
        System.out.println("Index\tValues\tCopy");
        for (int i = 0; i < values.length; i++) {
            System.out.println(i + "\t" + values[i] + "\t" + copy[i]);
        }

        /*  Termination Phase */
        System.out.println("Done.");
    }
}
