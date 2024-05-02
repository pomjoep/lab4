public class TestCompileTime {

    public TestCompileTime() {}

    public static void main(String args[]) {
        if (Debug.DEBUG) {
            System.err.println("Debug is turned on");
            TestCompileTime t = new TestCompileTime();
            int[] numbers = new int[4];
            for (int i = 0; i < 4; i++) { // Changed loop condition to i < 4
                numbers[i] = i; // Fixed array index to start from 0
                System.out.println("DEBUG_STATEMENT: number[" + i + "]=" + numbers[i]); // Fixed array index to start from 0
            }

            for (int i = 0; i < 4; i++) { // Changed loop condition to i < 4
                int element = numbers[i]; // Fixed array index to start from 0
                System.out.print(element + " ");
            }
            System.out.println();
        } else {
            System.out.println("Debug is turned off");
        }
    }
}
