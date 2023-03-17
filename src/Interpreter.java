import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Interpreter {
    File textFile;

    public Interpreter() {
        textFile = new File("src/assignments.txt");
    }

    public void interpret(ArrayList<AssignmentPair> assignmentList) {
        try {
            FileReader fr = new FileReader(textFile);
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                StringBuilder sb = new StringBuilder();
                String textLine = sc.nextLine();
                String[] stringArrayInts;
                int[] intArray = new int[4];
                AssignmentPair ap = new AssignmentPair();
                stringArrayInts = textLine.split("[-,]");

                for (int i = 0; i < 4; i++) {
                    intArray[i] = Integer.parseInt(stringArrayInts[i]);
                }



                for (int i = intArray[0]; i < intArray[1]; i++) {
                    ap.leftAssignment.add(i);
                }
                for (int i = intArray[2]; i < intArray[3]; i++) {
                    ap.rightAssignment.add(i);
                }

                ap.isFullyContained = AssignmentPair.containsAll(ap.leftAssignment,ap.rightAssignment)||
                        AssignmentPair.containsAll(ap.rightAssignment,ap.leftAssignment);
                assignmentList.add(ap);
            }
            sc.close();
            fr.close();
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Runtime Exception!");
        }
    }
}
