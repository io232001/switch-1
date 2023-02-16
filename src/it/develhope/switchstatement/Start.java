package it.develhope.switchstatement;
import java.util.Scanner;

public class Start {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            String n;
            switch (number)
            {
                case 1:
                    n = "one";
                    break;
                case 2:
                    n = "two";
                    break;
                case 3:
                    n = "three";
                    break;
                case 4:
                    n = "four";
                    break;
                case 5:
                    n = "five";
                    break;
                case 6:
                    n = "six";
                    break;
                case 7:
                    n = "seven";
                    break;
                case 8:
                    n = "eight";
                    break;
                case 9:
                    n = "nine";
                    break;
                case 10:
                    n = "ten";
                    break;
                default:
                    System.out.println("Cannot give you the name");
                    continue;
            }

            System.out.println(number + "-->" + n);
        }
    }
}

