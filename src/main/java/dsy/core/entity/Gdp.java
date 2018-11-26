package dsy.core.entity;

import javax.persistence.*;

/**
 * @author dong
 * @since 18-10-22
 */
@Entity
@Table(name = "gdp")
public class Gdp extends BaseEntity {

    @Id
    private String quarter;

    @Column(name = "gdp")
    private double gdp;

    //国内生产总值同比增长(%)
    @Column(name = "gdp_yoy")
    private double gdpYoy;

    //第一产业
    @Column(name = "pi")
    private double pi;

    @Column(name = "pi_yoy")
    private double piYoy;

    //第二产业
    @Column(name = "si")
    private double si;

    @Column(name = "si_yoy")
    private double siYoy;

    //第三产业
    @Column(name = "ti")
    private double ti;

    @Column(name = "ti_yoy")
    private double tiYoy;


    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public double getGdpYoy() {
        return gdpYoy;
    }

    public void setGdpYoy(double gdpYoy) {
        this.gdpYoy = gdpYoy;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPiYoy() {
        return piYoy;
    }

    public void setPiYoy(double piYoy) {
        this.piYoy = piYoy;
    }

    public double getSi() {
        return si;
    }

    public void setSi(double si) {
        this.si = si;
    }

    public double getSiYoy() {
        return siYoy;
    }

    public void setSiYoy(double siYoy) {
        this.siYoy = siYoy;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }

    public double getTiYoy() {
        return tiYoy;
    }

    public void setTiYoy(double tiYoy) {
        this.tiYoy = tiYoy;
    }
}
