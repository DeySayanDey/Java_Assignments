package mypackage;

// Class to handle grade calculation and validation
public class GradeCalculator {

    // Method to validate marks
    public boolean isValidMark(int mark) {
        return mark > 0 && mark <= 100;
    }

    // Method to calculate total marks
    public long calculateTotal(int mark1, int mark2, int mark3) {
        return (long) mark1 + mark2 + mark3;
    }

    // Method to calculate average marks
    public double calculateAverage(long total) {
        return total / 3.0;
    }

    // Method to assign grade based on average marks
    public char assignGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else return 'D';
    }
}
