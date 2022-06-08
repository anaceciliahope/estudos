package atividades;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock() {
        return price * quantity;
    }
    public void addProduct(int quantity) {
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;

    }
    public String toString();{
        return name
        + ", $"
        + String.format("%.2f", price)
        + ", "
         + quantity
         + " Units, total: $"
          + String.format("%.2f", price totalValueinStock());

    }

}
