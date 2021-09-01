public class Fizzbuzz{
    public void count(){
        for(i=1; i <= 100; i++){
            String result = fizzbuzz(i);
            System.out.printf("Number: %d Result %s", i, result)

        }
    }

    public String fizzbuzz(int val){
        if(val % 3 == 0 && val % 5 == 0){
            return "Fizzbuzz";
        } else if (val % 3 == 0) {
            return 'Fizz';
        } else if (val % 5 == 0) {
            return 'Buzz';
        } else {
            return Integer.toString(val);
        }
    }
}