package dsy.entity;

import javax.persistence.*;

/**
 * @author dong
 * @since 18-10-22
 */
@Entity
@Table(name = "gdp_year")
public class GdpYear {
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
}
