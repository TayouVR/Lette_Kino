import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Presentation {

    private Date date;
    private Time time;
    private Hall hall;
    private ArrayList<Viewer> viewerList = new ArrayList<>();
    private Movie linkedMovie;

    Presentation(Movie m, Date d, Time t, Hall h) {
        linkedMovie = m;
        date = d;
        time = t;
        hall = h;
    }

    public int book(Viewer viewer) {
        if (viewer.money >= linkedMovie.price) {
            if (hall.occupyFreeSeat(viewer)) {
                viewer.money -= linkedMovie.price;
                viewerList.add(viewer);
                System.out.println(viewer.name + " bought a ticket for " + linkedMovie.title + " for " + linkedMovie.price + "€");
                return 0;
            }
            return 2;
        }
        return 1;
    }
}
