import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;


public class Schedule implements Cloneable{
    //variables
    private List<Course> schedule;
    private Set<Weekday> days;

    //constructor
    public Schedule() {
        schedule = new ArrayList<Course>();
        days = new TreeSet<Weekday>(days);

    }

    //add given course to schedule
    //public Course(String name, int credits, Set<Weekday> days, Time startTime, int duration)
    public void add(Course course) {
        schedule.add(course);
    }

    //returns copy of obj, following the contract of clone from the java api, deep copy
    @Override
    public Schedule clone() {
        Schedule cloneObj;
        try {
            cloneObj = (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error();
        }
        return cloneObj;
    }

    //get a matching course from schedule
    public Course getCourse(Weekday day, Time time) {
        for (Course s : schedule) {
            if (s.contains(day, time)) {
                return s;
            }
        }
        return null;
    }

    //remove specific course
    public void remove(Weekday day, Time time) {
        for (Course s : schedule) {
            if (s.contains(day, time)) {
                schedule.remove(s);
            }
        }
    }

    //
    public void save(PrintStream printStream, Comparable<Course> comparator) {
        //Collections.sort(this.schedule, comparator);
        for(Course course : schedule)
            printStream.println(course);
        printStream.close();
    }

    //get total amount of credits
    public int totalCredits() {
        int totalC = 0;
        for (Course s : schedule) {
            totalC += s.getCredits();
        }
        return totalC;
    }


}