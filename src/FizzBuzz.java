public class FizzBuzz {


    public static void main(String[] args) {



        for ( int nbr=1 ; nbr < 150 ; nbr++){
            if (nbr%3 == 0 && nbr%5 !=0) {
                System.out.println(nbr + " : Fizz");
            }else if (nbr%5 == 0 && nbr%3 !=0){
                System.out.println(nbr + " : Buzz");
            }else if ( nbr%3==0 && nbr%5==0){
                System.out.println(nbr + " : FizzBuzz");
            }
        }


    }
}
