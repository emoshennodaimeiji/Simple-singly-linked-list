package edu.zut.cn.linked;

public class Goods {
    int id;
    String name;
    double price;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    Goods next;

    public Goods(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
