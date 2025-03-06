package fine;

public class FineCalculator {
    public int calculateFine(int daysLate) {

        int fine = 0;

        if (daysLate <= 5) {
            fine = daysLate * 2;
        } else if (daysLate <= 10) {
            fine = (5 * 2) + ((daysLate - 5) * 3);
        } else {
            fine = (5 * 2) + (5 * 3) + ((daysLate - 10) * 5);
        }

        return fine;
    }
}
