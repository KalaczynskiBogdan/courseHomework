package forProject;

public class Employees {
    private String position;
    private int countOfStaff;

    public Employees(String position, int countOfStaff) {
        this.position = position;
        this.countOfStaff = countOfStaff;
    }

    public void makingHisJob(){
        System.out.println("Employees are greeting the visitors");
    }
}
