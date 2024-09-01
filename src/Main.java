public class Main {
    public static void main(String[] args) {
        Timer clock = new Timer();

        while (true){
            System.out.println(clock);
            clock.advance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}