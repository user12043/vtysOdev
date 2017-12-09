package VtysProje.model;

/**
 * Created by 12043 on 9.12.2017
 * part of project vtysProje
 */

public class Product {
    private int id;
    private String name;
    private int unitPrice;
    private String detail;

    public Product() {
    }

    public Product(int id, String name, int unitPrice, String detail) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
