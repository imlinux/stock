package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 股东人数
 */
@Entity
@Table(name = "gdrs")
public class GdRs extends BaseEntity {

    @Id
    private String id;

    private String code;

    private String date;

    private String gdrs;

    //股东人数较上期变化(%)
    @Column(name = "gdrs_jsqbh")
    private String gdrsJsqbh;

    //人均流通股
    private String rjltg;

    //人均流通股较上期变化(%)
    @Column(name = "rjltg_jsqbh")
    private String rjltgJsqbh;


    //筹码集中度
    private String cmjzd;

    //股价
    private String gj;

    //人均持股金额
    private String rjcgje;

    //前十大股东持股合计(%)
    private String qsdgdcghj;

    //前十大流通股东持股合计(%)
    private String qsdltgdcghj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGdrs() {
        return gdrs;
    }

    public void setGdrs(String gdrs) {
        this.gdrs = gdrs;
    }

    public String getGdrsJsqbh() {
        return gdrsJsqbh;
    }

    public void setGdrsJsqbh(String gdrsJsqbh) {
        this.gdrsJsqbh = gdrsJsqbh;
    }

    public String getRjltg() {
        return rjltg;
    }

    public void setRjltg(String rjltg) {
        this.rjltg = rjltg;
    }

    public String getRjltgJsqbh() {
        return rjltgJsqbh;
    }

    public void setRjltgJsqbh(String rjltgJsqbh) {
        this.rjltgJsqbh = rjltgJsqbh;
    }

    public String getCmjzd() {
        return cmjzd;
    }

    public void setCmjzd(String cmjzd) {
        this.cmjzd = cmjzd;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getRjcgje() {
        return rjcgje;
    }

    public void setRjcgje(String rjcgje) {
        this.rjcgje = rjcgje;
    }

    public String getQsdgdcghj() {
        return qsdgdcghj;
    }

    public void setQsdgdcghj(String qsdgdcghj) {
        this.qsdgdcghj = qsdgdcghj;
    }

    public String getQsdltgdcghj() {
        return qsdltgdcghj;
    }

    public void setQsdltgdcghj(String qsdltgdcghj) {
        this.qsdltgdcghj = qsdltgdcghj;
    }
}
