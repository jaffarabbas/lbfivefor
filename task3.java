/**
 * task3
 */

class Main{
            
    static double basicRate=0.04f;
    static double luxuryRate=0.1f;
    static double price_Main;
    static double new_br;
    static double new_lr;

    private static double roundToNearestvalue(double price)
    {
       double check  = Math.round(price * 100.0) / 100.0;
       price_Main = check;
       return price_Main;
    }

    static double changeBasicRateTo(double newRate)
    {      
          new_br = basicRate+newRate;
          return new_br;
    }

    static double changeLuxuryRateTo(double newRate)
    {      
          new_lr = luxuryRate+newRate;
          return new_lr;
    }

    static double computeCostBasic(double price)
    {
        price = price_Main;
        double result = price + new_br;
        double check  = Math.round(result * 100.0) / 100.0;
        return check;
    }

    static double computeCostLuxury(double price)
    {
        price = price_Main;
        double result = price + new_lr;
        double check  = Math.round(result * 100.0) / 100.0;
        return check;
    }


    public static double check(){
           return roundToNearestvalue(100.4567);  
}

}
public class task3 {
public static void main(String[] args) {
   Main obj = new Main();
   obj.check();
   System.out.println("Rate  : "+Main.changeBasicRateTo(Main.price_Main));
   System.out.println("Tax : "+Main.changeBasicRateTo(10));
   System.out.println("Rate + Tax : "+Main.computeCostBasic(Main.price_Main));

   System.out.println("Rate  : "+Main.changeLuxuryRateTo(Main.price_Main));
   System.out.println("Tax (L): "+Main.changeLuxuryRateTo(200));
   System.out.println("Rate + Tax (L): "+Main.computeCostLuxury(Main.price_Main));
}
}