public class ScheduleConflictException extends Exception{

    //gives error message to two conflicting courses
    public ScheduleConflictException (Course course1, Course course2) {
        super( "There is a class conflict between " + course1.toString() + " and " + course2.toString());
    }
}
