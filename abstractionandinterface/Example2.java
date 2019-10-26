package abstractionandinterface;

public class Example2<T> {
    private T one;
    private T two;
    private T three;

    public Example2(T one,T two,T three){
        this.one =one;
        this.two = two;
        this.three = three;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public T getTwo() {
        return two;
    }

    public void setTwo(T two) {
        this.two = two;
    }

    public T getThree() {
        return three;
    }

    public void setThree(T three) {
        this.three = three;
    }

    @Override
    public String toString() {
        return "Example2{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }

    public T findEqual(){
        T temp = this.one;
        if(this.two.equals(this.one) || this.two.equals(this.three)){
            temp=this.two;
        }
        return temp;
    }
}
