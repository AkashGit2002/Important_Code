package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Threadclass{
    private static float Remaining_hour(float price,int time){
        return price*time;
    }
    private static float FirstNhour(float price,int time){
        return price*time;
    }
    public static void main(String[] args)throws Exception {
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        int n=4;
        int r1=20;
        int r2=40;
        double tt=300.00;
        // so the covert into hour

        int th= (int) Math.ceil(tt/60);

        double total_cost= FirstNhour(20.0f,4)+Remaining_hour(40.0f,th-4);
        System.out.println("THe value"+total_cost);

    }
}