import java.awt.Desktop;
import java.util.Scanner;
import java.io.*;

/**
 * <h1>Resume - Patrick Withams</h1>
 *
 * This program is my resume! Feel free to read it
 * or compile and run it.
 * <br>
 * You can you contact me at either pwithams@gmail.com
 * or on 587-830-1321
 */
public class Resume
{
    public static void main(String[] args)
    {
        boolean runProgram = true;
        PatrickWithams yourNewIntern = new PatrickWithams();
        Scanner keyboardInput = new Scanner(System.in);

        while(runProgram) {
            System.out.print("\033[H\033[2J");
            System.out.println("Welcome to the resume of Patrick Withams!");
            System.out.println("To find out more about me, choose one of the following options:\n" +
                    "\n1 - Full Name" +
                    "\n2 - Email" +
                    "\n3 - Cell" +
                    "\n4 - About" +
                    "\n5 - Previous Experience" +
                    "\n6 - Nice to haves!" +
                    "\n7 - View Resume" +
                    "\n8 - Quit Program (so you can call Patrick!)");
           
          String userInput = keyboardInput.nextLine();

          switch (userInput) {
              case "1":
                  String name = yourNewIntern.getName();
                  System.out.println("Name: " + name);
                  break;
              case "2":
                  String email = yourNewIntern.getEmail();
                  System.out.println("Email: " + email);
                  break;
              case "3":
                  String cell = yourNewIntern.getCell();
                  System.out.println("Cell: " + cell);
                  break;
              case "4":
                  String about = yourNewIntern.getBio();
                  System.out.println("About: " + about);
                  break;
              case "5":
                  String experience = yourNewIntern.getExperience();
                  System.out.println("Experience: " + experience);
                  break;
              case "6":
                  String niceToHaves = yourNewIntern.getNiceToHaves();
                  System.out.println("Nice to Haves: " + niceToHaves);
                  break;
             case "7":
                  try { 
                  Desktop.getDesktop().open(new File("resume.pdf"));
                  } catch (IOException e) {
                      System.out.println(e.getMessage());
                  }
                  break;
              case "8":
                  System.out.println("Thanks for checking out my resume!");
                  System.exit(0);
              default:
                  System.out.println("Didn't recognize that choice, please try again!");
          }

          System.out.print("Enter any key to continue: ");
          keyboardInput.nextLine();
          
        }
    }
}
