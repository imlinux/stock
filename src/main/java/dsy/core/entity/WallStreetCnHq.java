package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author dong
 * @since 18-11-2
 * 华尔街见闻个股行情
 */
@Entity
@Table(name = "wall_street_cn_hq")
public class WallStreetCnHq extends BaseEntity {

    @Id
    private String id;

    @Column(name = "market_Type")
    public MarketType marketType;

    @Column(name = "prod_name")
    private String prodName;

    @Column(name = "prod_en_name")
    private String prodEnName;

    @Column(name = "prod_code")
    private String prodCode;

    @Column(name = "symbol")
    private String symbol;

    /**
     * 最新价
     */
    @Column(name = "last_px")
    private double lastPx;

    /**
     * 涨跌额
     */
    @Column(name = "px_change")
    private double pxChange;

    /**
     * 涨跌幅
     */
    @Column(name = "px_change_rate")
    private double pxChangeRate;

    /**
     * 昨收
     */
    @Column(name = "preclose_px")
    private double preClosePx;

    /**
     * 开盘价
     */
    @Column(name = "open_px")
    private double openPx;

    /**
     *  收盘价
     */
    @Column(name = "close_px")
    private double closePx;

    /**
     * 最高价
     */
    @Column(name = "high_px")
    private double highPx;

    /**
     * 最低价
     */
    @Column(name = "low_px")
    private double lowPx;

    /**
     * 52周最高价
     */
    @Column(name = "week_52_high")
    private double week52High;

    /**
     * 52周最低价
     */
    @Column(name = "week_52_low")
    private double week52Low;

    @Column(name = "price_precision")
    private String pricePrecision;

    /**
     * 流通市值
     */
    @Column(name = "circulation_value")
    private double circulationValue;

    /**
     * 总市值
     */
    @Column(name = "market_value")
    private double marketValue;
    /**
     * 动态pe
     */
    @Column(name = "dyn_pe")
    private double dynPe;

    /**
     * 动态pb
     */
    @Column(name = "dyn_pb_rate")
    private double dynPbRate;

    /**
     * 成交量
     */
    @Column(name = "turnover_volume")
    private double turnoverVolume;

    /**
     * 成交额
     */
    @Column(name = "turnover_value")
    private double turnoverValue;

    /**
     * 换手率
     */
    @Column(name = "turnover_ratio")
    private double turnoverRatio;

    /**
     * 振幅
     */
    @Column(name = "amplitude")
    private double amplitude;

    @Column(name = "trade_status")
    private String tradeStatus;

    @Column(name = "date")
    private Date date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MarketType getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketType marketType) {
        this.marketType = marketType;
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

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getLastPx() {
        return lastPx;
    }

    public void setLastPx(double lastPx) {
        this.lastPx = lastPx;
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

    public double getPreClosePx() {
        return preClosePx;
    }

    public void setPreClosePx(double preClosePx) {
        this.preClosePx = preClosePx;
    }

    public double getWeek52High() {
        return week52High;
    }

    public void setWeek52High(double week52High) {
        this.week52High = week52High;
    }

    public double getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(double week52Low) {
        this.week52Low = week52Low;
    }

    public String getPricePrecision() {
        return pricePrecision;
    }

    public void setPricePrecision(String pricePrecision) {
        this.pricePrecision = pricePrecision;
    }

    public double getCirculationValue() {
        return circulationValue;
    }

    public void setCirculationValue(double circulationValue) {
        this.circulationValue = circulationValue;
    }

    public double getDynPe() {
        return dynPe;
    }

    public void setDynPe(double dynPe) {
        this.dynPe = dynPe;
    }

    public double getDynPbRate() {
        return dynPbRate;
    }

    public void setDynPbRate(double dynPbRate) {
        this.dynPbRate = dynPbRate;
    }

    public double getTurnoverValue() {
        return turnoverValue;
    }

    public void setTurnoverValue(double turnoverValue) {
        this.turnoverValue = turnoverValue;
    }

    public double getTurnoverRatio() {
        return turnoverRatio;
    }

    public void setTurnoverRatio(double turnoverRatio) {
        this.turnoverRatio = turnoverRatio;
    }

    public double getTurnoverVolume() {
        return turnoverVolume;
    }

    public void setTurnoverVolume(double turnoverVolume) {
        this.turnoverVolume = turnoverVolume;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getClosePx() {
        return closePx;
    }

    public void setClosePx(double closePx) {
        this.closePx = closePx;
    }
}
