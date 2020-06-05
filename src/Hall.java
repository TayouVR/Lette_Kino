public class Hall {
    private int placesPerRow;
    private int rows;
    private Seat[][] seats;

    Hall (int placesPerRow, int rows) {
        this.placesPerRow = placesPerRow;
        this.rows = rows;
        seats = new Seat[rows][placesPerRow];
        for (int i = 0; i < seats.length; i++) {
            for (int i1 = 0; i1 < seats[i].length; i1++) {
                seats[i][i1] = new Seat();
            }
        }
    }

    public int getAmountSeats() {
        return rows * placesPerRow;
    }

    public boolean occupyFreeSeat(Viewer viewer) {
        for (Seat[] s1: seats) {
            for (Seat s: s1) {
                if (!s.isOccupied()) {
                    s.occupy(viewer);
                    return true;
                }
            }
        }
        return false;
    }
}
