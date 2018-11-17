package dsy.web.dto;

/**
 * @author dong
 * @since 18-11-17
 */
public class BuffettRationTo {

    private String date;

    private double mktVal;
    private double gdp;
    private double mktValGdp;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMktValGdp() {
        return mktValGdp;
    }

    public void setMktValGdp(double mktValGdp) {
        this.mktValGdp = mktValGdp;
    }

    public double getMktVal() {
        return mktVal;
    }

    public void setMktVal(double mktVal) {
        this.mktVal = mktVal;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}
