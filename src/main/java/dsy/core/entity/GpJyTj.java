package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-17
 */
@Entity
@Table(name = "gpjytj")
public class GpJyTj {

    @Id
    private String id;

    @Column
    private String date;

    @Column
    private String mkt;

    @Column
    private double mktVal;


    /**
     * 成交量
     */
    @Column
    private double turnoverVolume;

    /**
     * 成交额(亿元)
     */
    @Column
    private double turnoverValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMkt() {
        return mkt;
    }

    public void setMkt(String mkt) {
        this.mkt = mkt;
    }

    public double getMktVal() {
        return mktVal;
    }

    public void setMktVal(double mktVal) {
        this.mktVal = mktVal;
    }

    public double getTurnoverVolume() {
        return turnoverVolume;
    }

    public void setTurnoverVolume(double turnoverVolume) {
        this.turnoverVolume = turnoverVolume;
    }

    public double getTurnoverValue() {
        return turnoverValue;
    }

    public void setTurnoverValue(double turnoverValue) {
        this.turnoverValue = turnoverValue;
    }
}
