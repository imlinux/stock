package dsy.web.dto;

/**
 * @author dong
 * @since 18-10-23
 * 沪深融资融券总额
 */
public class HSMargin {
    private String tradeDate;
    private Long finVal;

    private long tradeVal;
    //融资融券占gdp百分比
    private double tradeValGdp;

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Long getFinVal() {
        return finVal;
    }

    public void setFinVal(Long finVal) {
        this.finVal = finVal;
    }

    public long getTradeVal() {
        return tradeVal;
    }

    public void setTradeVal(long tradeVal) {
        this.tradeVal = tradeVal;
    }

    public double getTradeValGdp() {
        return tradeValGdp;
    }

    public void setTradeValGdp(double tradeValGdp) {
        this.tradeValGdp = tradeValGdp;
    }
}
