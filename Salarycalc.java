import java.util.*;

class Employee
{
    String ename, address, mailid;
    int eid;
    long mobile;
    double bp, da, hra, pf, sc, gs, ns;

    Scanner s = new Scanner(System.in);

    void setInput()
    {
        System.out.print("Enter Name : ");
        ename = s.next();

        System.out.print("Enter Address : ");
        address = s.next();

        System.out.print("Enter Mail ID : ");
        mailid = s.next();

        System.out.print("Enter Employee ID : ");
        eid = s.nextInt();

        System.out.print("Enter Mobile No : ");
        mobile = s.nextLong();
    }

    void cal(double daPer, double hraPer, double pfPer, double scPer)
    {
        da = bp * daPer / 100;
        hra = bp * hraPer / 100;
        pf = bp * pfPer / 100;
        sc = bp * scPer / 100;

        gs = bp + da + hra + pf + sc;
        ns = gs - pf - sc;
    }

    void display()
    {
        System.out.println("\n******** PAY SLIP ********");
        System.out.println("Name           : " + ename);
        System.out.println("Employee ID    : " + eid);
        System.out.println("Mail ID        : " + mailid);
        System.out.println("Address        : " + address);
        System.out.println("Mobile No      : " + mobile);
        System.out.println("Basic Pay      : " + bp);
        System.out.println("DA             : " + da);
        System.out.println("HRA            : " + hra);
        System.out.println("PF             : " + pf);
        System.out.println("Staff Club     : " + sc);
        System.out.println("Gross Salary   : " + gs);
        System.out.println("Net Salary     : " + ns);
    }
}

class Programmer extends Employee
{
    void setBasicPay()
    {
        do
        {
            System.out.print("Enter Basic Pay (15000-20000): ");
            bp = s.nextDouble();
        }
        while(bp < 15000 || bp > 20000);
    }
}

class AssistantProfessor extends Employee
{
    void setBasicPay()
    {
        do
        {
            System.out.print("Enter Basic Pay (20001-30000): ");
            bp = s.nextDouble();
        }
        while(bp < 20001 || bp > 30000);
    }
}

class AssociateProfessor extends Employee
{
    void setBasicPay()
    {
        do
        {
            System.out.print("Enter Basic Pay (30001-40000): ");
            bp = s.nextDouble();
        }
        while(bp < 30001 || bp > 40000);
    }
}

class Professor extends Employee
{
    void setBasicPay()
    {
        do
        {
            System.out.print("Enter Basic Pay (>40000): ");
            bp = s.nextDouble();
        }
        while(bp <= 40000);
    }
}

class Salarycalc
{
    public static void main(String args[])
    {
        Programmer p = new Programmer();
        p.setInput();
        p.setBasicPay();
        p.cal(97,10,12,1);
        p.display();

        AssistantProfessor ap = new AssistantProfessor();
        ap.setInput();
        ap.setBasicPay();
        ap.cal(110,20,12,5);
        ap.display();

        AssociateProfessor asp = new AssociateProfessor();
        asp.setInput();
        asp.setBasicPay();
        asp.cal(130,30,12,10);
        asp.display();

        Professor pr = new Professor();
        pr.setInput();
        pr.setBasicPay();
        pr.cal(140,40,12,15);
        pr.display();
    }
}