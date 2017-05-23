/**
 * Created by stephenpegram on 5/23/17.
 */
public class Money<T> {

    private T dollars;
    private T cents;

    Money(T dollars, T cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    Money(){
        this.dollars = null;
        this.cents = null;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public T getDollars() {
        return dollars;
    }

    public T getCents() {
        return cents;
    }

    @Override
    public String toString(){
        return "$"+getDollars()+"."+getCents();
    }
}
