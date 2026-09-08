public class ThrowThrowsExample {

    // throws declares that this method may throw an exception
    public static void sleepForAWhile(int ms) throws InterruptedException {

        Thread.sleep(ms);
    }

    // throw is used to explicitly throw an exception
    public static void validateAge(int age) {

        if (age < 0) {

            throw new IllegalArgumentException("Age cannot be negative!");
        }

        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        // Handling checked exception
        try {

            sleepForAWhile(1000);

        } catch (InterruptedException e) {

            System.out.println("Sleep interrupted");
        }

        // Using throw for validation
        try {

            validateAge(-5);

        } catch (IllegalArgumentException e) {

            System.out.println("Caught: " + e.getMessage());
        }
    }
}