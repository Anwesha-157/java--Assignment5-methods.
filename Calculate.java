import java.util.Scanner;

public class Calculate{
    private int num;
    private int f;
    private int rev;

public Calculate(int n){
    num=n;
    f=0;
    rev=0;
}

public int prime(){
    f=1;
    if(num==0 || num==1)
    f=0;
    else
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            f=0;
            break;
        }
    }
    return f;
}

public int reverse(){
    int t=num;
    while(t!=0){
        int remainder=t%10;
        rev=rev*10+remainder;
        t/=10;
    }
    return rev;

}
public void display(){
    if(f==1 && rev==num)
    System.out.println(num+ "is prime palindrome");
    else
    System.out.println(num+ "is not prime palindrome");
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    Calculate obj=new Calculate(n);
    obj.prime();
    obj.reverse();
    obj.display();
}
}