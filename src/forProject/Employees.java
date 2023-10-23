package forProject;

public class Employees {
    private String position;
    private int countOfStaff;
    private String stringi;
    private boolean b;

    public Employees(String position, int countOfStaff, boolean b, String stringi) {
        this.position = position;
        this.countOfStaff = countOfStaff;
        this.stringi = stringi;
        this.b = b;
    }

    public void makingHisJob(){
        System.out.println("Employees are greeting the visitors");
    }
}
