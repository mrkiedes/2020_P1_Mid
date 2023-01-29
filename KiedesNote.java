import java.util.Scanner;

public class KiedesNote {
    public static void main(String args[]){
        // This variable controls how long the program runs.
        boolean run = true;

        // Create the Scanner
        Scanner input = new Scanner(System.in);

        // Display the menu and ask for the user's input.
        do{
            System.out.println("Welcome to KiedesNote - For All Your Temporary Note Needs.");
            System.out.println("Please don't confuse us with other (lesser known) products like Evernote....");
            System.out.println("The best temporary notes system on the market - just ask us.");
            System.out.println("In order to get started, select from one of the options below:");
            System.out.println("1. Add a note.");
            System.out.println("2. Display all notes.");
            System.out.println("3. Display a random note.");
            System.out.println("4. Add and display all notes.");
            System.out.println("5. Quit program.");

            // Take the user's choice and process it accordingly
            int choice = input.nextInt();
            switch(choice){
                case 1: NoteUtilities.addNote(); break;
                case 2: NoteUtilities.displayNotes(); break;
                case 3: NoteUtilities.displayRandomNote(); break;
                case 4: NoteUtilities.addAndDisplay(); break;
                case 5: run = false; break;
                default: System.out.println("Sorry - I couldn't understand that.  Please try again."); break;
            }


        }while(run);

    }


}
