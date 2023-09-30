package Movie_Tickets;
import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        demo d = new demo();
        d.getname();
    }
}
class demo{
    static Scanner sc = new Scanner(System.in);
    static String [] movieList = {"1) Beast", "2) bhoot", "3) doctor", "4) KGF2", "5) doremon"};
    public static void getname(){
        String name;
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Welcome "+name);
        getmovie();
    }
    public static void getmovie(){
        System.out.println("Select the movie from your List : ");
        for(int i=0; i<movieList.length; i++){
            System.out.println(movieList[i]);
        }
        int choice = sc.nextInt();
        System.out.println("Please select the to watch: ");
        System.out.println(movieList[choice - 1]);        // movies number will mot show
//                                                                .substring(2,movieList[choice-1].length())
        getseat();
    }
    public static void getseat(){
        int n;
        System.out.println("How many seat your want have Please select ");
        n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Which seat number you want to have chose it");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int amount = n*150; // 1 tickets cost 150
        System.out.println("Total amount to pay : "+amount);
        System.out.println("Please select your bank to pay ");
        int bank=1;
        while(bank == 1){
            System.out.println("1) Axis Bank");
            System.out.println("2) ICICI Bank");
            System.out.println("3) Indian Bank");
            System.out.println("4) State Bank");
            int bak = sc.nextInt();
            switch(bak){
                case 1:
                    System.out.println("Welcome to Axis Bank");
                    break;
                case 2:
                    System.out.println("Welcome to ICICI Bank");
                    break;
                case 3:
                    System.out.println("Welcome to Indian Bank");
                    break;
                case 4:
                    System.out.println("Welcome to State Bank");
                    break;
            }
            break;
        }
        System.out.println("Enter the amount :");
        int amountpay = sc.nextInt();
        if(amountpay == amount){
            System.out.println("Your payment is successfully ");
            System.out.println("Your seat has been successfully booked");
            System.out.println("Thank you");
        }else{
            System.out.println("Enter valid amount ");
            System.out.println("your payment is failure pleae try again ");
        }
    }
}

