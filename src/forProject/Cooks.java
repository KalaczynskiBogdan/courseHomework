package forProject;

public class Cooks extends Employees {
    public Cooks(String position, int countOfStaff) {
        super(position, countOfStaff);
    }

    @Override
    public void makingHisJob() {
        System.out.println("Cook staff are cooking tasty food");
    }
}
