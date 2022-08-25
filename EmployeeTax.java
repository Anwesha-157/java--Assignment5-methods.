import java.util.Scanner;

public class EmployeeTax{
    public void Tax(String name,int income){
        double Tax;
        if(income<=250000)
        Tax=0;
        else if(income<=500000)
        Tax=(income-250000)*0.1;
        else if(income<=1000000)
        Tax=30000+((income-500000)*0.2);
        else
        Tax=50000+((income-1000000)*0.3);

        System.out.println("Name="+name);
        System.out.println("Income Tax="+Tax);
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name:");
    String name=sc.nextLine();
    System.out.println("Enter annual income:");
    int income=sc.nextInt();
    EmployeeTax obj=new EmployeeTax();
    obj.Tax(name,income);
}
}