import java.util.Scanner;

public class KiedesNote {
    // Create the Scanner
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        // Display the menu and ask for the user's input.
        System.out.println("Welcome to KiedesNote - For All Your Temporary Note Needs.");
        System.out.println("Please don't confuse us with other (lesser known) products like Evernote....");
        System.out.println("The best temporary notes system on the market - just ask us.");
        System.out.println("In order to get started, select from one of the options below:");
        System.out.println("1. Add a note.");
        System.out.println("2. Display all notes.");
        System.out.println("3. Display a random note.");
        System.out.println("4. Add and display all notes.");
        System.out.println("5. Display a random note.");
        System.out.println("6. Delete a note.");
        System.out.println("7. Quit program.");


        boolean run = true;
        do{
            // Take the user's choice and process it accordingly
            System.out.println("What would you like to do?");
            int choice = input.nextInt();
            switch(choice){
                case 1: NoteUtilities.addNote(); break;
                case 2: NoteUtilities.displayNotes(); break;
                case 3: NoteUtilities.displayRandomNote(); break;
                case 4: NoteUtilities.addAndDisplay(); break;
                case 5: NoteUtilities.displayRandomNote(); break;
                case 6: System.out.println("Which note would you like to delete?");
                        NoteUtilities.deleteNote(input.nextInt());
                        break;
                case 7: run = false; break;
                default: System.out.println("Sorry - I couldn't understand that.  Please try again."); break;
            }


        }while(run);
    }



}
