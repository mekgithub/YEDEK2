package creatingclasses;

public class ProtectedExampleChild extends ProtectedExample {
    public int limit;
    public ProtectedExampleChild(int counter,int limit){
        super(counter);//we invoke the constratcor
        this.limit=limit;
    }
}
