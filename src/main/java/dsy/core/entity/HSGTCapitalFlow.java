package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author 董帅阳
 * @Date 19-2-27
 * @Version 1.0
 * 沪深港通资金流向
 **/
@Entity
@Table(name = "hsgt_capital_flow")
public class HSGTCapitalFlow extends BaseEntity {

    @Id
    private String id;

    private String dateTime;

    /**
     * 沪股通
     */
    private double hsMoney;

    /**
     * 深股通
     */
    private double ssMoney;

    /**
     * 北向资金
     */
    private double northMoney;


    /**
     * 港股通（）
     */
    private double gghsMoney;


    /**
     * 港股通
     */
    private double ggssMoney;

    /**
     * 南向资金
     */
    private double southSumMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public double getHsMoney() {
        return hsMoney;
    }

    public void setHsMoney(double hsMoney) {
        this.hsMoney = hsMoney;
    }

    public double getSsMoney() {
        return ssMoney;
    }

    public void setSsMoney(double ssMoney) {
        this.ssMoney = ssMoney;
    }

    public double getNorthMoney() {
        return northMoney;
    }

    public void setNorthMoney(double northMoney) {
        this.northMoney = northMoney;
    }

    public double getGghsMoney() {
        return gghsMoney;
    }

    public void setGghsMoney(double gghsMoney) {
        this.gghsMoney = gghsMoney;
    }

    public double getGgssMoney() {
        return ggssMoney;
    }

    public void setGgssMoney(double ggssMoney) {
        this.ggssMoney = ggssMoney;
    }

    public double getSouthSumMoney() {
        return southSumMoney;
    }

    public void setSouthSumMoney(double southSumMoney) {
        this.southSumMoney = southSumMoney;
    }
}
