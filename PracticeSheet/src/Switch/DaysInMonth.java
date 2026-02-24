package Switch;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 2;   // Change month number here (1-12)
        int year = 2024; // For checking leap year (for February)

        int days = 0;

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                // Check leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                System.out.println("Invalid Month!");
                return;
        }

        System.out.println("Total days in month = " + days);
    }
}