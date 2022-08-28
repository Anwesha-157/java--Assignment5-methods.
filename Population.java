import java.util.Scanner;

public class Population{
    private float p;
    private float r;
public Population(float a,float b){
    p=a;
    r=b;
}
public void print(){
    float q=p;
    for(int y=2001;y<=2007;y++){
        q=q*(1+r/100);
        System.out.println("Population in "+y+" :"+q );
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter population in the year 2000:");
    float a=sc.nextFloat();
    System.out.println("Enter the rate:");
    float b=sc.nextFloat();

    Population obj=new Population(a,b);
    obj.print();
}
}