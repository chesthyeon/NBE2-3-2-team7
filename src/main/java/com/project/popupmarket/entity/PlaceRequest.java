package com.project.popupmarket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "placeRequest")
public class PlaceRequest {
    @EmbeddedId
    private PlaceRequestId id;

    @MapsId("popupStoreSeq")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "popup_store_seq", nullable = false)
    private PopupStore popupStoreSeq;

    @MapsId("rentalPlaceSeq")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rental_place_seq", nullable = false)
    private RentalPlace rentalPlaceSeq;

}