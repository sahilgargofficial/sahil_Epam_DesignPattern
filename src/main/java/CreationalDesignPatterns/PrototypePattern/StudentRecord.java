package CreationalDesignPatterns.PrototypePattern;

public class StudentRecord implements Prototype {
    private int RollNo;
    private String Name;
    private String address;
    private StudentRecord()
    {
        System.out.println("Student Record of XYZ college");
        System.out.println("-------------------------------");
        System.out.println("RollNo"+"\t"+"Name"+"\t"+"Address");

    }
    public StudentRecord(int Rollno,String Name,String address)
    {
        this();
        this.RollNo = Rollno;
        this.Name = Name;
        this.address = address;

    }
    public void showRecord()
    {
        System.out.println(this.RollNo+"\t"+this.Name+"\t"+this.address);
        System.out.println();
    }
    public Prototype getClone() {
        return new StudentRecord(this.RollNo,this.Name,this.address);
    }
}
