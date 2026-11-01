import java.util.Scanner;

public class L3_9_Calendar {

    static final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
    static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    static int daysInMonth(int month, int year) {
        return month == 2 && isLeapYear(year) ? 29 : DAYS[month - 1];
    }

    static int firstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), year = sc.nextInt();
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month or year");
            return;
        }
        int first = firstDay(month, year), days = daysInMonth(month, year);
        System.out.println(MONTHS[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < first; i++) System.out.print("    ");
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((first + day) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}
