package com.yrtweb.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yrtweb.course.entities.pk.OrderItemPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {


    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPk id;
    private Integer qtd;
    private Double price;


    public OrderItem(){

    }

    public OrderItem(Order order, Product product, Integer qtd, Double price) {
        id = new OrderItemPk();
        id.setOrder(order);
        id.setProduct(product);
        this.qtd = qtd;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder(){

        return id.getOrder();

    }
    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQtd() {
        return qtd;
    }

    public Double getPrice() {
        return price;
    }


    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSubTotal(){
        return price*qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
