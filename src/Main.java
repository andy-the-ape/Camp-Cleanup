import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        ArrayList<AssignmentPair> assignmentsList = new ArrayList<>();
        interpreter.interpret(assignmentsList);

        int containmentCount = 0;
        int assignmentCount = 0;
        for (AssignmentPair ap : assignmentsList) {
            assignmentCount++;
            if (ap.isFullyContained) {
                containmentCount++;
            }
        }
        System.out.println(containmentCount);
        System.out.println(assignmentCount);
    }
}
