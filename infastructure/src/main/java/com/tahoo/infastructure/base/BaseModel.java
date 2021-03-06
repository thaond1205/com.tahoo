package com.tahoo.infastructure.base;


import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@Setter
public class BaseModel implements Serializable {

    private String createdBy;
    private String lastModifiedBy;
    private Instant createdDate;
    private Instant lastModifiedDate;


    @Column(name = "created_by")
    @CreatedBy
    public String getCreatedBy() {
        return createdBy;
    }

    @Column(name = "last_modified_by")
    @LastModifiedBy
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @Column(name = "created_date")
    @CreatedDate
    public Instant getCreatedDate() {
        return createdDate;
    }

    @Column(name = "last_modified_date")
    @LastModifiedDate
    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }
}
