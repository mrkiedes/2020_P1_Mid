import java.util.Scanner;
import java.util.Random;

/*
 * The NoteUltilites class keeps track of the list holding the notes and the index of the last note added.
 * This is important.  Since we cannot change the size of the static array once the program is created,
 * we make a list much longer than we will need (10,000 items in this case).
 *
 * Problem: We need to know how many notes are in the list in order to add them. We keep track of this
 * using a variable lastNote.
 *
 * For further details take a look at the program below.
 *
*/
public class NoteUtilities {
    // Setup noteList, input (the Scanner), rand, and lastNote
    static String[] noteList = new String[10000];
    static int lastNote = 0;
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    // Add a note to noteList
    public static void addNote(){
        System.out.println("Please type in the note you would like to add below:");
        String newNote = input.nextLine();
        noteList[lastNote] = newNote;
        lastNote++;
    }

    // Display all the notes in noteList
    // We add 1 to currentNote for purposes of display only
    public static void displayNotes(){
        for(int currentNote = 0; currentNote < lastNote; currentNote++){
            System.out.println((currentNote+1) + ". " + noteList[currentNote]);
        }
        System.out.println();
    }

    // Select a random note from noteList to display
    public static void displayRandomNote(){
        int randomNote = rand.nextInt(lastNote);
        System.out.println("Your random note was number " + (randomNote+1) + "!");
        System.out.println(noteList[randomNote]);
    }

    // Add and display all notes in one option - next level app development!
    public static void addAndDisplay(){
        addNote();
        displayNotes();
    }
}
