import java.util.Scanner;
class area
{
    static Scanner obj = new Scanner(System.in);  
    static float PI=3.142f;
    public static void Area(double circle_radius)
    {
         double area_of_circle = PI*circle_radius*circle_radius;
         System.out.println("Area of Circle : "+area_of_circle);
    }
    public static void Area(double rec_width,double rec_length)
    {
        double area_rec= rec_width*rec_length;
        System.out.println("Area of Rectangle : "+area_rec);
    }
    public static void Area(float cylender_radius,double cylender_height)
    {
        double area_of_cylender = PI*cylender_radius*cylender_height;
        System.out.println("Area of Circle : "+area_of_cylender);
    }
}

class task1
{
    public static void main(String[] args) {    
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter mode \nc for circle\nr for rectangle\nl for cylinder");
        char ch=obj.next().charAt(0);
        if(ch =='c')
        {
        System.out.println("Enter Radius of Circle");
        double a=obj.nextDouble();  
        area.Area(a);
        }
        else if(ch == 'r')
        {
            System.out.println("Enter Width : ");
            double a=obj.nextDouble();
            System.out.println("Enter Height : ");
            double b =obj.nextDouble();
            area.Area(a,b);
        }
        else if(ch == 'l')
        {
            System.out.println("Enter Radius : ");
            float a = obj.nextFloat();
            System.out.println("Enter Height : ");
            double b= obj.nextDouble();
            area.Area(a,b);
        }
        obj.close();
    }
}