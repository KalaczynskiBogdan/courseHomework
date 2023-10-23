package forProject;

public class Managers extends Employees {

    public Managers(String position, int countOfStaff) {
        super(position, countOfStaff);
    }

    @Override
    public void makingHisJob() {
        System.out.println("Manager is keeping order of his employees");
    }
}
