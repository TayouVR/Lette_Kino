import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Movie {

    public String title;
    public float price;
    private ArrayList<Presentation> presentations = new ArrayList<>();

    Movie(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public Presentation getNextPresentation() {
        return presentations.get(presentations.size()-1);
    }

    public Presentation[] getAllPresentation() {
        return (Presentation[]) presentations.toArray();
    }

    public void newPresentation(Hall h, Date d, Time t) {
        presentations.add(new Presentation(this, d, t, h));
    }

    public void print() {
        System.out.println("\n----- List of all presentations for " + title + " -----");
        for (Presentation p: presentations) {
            System.out.println("Presentation " + p.date + p.time);
            p.ho.printAllSeats();
        }
    }

}
