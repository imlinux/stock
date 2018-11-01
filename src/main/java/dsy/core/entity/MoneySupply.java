package dsy.core.entity;

import javax.persistence.*;

/**
 * @author dong
 * @since 18-10-23
 * 货币供应量
 */
@Entity
@Table(name = "money_supply")
public class MoneySupply extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "index")
    private long id;

    @Column(name = "month")
    private String month;

    @Column(name = "m2_yoy")
    private String m2yoy;

    @Column(name = "m1_yoy")
    private String m1yoy;

    @Column(name = "m0_yoy")
    private String m0yoy;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getM2yoy() {
        return m2yoy;
    }

    public void setM2yoy(String m2yoy) {
        this.m2yoy = m2yoy;
    }

    public String getM1yoy() {
        return m1yoy;
    }

    public void setM1yoy(String m1yoy) {
        this.m1yoy = m1yoy;
    }

    public String getM0yoy() {
        return m0yoy;
    }

    public void setM0yoy(String m0yoy) {
        this.m0yoy = m0yoy;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
