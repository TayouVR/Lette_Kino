import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Presentation {

    public Date date;
    private Hall hall;
    private ArrayList<Viewer> viewerList = new ArrayList<>();
    private Movie linkedMovie;
    public HallOccupation ho;

    Presentation(Movie m, Date d, Hall h) {
        linkedMovie = m;
        date = d;
        hall = h;
        ho = new HallOccupation(hall);
    }

    public int book(Viewer viewer) {
        if (viewer.money >= linkedMovie.price) {
            if (ho.occupyFreeSeat(viewer)) {
                viewer.money -= linkedMovie.price;
                viewerList.add(viewer);
                System.out.println(viewer.name + " bought a ticket for " + linkedMovie.title + " for " + linkedMovie.price + "€ at " + date);
                return 0;
            }
            return 2;
        }
        return 1;
    }
}
