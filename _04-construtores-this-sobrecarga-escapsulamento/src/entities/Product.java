package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    /*Esse Product vazio é um construtor padrão*/
    public  Product(){}
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    /* Sobrecarga - disponibilizar mais de uma opção da mesma operação
    sendo suas diferenças a lista de parametros */
    public Product(String name, double price){
        this.name = name;
        this.price = price;
/*      this.quantity = 10; --> opcional pois por padrão no Java
        objetos/arrays iniciam com 0
        E como não tem mais um atributo quantity pode ser apenas
        quantity = 0;
*/
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public  int getQuantity(){
        return quantity;
    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}