import java.util.Comparator;

public class CourseCreditComparator implements Comparator<Course>{

    //constructor
    public CourseCreditComparator() {}

    public int compare(Course course1, Course course2) {
        if(course1.getCredits() > course2.getCredits()) {
            return 1;
        } else if(course1.getCredits() < course2.getCredits()) {
            return -1;
        } else {
            return course1.getName().compareTo(course2.getName());
        }
    }
}
