public class ControlStatements {

    public static void main(String[] args) {

        // ---------- 1. if / else if / else ----------
        System.out.println("=== if-else ===");
        int marks = 72;

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        // ---------- 2. for loop ----------
        System.out.println("\n=== for loop (multiplication table of 5) ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // ---------- 3. while loop ----------
        System.out.println("\n=== while loop (sum of 1 to 5) ===");
        int n = 1;
        int sum = 0;
        while (n <= 5) {
            sum += n;
            n++;
        }
        System.out.println("Sum = " + sum);

        // ---------- 4. do-while loop ----------
        // Body runs at least once, even if the condition is false
        System.out.println("\n=== do-while loop (countdown) ===");
        int count = 5;
        do {
            System.out.println("Count: " + count);
            count--;
        } while (count > 0);

        // ---------- 5. switch-case ----------
        System.out.println("\n=== switch-case ===");
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName);

        // ---------- Bonus: break and continue ----------
        System.out.println("\n=== break and continue ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;   // skip 3
            }
            if (i == 7) {
                break;      // stop the loop at 7
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}