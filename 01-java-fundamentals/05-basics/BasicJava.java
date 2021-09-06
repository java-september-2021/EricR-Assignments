import java.util.ArrayList;

public class BasicJava {
    public void basicloop() {
        for(int i=1; i<256 ; i++){
            System.out.println(i);
        }
        
    }
    public void countodd() {
        for(int i = 0; i < 256; i++){
            if (i%2 !=0){
                System.out.println(i);
            }
        }
    }
    public int totalsum(){
        int total = 0;
        for(int i = 0; i < 256; i++){
            total += i;
        }
        return total;
    }
    public void iterate(){
        int[] myarr = {1,3,52,7,9,13};
        for(int i : myarr){
            System.out.println(i);
        }
    }
    public void max(){
        int[]  myarr = {1,-3,52,7,-9,-13};
        int max = myarr[0];
        for(int i = 0; i < myarr.length; i++)
            if (myarr[i] > max){
                max = myarr[i];
            }
        System.out.println(max);
    }
    public ArrayList<Integer> oddarr(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i < 256; i++){
            if (i%2!=0);
        }
        return y;
    }

}
