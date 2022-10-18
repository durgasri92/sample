package Java_Basic;

public class Encapsulation {

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }


    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }



    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    private int EmpNo;
    private int SSN;
    private String EmpName;

    public int getbonus() {

        int BNS = 0;

        if(SSN == 2233355)
        {
            BNS = 100;
        }

        if(SSN == 2233359)
        {
            BNS = 80;
        }

        return BNS;

    }

public static void main(String[] args) {

Encapsulation obj = new Encapsulation();
obj.setSSN(2233355);
obj.setEmpNo(20);
obj.setEmpName("Durgasri");

    System.out.println("Emp Name is ==>"+ obj.getEmpName());
    System.out.println("Emp Age is ==>"+ obj.getEmpNo());
    System.out.println("Emp SSN is ==>"+ obj.getSSN());
    System.out.println("Emp SSN is ==>"+ obj.getbonus()+"%");
}
}