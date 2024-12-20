package com.project.popupmarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PopupStoreImageListId implements Serializable {
    @Serial
    private static final long serialVersionUID = -1657955911995991137L;

    @NotNull
    @Column(name = "popup_store_seq", nullable = false)
    private Long popupStoreSeq;

    @Size(max = 255)
    @NotNull
    @Column(name = "image", nullable = false)
    private String image;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PopupStoreImageListId entity = (PopupStoreImageListId) o;
        return Objects.equals(this.image, entity.image) &&
                Objects.equals(this.popupStoreSeq, entity.popupStoreSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, popupStoreSeq);
    }

}