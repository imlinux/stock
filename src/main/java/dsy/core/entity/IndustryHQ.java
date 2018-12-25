package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-1
 */
@Entity
@Table(name = "industry_hq")
public class IndustryHQ extends BaseEntity {

    @Id
    private String id;

    @Column(name = "code")
    private String code; //行业code

    @Column(name = "date")
    private String date;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "change_Percent")
    private double changePercent; //涨跌幅

    /**
     * 换手率
     */
    @Column(name = "turnover_ratio")
    private double turnoverRatio;


    /**
     * 总市值
     */
    @Column(name = "market_value")
    private double marketValue;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(double changePercent) {
        this.changePercent = changePercent;
    }

    public double getTurnoverRatio() {
        return turnoverRatio;
    }

    public void setTurnoverRatio(double turnoverRatio) {
        this.turnoverRatio = turnoverRatio;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
