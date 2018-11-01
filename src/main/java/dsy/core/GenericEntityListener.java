package dsy.core;

import dsy.core.entity.BaseEntity;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * @author dong
 * @since 18-11-1
 */
@Component
public class GenericEntityListener {
    @PrePersist
    public void prePersist(BaseEntity entity) {
        entity.setCreateTime(System.currentTimeMillis());
        entity.setUpdateTime(entity.getCreateTime());
    }

    @PreUpdate
    public void preUpdate(BaseEntity entity) {
        entity.setUpdateTime(System.currentTimeMillis());
    }
}
