public class TailRecursion {
    public static void main(String[] args) {

    }

    // When there is last function call it is called Tail Recursion
    static void print(int n) {

        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        // This is last function call.
        print(n + 1);
    }
}
