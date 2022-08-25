import java.util.Scanner;

public class SuccessiveDiscount{
    public void Discount(int price){
        System.out.println("Amount after single discount="+Discount(price,10));
        System.out.println("Amount after successive discount="+Discount(price,10,8));
    }
    public double Discount(int price,int d){
        double priceAfterDisc=price-price*d/100.0;
        return priceAfterDisc;
    }
    public double Discount(int price,int d1,int d2){
        double priceAfterDisc1=price-price*d1/100.0;
        double priceAfterDisc2=priceAfterDisc1-priceAfterDisc1*d2/100.0;
        return priceAfterDisc2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        SuccessiveDiscount obj=new SuccessiveDiscount();
        obj.Discount(price);
    }
}