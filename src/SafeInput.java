import java.util.Scanner;

public class SafeInput {
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
                // We have a match this String passes!
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
