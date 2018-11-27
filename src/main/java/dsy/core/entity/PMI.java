package dsy.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dong
 * @since 18-11-27
 */
@Entity
@Table(name = "pmi")
public class PMI extends BaseEntity {

    @Id
    private String id;

    private String month;

    private double zzycgjlzs; //制造业采购经理指数

    private double fzzycgjlzs; //非制造业采购经理指数

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

    public double getZzycgjlzs() {
        return zzycgjlzs;
    }

    public void setZzycgjlzs(double zzycgjlzs) {
        this.zzycgjlzs = zzycgjlzs;
    }

    public double getFzzycgjlzs() {
        return fzzycgjlzs;
    }

    public void setFzzycgjlzs(double fzzycgjlzs) {
        this.fzzycgjlzs = fzzycgjlzs;
    }
}
