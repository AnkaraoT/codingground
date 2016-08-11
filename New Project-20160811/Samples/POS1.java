import java.util.List;
import java.util.ArrayList;

public class POS1{

     public static void main(String []args){
        //3,5 multiples up to 10
        //int[] intArr = {3,5,6,9};
        //int sumOfMultples = 23;
        System.out.println("start-program");
        System.out.println("Sum Of Multples for 3,5 is "+sumMultples(20));
        System.out.println("end-program");
     }
     
     private static int sumMultples(int x){
         List<Integer> list = new ArrayList<Integer>();
         int sum = 0;
         //Prepare array, which multiples of 3,5 up to x
         for(int i=1; i<x; i++){
             if(i%3==0 || i%5==0){
                list.add(i); // growable array
                sum=sum+i;
             }
         }
         
         System.out.println("List of Array : "+list);
         
         return sum;
     }
     
}
