import java.util.Comparator;

public class CourseTimeComparator implements Comparator<Course>{

    //constructor
    public CourseTimeComparator () {}

    public int compare(Course course1, Course course2) {
        if(course1.getStartTime().compareTo(course2.getStartTime()) == 1) {
            return 1;
        } else if(course1.getStartTime().compareTo(course2.getStartTime()) == -1) {
            return -1;
        } else {
            if(course1.getDuration() > course2.getDuration()) {
                return 1;
            } else if(course1.getDuration() < course2.getDuration()){
                return -1;
            } else {
                return course1.getName().compareTo(course2.getName());
            }
        }
    }
}