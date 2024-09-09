import java.util.concurrent.Callable;

public class CounterRunner {

    public static void main(String[] args) {
        Counter counter=new Counter(4);  /**
         creating object of the counter class
         */
        System.out.println(counter.getValue());
        int value= counter.getValue();
        counter.click();
        int value1= counter.getValue();
        System.out.println(value);
        System.out.println(value1);
    }
}
