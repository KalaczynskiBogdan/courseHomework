package forProject;

public class Employees {
    private String position;
    private int countOfStaff;
    private boolean b;

    public Employees(String position, int countOfStaff, boolean b) {
        this.position = position;
        this.countOfStaff = countOfStaff;
        this.b = b;
    }

    public void makingHisJob(){
        System.out.println("Employees are greeting the visitors");
    }
}
