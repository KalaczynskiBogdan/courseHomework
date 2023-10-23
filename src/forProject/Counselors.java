package forProject;

public class Counselors extends Employees {
    public Counselors(String position, int countOfStaff) {
        super(position, countOfStaff);
    }

    @Override
    public void makingHisJob() {
        System.out.println("Camp counselors are looking after the kids");
    }
    public void playingWithKids(){
        System.out.println("Camp counselors are playing with kids");
    }
}
