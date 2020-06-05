public class Hall {
    public int placesPerRow;
    public int rows;

    Hall (int placesPerRow, int rows) {
        this.placesPerRow = placesPerRow;
        this.rows = rows;
    }

    public int getAmountSeats() {
        return rows * placesPerRow;
    }
}
