import java.util.Arrays;

public class Main {

    // 1 ile 10000 arasındaki Armstrong sayilari bulun
    // N haneli bir sayının basamaklarının n'inci üstlerinin toplamı,
    // sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.


    public static void main(String[] args) {

        int number;

        int temp = 0;

       int sum = 0;

       int[] sol = new int[0];

       int div;

       int counter = 0;

       int length;

       while(temp < 10000) {


           number = temp;

           length = String.valueOf(temp).length();


           while(number > 0){

               div = number % 10;

               number /= 10;

               sum += Math.pow(div, length);


           }

            if(temp == sum){

                sol = Arrays.copyOf(sol, sol.length+1);

                sol[counter] = temp;

                counter++;


            }

            temp++;

            sum = 0;


    }

       for(int index = 1; index < sol.length; index++ ){


           System.out.println(sol[index]);



       }






    }





}