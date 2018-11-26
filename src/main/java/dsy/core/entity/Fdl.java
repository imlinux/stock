package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-26
 * 发电量
 * 单位：亿千瓦时
 */
@Entity
@Table(name = "fdl")
public class Fdl extends BaseEntity {

    @Id
    private String id;

    private String month;

    private double fdl;
    private double fdlYoy;

    private double hlFdl;
    private double hlFdlYoy;

    private double slFdl;
    private double slFdlYoy;

    private double hnFdl;
    private double hnFdlYoy;

    private double flFdl;
    private double flFdlYoy;

    private double tynFdl;
    private double tynFdlYoy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getFdl() {
        return fdl;
    }

    public void setFdl(double fdl) {
        this.fdl = fdl;
    }

    public double getFdlYoy() {
        return fdlYoy;
    }

    public void setFdlYoy(double fdlYoy) {
        this.fdlYoy = fdlYoy;
    }

    public double getHlFdl() {
        return hlFdl;
    }

    public void setHlFdl(double hlFdl) {
        this.hlFdl = hlFdl;
    }

    public double getHlFdlYoy() {
        return hlFdlYoy;
    }

    public void setHlFdlYoy(double hlFdlYoy) {
        this.hlFdlYoy = hlFdlYoy;
    }

    public double getSlFdl() {
        return slFdl;
    }

    public void setSlFdl(double slFdl) {
        this.slFdl = slFdl;
    }

    public double getSlFdlYoy() {
        return slFdlYoy;
    }

    public void setSlFdlYoy(double slFdlYoy) {
        this.slFdlYoy = slFdlYoy;
    }

    public double getHnFdl() {
        return hnFdl;
    }

    public void setHnFdl(double hnFdl) {
        this.hnFdl = hnFdl;
    }

    public double getHnFdlYoy() {
        return hnFdlYoy;
    }

    public void setHnFdlYoy(double hnFdlYoy) {
        this.hnFdlYoy = hnFdlYoy;
    }

    public double getFlFdl() {
        return flFdl;
    }

    public void setFlFdl(double flFdl) {
        this.flFdl = flFdl;
    }

    public double getFlFdlYoy() {
        return flFdlYoy;
    }

    public void setFlFdlYoy(double flFdlYoy) {
        this.flFdlYoy = flFdlYoy;
    }

    public double getTynFdl() {
        return tynFdl;
    }

    public void setTynFdl(double tynFdl) {
        this.tynFdl = tynFdl;
    }

    public double getTynFdlYoy() {
        return tynFdlYoy;
    }

    public void setTynFdlYoy(double tynFdlYoy) {
        this.tynFdlYoy = tynFdlYoy;
    }
}
