package mypackage;

public class Student {
    // Attributes
    private String stName;
    private int stRoll;
    private int stMarks;
    private String stYear;

    // Default constructor
    public Student() {
        this.stName = null;
        this.stRoll = 0;
        this.stMarks = -1;
        this.stYear = null;
    }

    // Parameterized constructor
    public Student(String stName, int stRoll, int stMarks, String stYear) {
        if (stRoll >= 1 && stMarks <= 100 && stMarks >= 0) {
            this.stName = stName;
            this.stRoll = stRoll;
            this.stMarks = stMarks;
            this.stYear = stYear;
        } else {
            System.out.println("Invalid roll number or marks");
        }
    }

    // Getters and Setters
    public String getStName() { return stName; }
    public void setStName(String stName) { this.stName = stName; }

    public int getStRoll() { return stRoll; }
    public void setStRoll(int stRoll) { this.stRoll = stRoll; }

    public int getStMarks() { return stMarks; }
    public void setStMarks(int stMarks) { this.stMarks = stMarks; }

    public String getStYear() { return stYear; }
    public void setStYear(String stYear) { this.stYear = stYear; }

    // Display method
    public void display() {
        System.out.println("Name: " + stName);
        System.out.println("Roll: " + stRoll);
        System.out.println("Marks: " + stMarks);
        System.out.println("Year: " + stYear);
    }

    // Display roll and name
    public void displayRollName() {
        System.out.println("Roll: " + stRoll + ", Name: " + stName);
    }
}