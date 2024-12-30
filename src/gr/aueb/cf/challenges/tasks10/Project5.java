package gr.aueb.cf.challenges.tasks10;

/**
 * Project 5: A theater management class that provides a book and a cancel method to manage
 * a 30 x 12 theater. The methods check for the validity of the seat and if they are booked beforehand.
 *
 * @author klei
 */
public class Project5 {
    private static final boolean[][] theaterSeats = new boolean[30][12];

    public static void main(String[] args) {

        //Book a seat
        book('C', 2);
        //Trying to book an already booked seat
        book('C', 2);

        //cancel a booked seat
        cancel('C', 2);
        //trying to cancel an unbooked seat
        cancel('C', 2);

        //invalid seat booking
        book('A', 31);
        //invalid seat canceling
        cancel('Z', 12);
    }

    public static void book(char column, int row) {
        if (!isValidSeat(column, row)) {
            System.out.println("Invalid seat position!");
            return;
        }

        int columnIndex = column - 'A';
        int rowIndex = row - 1;

        if (isBookedSeat(theaterSeats, column, row)) {
            System.out.printf("The seat: %c%d is already booked!\n", column, row);
        } else {
            theaterSeats[columnIndex][rowIndex] = true;
            System.out.printf("Seat: %c%d, was booked successfully.\n", column, row);
        }
    }

    public static void cancel(char column, int row) {
        if (!isValidSeat(column, row)) {
            System.out.println("Invalid seat position!");
            return;
        }

        int columnIndex = column - 'A';
        int rowIndex = row - 1;

        if (isBookedSeat(theaterSeats, column, row)) {
            theaterSeats[columnIndex][rowIndex] = false;
            System.out.printf("Booked seat: %c%d, was canceled successfully.\n", column, row);
        } else {
            System.out.printf("The seat: %c%d is not booked!\n", column, row);
        }
    }

    public static boolean isValidSeat(char column, int row) {
        return (column >= 'A' && column <= 'L') && (row >= 1 && row <= 30);
    }

    public static boolean isBookedSeat(boolean[][] theaterSeats, char column, int row) {
        return theaterSeats[column - 'A'][row - 1];
    }
}


// todo:
//  public static void loadBookedSeatsFromFile() {}
//  public static void saveBookedSeatsToFile() {}
