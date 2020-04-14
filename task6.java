/**
 * task4
 */

import java.util.Scanner;

class Geomtery
{
   static double PI = 3.142f;
   public static double sphereVolume(double r){
       double sphereVolume = (4/3)*PI*(r*r*r);
       return sphereVolume;
   }
   public static double sphereSurface(double r){
       double sphereSurface = 4*PI*(r*r);
       return sphereSurface;
   }
   public static double cylinderVolume(double r, double h){
       double cylinderVolume = PI*(r*r)*h;
       return cylinderVolume;
   }
   public static double cylinderSurface(double r, double h){
       double cylinderSurface = (2*PI*r*h)+(2*PI*r*r);
       return cylinderSurface;
   }
   public static double coneVolume(double r, double h){
       double coneVolume = PI*r*r*h/3;
       return coneVolume;
   }
   public static double coneSurface(double r, double h){
       double l = Math.sqrt(r * r + h * h);
       double coneSurface = PI*r*r*(r+l);
       return coneSurface;
   }


}
public class task6 {
   public static void main(String[] args) {
       Geomtery obj = new Geomtery();
       Scanner scan = new Scanner(System.in);
       System.out.println("Radius : ");
       double r =scan.nextDouble();
       System.out.println("Height : ");
       double h =scan.nextDouble();
       System.out.println("Enter your mode  : \n1)Volume of Sphere\n2)Surface of Sphere\n3)Volume of Cylinder\n4)Surface of Cylinder\n5)Volume of Cone\n6)Suface of Cone\n");
       System.out.print("Enter : (1 to 6) : ");
       int a = scan.nextInt();
       switch (a) {
           case 1:
           System.out.println("Volume of Sphere : "+obj.sphereVolume(r));
               break;
           case 2:
           System.out.println("Surface of Sphere : "+obj.sphereSurface(r));
           break;
           case 3:
           System.out.println("Volume of Cylinder : "+obj.cylinderVolume(r,h));
           break;
           case 4:
           System.out.println("Surface of Cylinder : "+obj.cylinderSurface(r, h));
           break;
           case 5:
           System.out.println("Volume of Cone : "+obj.coneVolume(r, h));
           break;
           case 6:
           System.out.println("Suface of Cone : "+obj.coneSurface(r, h));
           default:
           System.out.println("Error");
               break;
       } 
   }
}