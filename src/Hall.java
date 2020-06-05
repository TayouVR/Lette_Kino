public class Hall {
    private int _placesPerRow;
    private int _rows;
    private Seat[][] _seats;

    Hall (int placesPerRow, int rows) {
        this._placesPerRow = placesPerRow;
        this._rows = rows;

        // initialize array
        _seats = new Seat[rows][placesPerRow];
        for (int i = 0; i < _seats.length; i++) {
            for (int i1 = 0; i1 < _seats[i].length; i1++) {
                _seats[i][i1] = new Seat();
            }
        }
    }

    public int getAmountSeats() {
        return _rows * _placesPerRow;
    }

    public boolean occupyFreeSeat(Viewer viewer) {
        for (Seat[] s1: _seats) {
            for (Seat s: s1) {
                if (!s.isOccupied()) {
                    s.occupy(viewer);
                    return true;
                }
            }
        }
        return false;
    }

    public void printAllSeats() {
        for (Seat[] s1: _seats) {
            for (Seat s: s1) {
                s.print();
            }
        }
    }
}
