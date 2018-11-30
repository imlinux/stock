package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-30
 */
@Entity
@Table(name = "tong_ye_chai_jie")
public class TongYeChaiJie extends BaseEntity {

    @Id
    private String id;

    private String date;

    private String type;

    private double gylv; //隔夜利率

    private double gyBp;

    private double oneWeekLv; //一周利率

    private double oneWeekBp;

    private double twoWeekLv; //二周利率

    private double twoWeekBp;


    private double oneMonthLv;

    private double oneMonthBp;

    private double threeMonthLv;

    private double threeMonthBp;

    private double sixMonthLv;

    private double sixMonthBp;

    private double nineMonthLv;

    private double nineMonthBp;

    private double oneYearLv;

    private double oneYearBp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGylv() {
        return gylv;
    }

    public void setGylv(double gylv) {
        this.gylv = gylv;
    }

    public double getGyBp() {
        return gyBp;
    }

    public void setGyBp(double gyBp) {
        this.gyBp = gyBp;
    }

    public double getOneWeekLv() {
        return oneWeekLv;
    }

    public void setOneWeekLv(double oneWeekLv) {
        this.oneWeekLv = oneWeekLv;
    }

    public double getOneWeekBp() {
        return oneWeekBp;
    }

    public void setOneWeekBp(double oneWeekBp) {
        this.oneWeekBp = oneWeekBp;
    }

    public double getTwoWeekLv() {
        return twoWeekLv;
    }

    public void setTwoWeekLv(double twoWeekLv) {
        this.twoWeekLv = twoWeekLv;
    }

    public double getTwoWeekBp() {
        return twoWeekBp;
    }

    public void setTwoWeekBp(double twoWeekBp) {
        this.twoWeekBp = twoWeekBp;
    }

    public double getOneMonthLv() {
        return oneMonthLv;
    }

    public void setOneMonthLv(double oneMonthLv) {
        this.oneMonthLv = oneMonthLv;
    }

    public double getOneMonthBp() {
        return oneMonthBp;
    }

    public void setOneMonthBp(double oneMonthBp) {
        this.oneMonthBp = oneMonthBp;
    }

    public double getThreeMonthLv() {
        return threeMonthLv;
    }

    public void setThreeMonthLv(double threeMonthLv) {
        this.threeMonthLv = threeMonthLv;
    }

    public double getThreeMonthBp() {
        return threeMonthBp;
    }

    public void setThreeMonthBp(double threeMonthBp) {
        this.threeMonthBp = threeMonthBp;
    }

    public double getSixMonthLv() {
        return sixMonthLv;
    }

    public void setSixMonthLv(double sixMonthLv) {
        this.sixMonthLv = sixMonthLv;
    }

    public double getSixMonthBp() {
        return sixMonthBp;
    }

    public void setSixMonthBp(double sixMonthBp) {
        this.sixMonthBp = sixMonthBp;
    }

    public double getNineMonthLv() {
        return nineMonthLv;
    }

    public void setNineMonthLv(double nineMonthLv) {
        this.nineMonthLv = nineMonthLv;
    }

    public double getNineMonthBp() {
        return nineMonthBp;
    }

    public void setNineMonthBp(double nineMonthBp) {
        this.nineMonthBp = nineMonthBp;
    }

    public double getOneYearLv() {
        return oneYearLv;
    }

    public void setOneYearLv(double oneYearLv) {
        this.oneYearLv = oneYearLv;
    }

    public double getOneYearBp() {
        return oneYearBp;
    }

    public void setOneYearBp(double oneYearBp) {
        this.oneYearBp = oneYearBp;
    }
}
