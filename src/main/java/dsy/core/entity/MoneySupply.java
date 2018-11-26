package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-10-23
 * 货币供应量
 */
@Entity
@Table(name = "money_supply")
public class MoneySupply extends BaseEntity {

    @Id
    private String id;

    @Column(name = "month")
    private String month;

    @Column
    private double m2;

    @Column
    private double m1;

    @Column
    private double m0;

    @Column(name = "m2_yoy")
    private double m2yoy;

    @Column(name = "m1_yoy")
    private double m1yoy;

    @Column(name = "m0_yoy")
    private double m0yoy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM0() {
        return m0;
    }

    public void setM0(double m0) {
        this.m0 = m0;
    }

    public double getM2yoy() {
        return m2yoy;
    }

    public void setM2yoy(double m2yoy) {
        this.m2yoy = m2yoy;
    }

    public double getM1yoy() {
        return m1yoy;
    }

    public void setM1yoy(double m1yoy) {
        this.m1yoy = m1yoy;
    }

    public double getM0yoy() {
        return m0yoy;
    }

    public void setM0yoy(double m0yoy) {
        this.m0yoy = m0yoy;
    }
}
