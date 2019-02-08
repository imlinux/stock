package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 十大股东
 */
@Entity
@Table(name = "sdgd")
public class SdGd {

    @Id
    private String id;

    private String code;

    // 统计类型
    private String type;

    //股东名称
    private String gdmc;

    private String date;

    //股东性质
    private String gdxz;

    //股份类型
    private String gflx;

    //持股数
    private String cgs;

    //占流通股比例
    private String zltgbcgbl;

    //增减(股数)
    private String zj;

    //变动比例
    private String bdbl;

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

    public String getGdmc() {
        return gdmc;
    }

    public void setGdmc(String gdmc) {
        this.gdmc = gdmc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGdxz() {
        return gdxz;
    }

    public void setGdxz(String gdxz) {
        this.gdxz = gdxz;
    }

    public String getCgs() {
        return cgs;
    }

    public void setCgs(String cgs) {
        this.cgs = cgs;
    }

    public String getZltgbcgbl() {
        return zltgbcgbl;
    }

    public void setZltgbcgbl(String zltgbcgbl) {
        this.zltgbcgbl = zltgbcgbl;
    }

    public String getZj() {
        return zj;
    }

    public void setZj(String zj) {
        this.zj = zj;
    }

    public String getBdbl() {
        return bdbl;
    }

    public void setBdbl(String bdbl) {
        this.bdbl = bdbl;
    }

    public String getGflx() {
        return gflx;
    }

    public void setGflx(String gflx) {
        this.gflx = gflx;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
