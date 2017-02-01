import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course>{

    //constructor
    public CourseNameComparator() {}

    public int compare(Course course1, Course course2) {
        return course1.getName().compareTo(course2.getName());
    }
}
