/**
 * Created by Puneet on 2017-07-24.
 */
public class FizzBuzz {
    public static void main(String args[]){
        int cnt = 1;

        while (cnt != 101) {
            if ((cnt % 3) == 0){
                System.out.println("Fizz");
            }
            else if (cnt % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(cnt);
            }
            cnt += 1;
        }
    }


}
