public class Box<T>  {
    
    T item;

    public void serItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
