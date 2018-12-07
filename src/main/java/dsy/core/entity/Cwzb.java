package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-21
 * 财务指标
 */
@Entity
@Table(name = "cwzb")
public class Cwzb {

    @Id
    private String id;
    private String code;

    private String date;

    //-----------------每股指标------------------
    /**
     * 基本每股收益（元）
     */
    private double jbmgsy;
    /**
     * 扣费每股指标
     */
    private double kfmgsy;
    /**
     * 稀释每股指标
     */
    private double xsmgsy;
    /**
     * 每股净资产
     */
    private double mgjzc;
    /**
     * 每股公积金
     */
    private double mggjj;
    /**
     * 每股未分配利润
     */
    private double mgwfply;

    /**
     * 每股经营现金流
     */
    private double mgjyxjl;

    //------------------成长能力指标--------------
    /**
     * 营业总收入
     */
    private String yyzsr;
    /**
     * 毛利润
     */
    private String mlr;
    /**
     * 归属净利润
     */
    private String gsjlr;
    /**
     * 扣非净利润
     */
    private String kfjlr;
    /**
     * 营业总收入同比增长
     */
    private double yyzsrtbzz;
    /**
     * 归属净利润同比增长
     */
    private double gsjlrtbzz;
    /**
     * 扣非净利润同比增长
     */
    private double kfjlrtbzz;
    /**
     * 营业总输入滚动环比增长
     */
    private double yyzsrgdhbzz;
    /**
     * 应收净利润滚动环比增长
     */
    private double gsjlrgdhbzz;

    //------------------盈利能力指标----------------
    /**
     * 扣非净利润滚动环比增长
     */
    private double kfjlrgdhbzz;

    /**
     * 加权净资产收益率
     */
    private double jqjzcsyl;
    /**
     * 摊薄净资产收益率
     */
    private double tbjzcsyl;
    /**
     * 摊薄总资产收益率
     */
    private double tbzzcsyl;
    /**
     * 毛利率
     */
    private double mll;
    /**
     * 净利率
     */
    private double jll;

    //---------------盈利质量指标----------------------
    /**
     * 实际税率
     */
    private double sjsl;
    /**
     * 预收款/营业收入
     */
    private double yskyysr;
    /**
     * 销售现金流/营业收入
     */
    private double xsxjlyysr;

    //------------运营能力指标------------------
    /**
     * 经营现金流/营业收入
     */
    private double jyxjlyysr;
    /**
     * 总资产周转率
     */
    private double zzczzy;
    /**
     * 应收账款周转天数
     */
    private double yszkzzts;

    //------------财务风险指标---------------
    /**
     * 存货周转天数
     */
    private double chzzts;

    /**
     * 资产负债率
     */
    private double zcfzl;
    /**
     * 流动负债/总负债
     */
    private double ldzczfz;
    /**
     * 流动比率
     */
    private double ldbl;
    /**
     * 速冻比率
     */
    private double sdbl;


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

    public double getJbmgsy() {
        return jbmgsy;
    }

    public void setJbmgsy(double jbmgsy) {
        this.jbmgsy = jbmgsy;
    }

    public double getKfmgsy() {
        return kfmgsy;
    }

    public void setKfmgsy(double kfmgsy) {
        this.kfmgsy = kfmgsy;
    }

    public double getXsmgsy() {
        return xsmgsy;
    }

    public void setXsmgsy(double xsmgsy) {
        this.xsmgsy = xsmgsy;
    }

    public double getMgjzc() {
        return mgjzc;
    }

    public void setMgjzc(double mgjzc) {
        this.mgjzc = mgjzc;
    }

    public double getMggjj() {
        return mggjj;
    }

    public void setMggjj(double mggjj) {
        this.mggjj = mggjj;
    }

    public double getMgwfply() {
        return mgwfply;
    }

    public void setMgwfply(double mgwfply) {
        this.mgwfply = mgwfply;
    }

    public double getMgjyxjl() {
        return mgjyxjl;
    }

    public void setMgjyxjl(double mgjyxjl) {
        this.mgjyxjl = mgjyxjl;
    }

    public String getYyzsr() {
        return yyzsr;
    }

    public void setYyzsr(String yyzsr) {
        this.yyzsr = yyzsr;
    }

    public String getMlr() {
        return mlr;
    }

    public void setMlr(String mlr) {
        this.mlr = mlr;
    }

    public String getGsjlr() {
        return gsjlr;
    }

    public void setGsjlr(String gsjlr) {
        this.gsjlr = gsjlr;
    }

    public String getKfjlr() {
        return kfjlr;
    }

    public void setKfjlr(String kfjlr) {
        this.kfjlr = kfjlr;
    }

    public double getYyzsrtbzz() {
        return yyzsrtbzz;
    }

    public void setYyzsrtbzz(double yyzsrtbzz) {
        this.yyzsrtbzz = yyzsrtbzz;
    }

    public double getGsjlrtbzz() {
        return gsjlrtbzz;
    }

    public void setGsjlrtbzz(double gsjlrtbzz) {
        this.gsjlrtbzz = gsjlrtbzz;
    }

    public double getKfjlrtbzz() {
        return kfjlrtbzz;
    }

    public void setKfjlrtbzz(double kfjlrtbzz) {
        this.kfjlrtbzz = kfjlrtbzz;
    }

    public double getYyzsrgdhbzz() {
        return yyzsrgdhbzz;
    }

    public void setYyzsrgdhbzz(double yyzsrgdhbzz) {
        this.yyzsrgdhbzz = yyzsrgdhbzz;
    }

    public double getGsjlrgdhbzz() {
        return gsjlrgdhbzz;
    }

    public void setGsjlrgdhbzz(double gsjlrgdhbzz) {
        this.gsjlrgdhbzz = gsjlrgdhbzz;
    }

    public double getKfjlrgdhbzz() {
        return kfjlrgdhbzz;
    }

    public void setKfjlrgdhbzz(double kfjlrgdhbzz) {
        this.kfjlrgdhbzz = kfjlrgdhbzz;
    }

    public double getJqjzcsyl() {
        return jqjzcsyl;
    }

    public void setJqjzcsyl(double jqjzcsyl) {
        this.jqjzcsyl = jqjzcsyl;
    }

    public double getTbjzcsyl() {
        return tbjzcsyl;
    }

    public void setTbjzcsyl(double tbjzcsyl) {
        this.tbjzcsyl = tbjzcsyl;
    }

    public double getTbzzcsyl() {
        return tbzzcsyl;
    }

    public void setTbzzcsyl(double tbzzcsyl) {
        this.tbzzcsyl = tbzzcsyl;
    }

    public double getMll() {
        return mll;
    }

    public void setMll(double mll) {
        this.mll = mll;
    }

    public double getJll() {
        return jll;
    }

    public void setJll(double jll) {
        this.jll = jll;
    }

    public double getSjsl() {
        return sjsl;
    }

    public void setSjsl(double sjsl) {
        this.sjsl = sjsl;
    }

    public double getYskyysr() {
        return yskyysr;
    }

    public void setYskyysr(double yskyysr) {
        this.yskyysr = yskyysr;
    }

    public double getXsxjlyysr() {
        return xsxjlyysr;
    }

    public void setXsxjlyysr(double xsxjlyysr) {
        this.xsxjlyysr = xsxjlyysr;
    }

    public double getJyxjlyysr() {
        return jyxjlyysr;
    }

    public void setJyxjlyysr(double jyxjlyysr) {
        this.jyxjlyysr = jyxjlyysr;
    }

    public double getZzczzy() {
        return zzczzy;
    }

    public void setZzczzy(double zzczzy) {
        this.zzczzy = zzczzy;
    }

    public double getYszkzzts() {
        return yszkzzts;
    }

    public void setYszkzzts(double yszkzzts) {
        this.yszkzzts = yszkzzts;
    }

    public double getChzzts() {
        return chzzts;
    }

    public void setChzzts(double chzzts) {
        this.chzzts = chzzts;
    }

    public double getZcfzl() {
        return zcfzl;
    }

    public void setZcfzl(double zcfzl) {
        this.zcfzl = zcfzl;
    }

    public double getLdzczfz() {
        return ldzczfz;
    }

    public void setLdzczfz(double ldzczfz) {
        this.ldzczfz = ldzczfz;
    }

    public double getLdbl() {
        return ldbl;
    }

    public void setLdbl(double ldbl) {
        this.ldbl = ldbl;
    }

    public double getSdbl() {
        return sdbl;
    }

    public void setSdbl(double sdbl) {
        this.sdbl = sdbl;
    }
}
