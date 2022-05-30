package Dao;

import java.util.Date;

public class Factura {
    int id;
    int user_id;
    Date date_bill;
    int value;
    int type;

    public Factura() {
    }

    public Factura(int id, int user_id, Date date_bill, int value, int type) {
        this.id = id;
        this.user_id = user_id;
        this.date_bill = date_bill;
        this.value = value;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getDate_bill() {
        return date_bill;
    }

    public void setDate_bill(Date date_bill) {
        this.date_bill = date_bill;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", date_bill=" + date_bill +
                ", value=" + value +
                ", type=" + type +
                '}';
    }
}
