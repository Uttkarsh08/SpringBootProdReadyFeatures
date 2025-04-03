package com.uttkarsh.ProdReadyFeatures.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass // It makes sure, new table is not made for this entity, it serves as a base entity class that shares common fields across multiple entity classes
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Audited  //Should be used on each entity(even derived entities) to make them auditable
public class AuditableEntity {

    @CreatedDate
    @Column(nullable = false, updatable = false) //by default, it is false only
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String updatedBy;

}
