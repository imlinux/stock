package dsy.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-17
 */
@Entity
@Table(name = "capital_flow")
public class CapitalFlow {

    @Id
    private String id;

    @Column
    private String code;

    @Column
    private String name;

    @Column
    private String date;

    @Column
    private double zdf; //涨跌幅

    @Column
    private double zllr;

    @Column
    private double zllc;

    @Column
    private double zlje;

    @Column
    private double cddlr;

    @Column
    private double cddlc;

    @Column
    private double cddje;

    @Column
    private double ddlr;

    @Column
    private double ddlc;

    @Column
    private double ddje;

    @Column
    private double zdlr; //中单流入

    @Column
    private double zdlc;

    @Column
    private double zdje;

    @Column
    private double xdlr;

    @Column
    private double xdlc;

    @Column
    private double xdje;

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

    public double getZllr() {
        return zllr;
    }

    public void setZllr(double zllr) {
        this.zllr = zllr;
    }

    public double getZllc() {
        return zllc;
    }

    public void setZllc(double zllc) {
        this.zllc = zllc;
    }

    public double getCddlr() {
        return cddlr;
    }

    public void setCddlr(double cddlr) {
        this.cddlr = cddlr;
    }

    public double getCddlc() {
        return cddlc;
    }

    public void setCddlc(double cddlc) {
        this.cddlc = cddlc;
    }

    public double getDdlr() {
        return ddlr;
    }

    public void setDdlr(double ddlr) {
        this.ddlr = ddlr;
    }

    public double getDdlc() {
        return ddlc;
    }

    public void setDdlc(double ddlc) {
        this.ddlc = ddlc;
    }

    public double getZdlr() {
        return zdlr;
    }

    public void setZdlr(double zdlr) {
        this.zdlr = zdlr;
    }

    public double getZdlc() {
        return zdlc;
    }

    public void setZdlc(double zdlc) {
        this.zdlc = zdlc;
    }

    public double getXdlr() {
        return xdlr;
    }

    public void setXdlr(double xdlr) {
        this.xdlr = xdlr;
    }

    public double getXdlc() {
        return xdlc;
    }

    public void setXdlc(double xdlc) {
        this.xdlc = xdlc;
    }

    public double getZlje() {
        return zlje;
    }

    public void setZlje(double zlje) {
        this.zlje = zlje;
    }

    public double getCddje() {
        return cddje;
    }

    public void setCddje(double cddje) {
        this.cddje = cddje;
    }

    public double getDdje() {
        return ddje;
    }

    public void setDdje(double ddje) {
        this.ddje = ddje;
    }

    public double getZdje() {
        return zdje;
    }

    public void setZdje(double zdje) {
        this.zdje = zdje;
    }

    public double getXdje() {
        return xdje;
    }

    public void setXdje(double xdje) {
        this.xdje = xdje;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getZdf() {
        return zdf;
    }

    public void setZdf(double zdf) {
        this.zdf = zdf;
    }
}
