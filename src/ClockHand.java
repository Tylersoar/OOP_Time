import java.time.Clock;

public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.value = 0;
        this.limit = limit;
    }

    public void advance(){
        this.value++;

        if(this.value >= limit){
            this.value = 0;
        }
    }
    public int getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        if (this.value < 10){
            return "0" + this.value;
        }
        return " " + this.value;
    }
}
