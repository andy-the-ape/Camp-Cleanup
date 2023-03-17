import java.util.ArrayList;

public class AssignmentPair {
    boolean isFullyContained = false;
    public ArrayList<Integer> leftAssignment = new ArrayList<>();
    public ArrayList<Integer> rightAssignment = new ArrayList<>();

    public AssignmentPair() {

    }
    public static boolean containsAll(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Check if list1 contains all the elements in list2
        for (Integer i : list2) {
            if (!list1.contains(i)) {
                return false;
            }
        }
        // Check if list2 contains all the elements in list1
        for (Integer i : list1) {
            if (!list2.contains(i)) {
                return false;
            }
        }
        return true;
    }


//        if (leftAssignment.containsAll(rightAssignment)) {
//            this.isFullyContained = true;
//        }
//        else if (rightAssignment.containsAll(leftAssignment)) {
//            this.isFullyContained = true;
//        }
//        else {
//            this.isFullyContained = false;
//        }

}
