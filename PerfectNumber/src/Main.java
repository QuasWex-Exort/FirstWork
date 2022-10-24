public class Main {


    // PERFECT NUMBER : 6 ----> 3 + 2 + 1   28 -----> 1, 2, 4, 7, 14

    public static void main(String[] args) {

    int min = 1;

    int max = 10000;

    for(min = 1; min <= max; min++){

        int sum = 0;


        for(int i = 1; i < min; i++){


            if((min % i) == 0){

                sum += i;

            }


        }

        if(sum == min){


            System.out.println(sum);


        }

    }








        }
















    }



