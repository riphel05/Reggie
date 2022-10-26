import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCID = "";
        String Menu = "";

        SSN = getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");

        UCID = getRegExString2(in, "Enter your UCID", "M|m\\d{5}" );

        Menu = getRegExString3(in, "Enter the menu choices", "OoSsVvQq");
    }
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;

        do
        {
            System.out.print(prompt + ": ");

            value = pipe.nextLine();

            if(value.matches(regExPattern))
            {

                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }

        }while(!gotAValue);

        return value;
    }
    public static String getRegExString2(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;

        do
        {
            System.out.print(prompt + ": ");

            value = pipe.nextLine();

            if(value.matches(regExPattern))
            {

                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }

        }while(!gotAValue);

        return value;
    }
    public static String getRegExString3(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;

        do
        {
            System.out.print(prompt + ": ");

            value = pipe.nextLine();

            if(value.matches(regExPattern))
            {

                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }

        }while(!gotAValue);

        return value;
    }

}