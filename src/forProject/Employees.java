package forProject;

public class Employees {
    private String position;
    private int countOfStaff;
    private String stringi;

    public Employees(String position, int countOfStaff, String stringi) {
        this.position = position;
        this.countOfStaff = countOfStaff;
        this.stringi = stringi;
    }

    public void makingHisJob(){
        System.out.println("Employees are greeting the visitors");
    }
}
