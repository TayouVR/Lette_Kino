import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Start {

    public static void main(String[] args) {
        // make cinema
        Cinema c = new Cinema("Cinemax", new Hall[]{new Hall(30, 30), new Hall(50, 70), new Hall(15, 20), new Hall(35, 35)});
        c.printHalls();

        // make movies, add presentation
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Star Wars Part XVII", 149.99f));
        movies.get(0).newPresentation(c.getHallAtIndex(1),
                new Date(Date.UTC(2020, 8, 10, 12, 30, 0)),
                new Time(Date.UTC(2020, 8, 10, 12, 30, 0)));

        // make viewers
        Viewer hans = new Viewer("Hans", 25);
        hans.setMoney(20);
        Viewer peter = new Viewer("Peter", 25);
        peter.setMoney(200);

        // book presentation
        ERROR_CODE_HANDLER(movies.get(0).getNextPresentation().book(hans));
        ERROR_CODE_HANDLER(movies.get(0).getNextPresentation().book(peter));

        // check seats
        movies.get(0).print();
    }

    public static void ERROR_CODE_HANDLER(int errorCode) {
        switch (errorCode) {
            case 0:
                break; // program worked correctly
            case 1:
                System.out.println("[ERROR " + errorCode + "] The Person does not have enough money");
                break;
            case 2:
                System.out.println("[ERROR " + errorCode + "] The Presentation is already fully occupied");
                break;
            default:
                System.out.println("[ERROR " + errorCode + "] The error could not be identified");
                break;
        }
    }
}
