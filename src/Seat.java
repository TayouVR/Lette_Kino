public class Seat {

    private Viewer occupant;
    private boolean isOccupied = false;

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy(Viewer viewer) {
        occupant = viewer;
        isOccupied = true;
    }

    public void print() {

    }
}
