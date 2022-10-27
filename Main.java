import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.println("Welcome to -Kaban- Itschool. Do you want some Courses? ");
        String entering = test.next();
        if (entering.equals("yes")||entering.equals("Yes")) {
            System.out.println("We have Python Frontend and JavaBackend, make your choise, please.");
            String answ1 = test.next();
            if (answ1.equals("python")||answ1.equals("Python")) {
                PythonFrontEnd python1 = new PythonFrontEnd("12 000 som", 5);
                python1.SomeInfo();
                python1.PythonInfo();
            } else if (answ1.equals("java")||answ1.equals("Java")) {
                JavaBackend java1 = new JavaBackend("15000 som", 12);
                java1.SomeInfo();
                java1.JavaInfo();
            } else {
                System.out.println("You wrote invalid answer!");
            }
        } else if (entering.equals("No")||entering.equals("no")) {
            System.out.println("Are you interested in vacancies?");
            String answ2 = test.next();
            if (answ2.equals("yes")||answ2.equals("Yes")) {
                System.out.println("We have such a vacancies as: ");
                System.out.println("1. Reception\n 2. Security\n 3. Developer\n 4. Data Base Stuff");
                System.out.println("Please make your choise from 1 to 4: ");
                int answ3 = test.nextInt();
                Reception rec1 = new Reception(1000, 10, "Ulan", 24, 'm');
                Security sec1 = new Security(800, 10, "Sabur", 37, 'm');
                Developers dev1 = new Developers(3500, 7, "Zhanetta", 25, 'f');
                DataBaseStuff db1 = new DataBaseStuff(3200, 7, "Tanuki", 29, 'm');
                switch (answ3) {
                    case 1:
                        rec1.Action1();
                        System.out.println("For example, this is one of our Receptions ");
                        rec1.RecInfo();
                        break;
                    case 2:
                        sec1.Action1();
                        System.out.println("For example, this is one of our Security");
                        sec1.SecInfo();
                        break;
                    case 3:
                        dev1.Action1();
                        System.out.println("For example, this is one of our Developers ");
                        dev1.DevInfo();
                    break;
                        case 4:
                        db1.Action1();
                        System.out.println("For example, this is one of our DataBase Developers ");
                        db1.DBInfo();
                    default:
                        System.out.println("You wrote invalid answer!: ");
                }
            }
            else {
                System.out.println("Good Bye!");
            }
        } else {
            System.out.println("You wrote invalid answer!");
        }
    }
}