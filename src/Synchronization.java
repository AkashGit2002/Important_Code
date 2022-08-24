package src;

class TestThread extends Thread {
    public static void main(String[] args) {

        // both loops run on a single thread
        for (byte i = 1; i <= 5; i++) {


            try {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Loop 1, Iteration: " + i);
        }


        for (byte i = 1; i <= 5; i++) {

            try {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Loop 2, Iteration: " + i);
        }
    }
}