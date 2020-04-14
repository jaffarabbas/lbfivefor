/**
 * task4
 */
class Android
{
    static int tag1;
    static String name;

    Android()
    {
        tag1 = 1;
        name = "bob";
        System.out.println(tag1);
        System.out.println(name);
    }
  
    Android(int tag)
    {
         System.out.println("New tag: "+ isPrime(change_tag(tag)));
         if(isPrime(change_tag(tag)) == true)
         {
            System.out.println(change_tag(tag)); 
         }
         else{
             System.out.println("Change the tag");
         }
    }

    static int change_tag(int tag){
        tag1=tag;
        return tag1;
    }

    public String get_name(String get_name)
    {
       name = get_name;
       return name;
    }

    private static boolean isPrime(int n)
    {
        if (n <= 1) 
        return false; 
        
        // Check from 2 to n-1 
       for (int i=2; i < n; i++) 
          if (n % i == 0) 
              return false; 

        
       return true;
    }

    public void change_Name(){
        System.out.println("Name : "+get_name("oopp"));
    }


    
}
public class task4 {
    public static void main(String[] args) {
        System.out.println("Default : ");
        Android obj = new Android();

        System.out.println("New instance : ");
        Android obj1 = new Android(23);
        obj1.change_Name();
        Android obj2 = new Android(2);
        obj1.change_Name();
    }
}