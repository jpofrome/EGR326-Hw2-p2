public enum Weekday {
    MONDAY(), TUESDAY(), WEDNESDAY(), THURSDAY(), FRIDAY();

    public static Weekday fromString(String s) {
        s = s.toLowerCase();

        if (s.equals("m") || s.equals("monday")) {
            return MONDAY;
        } else if (s.equals("t") || s.equals("tuesday")) {
            return TUESDAY;
        } else if (s.equals("w") || s.equals("wednesday")) {
            return WEDNESDAY;
        } else if (s.equals("r") || s.equals("thursday")) {
            return THURSDAY;
        } else if (s.equals("f") || s.equals("friday")) {
            return FRIDAY;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public String toShortName() {
        if (this == MONDAY){
            return "M";
        } else if (this == TUESDAY) {
            return "T";
        } else if (this == WEDNESDAY) {
            return "W";
        } else if (this == THURSDAY) {
            return "R";
        } else if (this == FRIDAY) {
            return "F";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        if (this == MONDAY){
            return "Monday";
        } else if (this == TUESDAY) {
            return "Tuesday";
        } else if (this == WEDNESDAY) {
            return "Wednesday";
        } else if (this == THURSDAY) {
            return "Thursday";
        } else if (this == FRIDAY) {
            return "Friday";
        } else {
            return "";
        }
    }
}