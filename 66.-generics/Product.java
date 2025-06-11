public class Product<T, U> {
    
    T item;
    U price;

    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return this.item;
    }

    public U getprice() {
        return this.price;
    }
}
