import java.util.*;
public class factorial{
    public static int fact(int x){
      if(x==0||x==1){
            return 1;
        }
        else{
            return x*fact(x-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(fact(x));

      

    }
}