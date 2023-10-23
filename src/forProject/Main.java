package forProject;

public class Main {
    public static void main(String[] args) {
        Managers manager = new Managers("Manager", 1);
        Counselors counselors = new Counselors("Counselors", 2);
        Security security = new Security("Security", 3);
        manager.makingHisJob();
        counselors.playingWithKids();
        security.makingHisJob();
    }
}
