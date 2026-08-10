public class IfExample {
    public static void main(String[] args) {

        int marks = 85;

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        }
        else if (marks >= 90) {
            System.out.println("Grade A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade A");
        }
        else if (marks >= 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 60) {
            System.out.println("Grade C");
        }
        else if (marks >= 50) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
        //Ternary operator
        int age=20;
        String res=(age>18)?"Can Vote":"minor";
        System.out.println(res);

        //Switch case

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }

        //New version of switch with no break statement

        String result = switch (day) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(result);

    }
}