package dsy.entity;

import javax.persistence.*;

/**
 * @author dong
 * @since 18-10-23
 * 融资融券
 */
@Entity
@Table(name = "fst_total_get")
public class Margin {

    @Id
    @GeneratedValue
    @Column(name = "index")
    private long id;

    //交易日期
    @Column(name = "tradeDate")
    private String tradeDate;

    //交易市场
    @Column(name = "exchangeCD")
    private String exchangeCD;

    //交易货币
    @Column(name = "currencyCD")
    private String currencyCD;

    //本日融余额
    @Column(name = "finVal")
    private Long finVal;

    //本日融资买入额
    @Column(name = "finBuyVal")
    private Long finBuyVal;

    //本日融券余量
    @Column(name = "secVol")
    private Long secVol;

    //本日融券余量金额
    @Column(name = "secVal")
    private Long secVal;

    //本日融券卖出量
    @Column(name = "secSellVol")
    private Long secSellVol;

    //本日融资融券余额
    @Column(name = "tradeVal")
    private Long tradeVal;

    //本日融资占融资融券余额比
    @Column(name = "finRatio")
    private Double finRatio;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getExchangeCD() {
        return exchangeCD;
    }

    public void setExchangeCD(String exchangeCD) {
        this.exchangeCD = exchangeCD;
    }

    public String getCurrencyCD() {
        return currencyCD;
    }

    public void setCurrencyCD(String currencyCD) {
        this.currencyCD = currencyCD;
    }

    public Long getFinVal() {
        return finVal;
    }

    public void setFinVal(Long finVal) {
        this.finVal = finVal;
    }

    public Long getFinBuyVal() {
        return finBuyVal;
    }

    public void setFinBuyVal(Long finBuyVal) {
        this.finBuyVal = finBuyVal;
    }

    public Long getSecVol() {
        return secVol;
    }

    public void setSecVol(Long secVol) {
        this.secVol = secVol;
    }

    public Long getSecVal() {
        return secVal;
    }

    public void setSecVal(Long secVal) {
        this.secVal = secVal;
    }

    public Long getSecSellVol() {
        return secSellVol;
    }

    public void setSecSellVol(Long secSellVol) {
        this.secSellVol = secSellVol;
    }

    public Long getTradeVal() {
        return tradeVal;
    }

    public void setTradeVal(Long tradeVal) {
        this.tradeVal = tradeVal;
    }

    public Double getFinRatio() {
        return finRatio;
    }

    public void setFinRatio(Double finRatio) {
        this.finRatio = finRatio;
    }
}
