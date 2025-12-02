package systemdesign.designpattern.questions.librarymanagementsystem;

import java.util.Date;

public class Fine {
    private Fine() {
        //do nothing
    }

    private static final double FINE_PER_DAY = 1.0; // Example fine amount per day

    public static double calculateFine(Date dueDate) {
        Date today = new Date();
        long diffInMillis = today.getTime() - dueDate.getTime();
        long daysLate = diffInMillis / (1000 * 60 * 60 * 24);

        return daysLate > 0 ? daysLate * FINE_PER_DAY : 0;
    }
}
