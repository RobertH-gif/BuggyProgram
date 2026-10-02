public class BuggyProgram {

    // Method 1: Nested conditionals (Fixed logic & thresholds)
    public static String getGrade(int score) {
        if (score >= 90) {
            return "Exceeds";
        } else if (score >= 80) {
            return "Meets";
        } else {
            return "Does Not Meet";
        }
    }

    // Method 2: Loop with array (Fixed bounds & initial sum)
    public static int sumEvenNumbers(int[] values) {
        if (values == null) return 0;
        
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                sum += values[i];
            }
        }

        return sum;
    }

    // Method 3: Loop with bounds (Fixed inverted ranges)
    public static int sumRange(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Test the program using the JUnit tests");
    }
}
