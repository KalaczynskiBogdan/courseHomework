package forProject;

public class Security extends Employees {
    public Security(String position, int countOfStaff) {
        super(position, countOfStaff);
    }

    @Override
    public void makingHisJob() {
        System.out.println("Security staff are keeping order of the camp");
    }
}
