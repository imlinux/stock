package dsy.entity;

import javax.persistence.*;

/**
 * @author dong
 * @since 18-10-22
 */
@Entity
@Table(name = "gdp_year")
public class Gdp {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "gdp")
    private double gdp;

    //人均gdp
    @Column(name = "pc_gdp")
    private double pcGdp;

    //第一产业
    @Column(name = "pi")
    private double pi;

    //第二产业
    @Column(name = "si")
    private double si;

    //第三产业
    @Column(name = "ti")
    private double ti;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public double getPcGdp() {
        return pcGdp;
    }

    public void setPcGdp(double pcGdp) {
        this.pcGdp = pcGdp;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getSi() {
        return si;
    }

    public void setSi(double si) {
        this.si = si;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(double ti) {
        this.ti = ti;
    }
}
