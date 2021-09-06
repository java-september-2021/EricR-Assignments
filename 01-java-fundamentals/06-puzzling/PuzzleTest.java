import java.util.Random;
import java.util.ArrayList;
public class PuzzleTest {
    public static void main(String[] args) {
        Puzzle puzzleTest = new Puzzle();
        //System.out.println(puzzleTest.make10Random());
        //System.out.println(puzzleTest.charGenerator());
        //System.out.println(puzzleTest.generatePassword());
        ArrayList<String> newSet = puzzleTest.getNewPasswordSet(10);
        for(int i=0; i<newSet.size(); i++){
            System.out.println(newSet.get(i));
        }
    }
    
}
