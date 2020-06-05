public class Cinema {
    private String name;
    private Hall[] hallList;

    Cinema(String n, Hall[] halls) {
        name = n;
        hallList = halls;
    }

    public void printHalls() {
        System.out.println("\n------ " + name + " Halls ------");
        int index = 1;
        for (Hall h: hallList) {
            System.out.println("[" + index + "] " + h.getAmountSeats() + " Seats");
            index++;
        }
        System.out.println("-------" + new String(new char[name.length()]).replace("\0", "-") + "-------------");
    }

    public Hall getHallAtIndex(int i) {
        return hallList[i];
    }
}
