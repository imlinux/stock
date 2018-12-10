package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "house_hq")
public class HouseHq {

    @Id
    private String id;

    private String pageId;

    private String publishDate; //发布日期

    private String houseCode; //房屋编号

    private String community; //所属小区

    private String type; //房屋户型

    private HouseType houseType;

    private String price; //房屋价格

    private String location; //所在位置

    private String city;
    private String qu;
    private String jiedao;

    private String area; //面积

    private String age; //建造年代

    private String orientations; //朝向

    private String property; //房屋类型

    private String storey; //楼层

    private String decorate; //装修程度

    private String properyAge; //产权年限

    private String lift; //是否有电梯

    private String fangBenAge; //房本年限

    private String chanQuanXingZhi; //产权性质

    private String url;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOrientations() {
        return orientations;
    }

    public void setOrientations(String orientations) {
        this.orientations = orientations;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getStorey() {
        return storey;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

    public String getProperyAge() {
        return properyAge;
    }

    public void setProperyAge(String properyAge) {
        this.properyAge = properyAge;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public String getFangBenAge() {
        return fangBenAge;
    }

    public void setFangBenAge(String fangBenAge) {
        this.fangBenAge = fangBenAge;
    }

    public String getChanQuanXingZhi() {
        return chanQuanXingZhi;
    }

    public void setChanQuanXingZhi(String chanQuanXingZhi) {
        this.chanQuanXingZhi = chanQuanXingZhi;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getJiedao() {
        return jiedao;
    }

    public void setJiedao(String jiedao) {
        this.jiedao = jiedao;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }
}
