public class HallOccupation {

    private Hall _hall;
    private Seat[][] _seats;

    HallOccupation(Hall hall) {
        _hall = hall;

        // initialize array
        _seats = new Seat[hall.rows][hall.placesPerRow];
        for (int i = 0; i < _seats.length; i++) {
            for (int i1 = 0; i1 < _seats[i].length; i1++) {
                _seats[i][i1] = new Seat();
            }
        }
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
