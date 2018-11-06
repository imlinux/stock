package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author dong
 * @since 18-11-6
 */
@Entity
@Table(name = "wh")
public class Wh extends BaseEntity {

    @Id
    public String id;

    public Date date;


    public String symbol;

    @Column(name = "prod_code")
    public String prodCode;

    @Column(name = "prod_name")
    public String prodName;

    @Column(name = "prod_en_name")
    public String prodEnName;

    @Column(name = "preclose_px")
    public double preClosePx;

    @Column(name = "price_precision")
    public String pricePrecision;

    @Column(name = "openPx")
    public double openPx;

    @Column(name = "high_px")
    public double highPx;

    @Column(name = "low_px")
    public double lowPx;

    @Column(name = "last_px")
    public double lastPx;

    @Column(name = "week_52_high")
    public double week52high;

    @Column(name = "week_52_low")
    public double week52low;

    @Column(name = "update_time")
    public long updateTime;

    @Column(name = "px_change")
    public double pxChange;

    @Column(name = "px_change_rate")
    public double pxChangeRate;

    @Column(name = "market_Type")
    public String marketType;

    @Column(name = "trade_status")
    public String tradeStatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdEnName() {
        return prodEnName;
    }

    public void setProdEnName(String prodEnName) {
        this.prodEnName = prodEnName;
    }

    public double getPreClosePx() {
        return preClosePx;
    }

    public void setPreClosePx(double preClosePx) {
        this.preClosePx = preClosePx;
    }

    public String getPricePrecision() {
        return pricePrecision;
    }

    public void setPricePrecision(String pricePrecision) {
        this.pricePrecision = pricePrecision;
    }

    public double getOpenPx() {
        return openPx;
    }

    public void setOpenPx(double openPx) {
        this.openPx = openPx;
    }

    public double getHighPx() {
        return highPx;
    }

    public void setHighPx(double highPx) {
        this.highPx = highPx;
    }

    public double getLowPx() {
        return lowPx;
    }

    public void setLowPx(double lowPx) {
        this.lowPx = lowPx;
    }

    public double getLastPx() {
        return lastPx;
    }

    public void setLastPx(double lastPx) {
        this.lastPx = lastPx;
    }

    public double getWeek52high() {
        return week52high;
    }

    public void setWeek52high(double week52high) {
        this.week52high = week52high;
    }

    public double getWeek52low() {
        return week52low;
    }

    public void setWeek52low(double week52low) {
        this.week52low = week52low;
    }

    @Override
    public long getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public double getPxChange() {
        return pxChange;
    }

    public void setPxChange(double pxChange) {
        this.pxChange = pxChange;
    }

    public double getPxChangeRate() {
        return pxChangeRate;
    }

    public void setPxChangeRate(double pxChangeRate) {
        this.pxChangeRate = pxChangeRate;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}
