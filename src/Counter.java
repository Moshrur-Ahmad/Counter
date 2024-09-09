public class Counter {
    private int value;  //variable declaration
    public void click()
    {
        value=value+1;  //method
    }

    public Counter(int value) {
        this.value = value;
    }

    public Counter()
    {
       this.value=0;
    }

    public int getValue() {
        return value;    //method
    }
}               //Counter class has encapsulated this
