package dsy.core.entity;

import dsy.core.GenericEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * @author dong
 * @since 18-11-1
 */
@MappedSuperclass
@EntityListeners(value = {GenericEntityListener.class})
public abstract class BaseEntity {

    @Version
    @Column(name = "version")
    private long version;
    @Column(name = "create_time")
    private long createTime;

    @Column(name = "update_time")
    private long updateTime;

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}

