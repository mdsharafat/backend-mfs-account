package com.mfs.account.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseDomain implements Serializable {

    private Date created;
    private Date updated;
    private long version;

    public BaseDomain() {
    }

    @PrePersist
    protected void onCreate() {
        this.created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated = new Date();
    }

    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    public Date getUpdated() {
        return this.updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Version
    @Access(AccessType.PROPERTY)
    @JsonIgnore
    public long getVersion() {
        return this.version;
    }

    public void setVersion(long version) {
        this.version = version;
    }



}
