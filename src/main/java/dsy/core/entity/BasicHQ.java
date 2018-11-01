package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-10-30
 */

//@Entity
//@Table(name = "basic_hq")
public class BasicHQ extends BaseEntity{

    @Id
    private long id;

    private String symbol;

    private String code;

    private float changepercent;


    private float nmc; //流通市值

    private float mktcap; //市值

    private float pricechange;

    private float amount;//成交额

    private float volume;//成交量

    private float settlement; //昨日收盘价

    private float open;

    private float sell; //最新价

    private float buy;

    private float high;

    private float low;

    private float turnoverratio;//换手率

    private float pb;

    private float per;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getChangepercent() {
        return changepercent;
    }

    public void setChangepercent(float changepercent) {
        this.changepercent = changepercent;
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

    public float getPricechange() {
        return pricechange;
    }

    public void setPricechange(float pricechange) {
        this.pricechange = pricechange;
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

    public float getTurnoverratio() {
        return turnoverratio;
    }

    public void setTurnoverratio(float turnoverratio) {
        this.turnoverratio = turnoverratio;
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

    @Override
    public String toString() {
        return "BasicHQ{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", code='" + code + '\'' +
                ", changepercent=" + changepercent +
                ", nmc=" + nmc +
                ", mktcap=" + mktcap +
                ", pricechange=" + pricechange +
                ", amount=" + amount +
                ", volume=" + volume +
                ", settlement=" + settlement +
                ", open=" + open +
                ", sell=" + sell +
                ", buy=" + buy +
                ", high=" + high +
                ", low=" + low +
                ", turnoverratio=" + turnoverratio +
                ", pb=" + pb +
                ", per=" + per +
                '}';
    }
}
