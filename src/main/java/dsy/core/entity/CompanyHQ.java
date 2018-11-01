package dsy.core.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author dong
 * @since 18-10-30
 */

@Entity
@Table(name = "company_hq")
public class CompanyHQ extends BaseEntity {

    @Id
    private String id;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "code")
    private String code;

    @Column(name = "change_percent")
    private float changePercent;

    @Column(name = "nmc")
    private float nmc; //流通市值

    @Column(name = "mktcap")
    private float mktcap; //市值

    @Column(name = "price_change")
    private float priceChange;

    @Column(name = "amount")
    private float amount;//成交额

    @Column(name = "volume")
    private float volume;//成交量

    @Column(name = "settlement")
    private float settlement; //昨日收盘价

    @Column(name = "open")
    private float open;

    @Column(name = "sell")
    private float sell; //最新价

    @Column(name = "buy")
    private float buy;

    @Column(name = "high")
    private float high;

    @Column(name = "low")
    private float low;

    @Column(name = "turnover_ratio")
    private float turnoverRatio;//换手率

    @Column(name = "pb")
    private float pb;

    @Column(name = "pe")
    private float per;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(float changePercent) {
        this.changePercent = changePercent;
    }

    public float getNmc() {
        return nmc;
    }

    public void setNmc(float nmc) {
        this.nmc = nmc;
    }

    public float getMktcap() {
        return mktcap;
    }

    public void setMktcap(float mktcap) {
        this.mktcap = mktcap;
    }

    public float getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(float priceChange) {
        this.priceChange = priceChange;
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

    public float getSettlement() {
        return settlement;
    }

    public void setSettlement(float settlement) {
        this.settlement = settlement;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    public float getBuy() {
        return buy;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getTurnoverRatio() {
        return turnoverRatio;
    }

    public void setTurnoverRatio(float turnoverRatio) {
        this.turnoverRatio = turnoverRatio;
    }

    public float getPb() {
        return pb;
    }

    public void setPb(float pb) {
        this.pb = pb;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
