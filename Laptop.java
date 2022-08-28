import java.util.Scanner;

public class Laptop{
    private String name;
    private int price;
    private double dis;
    private double amt;

public Laptop(String n,int p){
    name=n;
    price=p;
}

public void compute(){
    if(price<=25000)
    dis=price*0.05;
    else if(price<=50000)
    dis=price*0.075;
    else if(price<=100000)
    dis=price*0.1;
    else
    dis=price*0.15;

    amt=price-dis;
}

public void display(){
    System.out.println("Name is:"+name);
    System.out.println("Discount is:"+dis);
    System.out.println("Amount is:"+amt);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name of the customer:");
    String n=sc.nextLine();
    System.out.println("Enter the price:");
    int p=sc.nextInt();
    Laptop obj=new Laptop(n,p);
    obj.compute();
    obj.display();
}
}