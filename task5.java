
import java.util.Scanner;
import java.util.Random;

class Account
{ 
    static Scanner obj = new Scanner(System.in);
    static Random rand = new Random();
    static String accountTitle;
    static Long AccountNumber;
    static Long LastNumber=0L;
    static Long new_num;

    static void ac()
    {
        long Accountseries = rand.nextInt(100)+(500000000000000L);
        AccountNumber = Accountseries;
        LastNumber=AccountNumber;

        new_num = AccountNumber + rand.nextLong()%1000000;

        if(Accountseries == new_num)
        {
            System.out.println("Account is priviously created ");
            ac();
        }
    }


    static void show()
    {
        ac();
        System.out.println("Previous Account: "+LastNumber);
        System.out.println("Name : ");
        accountTitle=obj.next();
        System.out.println("Name : "+accountTitle);
        System.out.println("Account No: "+new_num);
    }
}


 class task5 {

    public static void main(String[] args) throws Exception{
            Account.show();
    }
 }