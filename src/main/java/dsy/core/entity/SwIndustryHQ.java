package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author dong
 * @since 18-11-1
 * 新浪申万行情
 *
 * http://vip.stock.finance.sina.com.cn/q/view/SwHy.php
 */
@Entity
@Table(name = "sw_industry_hq")
public class SwIndustryHQ extends BaseEntity {

    @Id
    private String id;

    @Column(name = "code")
    private String code; //行业code

    @Column(name = "date")
    private Date date;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "count")
    private int count; //公司数量

    @Column(name = "avg_price")
    private float avg; //平均价

    @Column(name = "price_change")
    private float priceChange; //涨跌额

    @Column(name = "change_Percent")
    private float changePercent; //涨跌幅

    @Column(name = "amount")
    private float amount;//成交额

    @Column(name = "volume")
    private float volume;//成交量


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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public float getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(float priceChange) {
        this.priceChange = priceChange;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(float changePercent) {
        this.changePercent = changePercent;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
