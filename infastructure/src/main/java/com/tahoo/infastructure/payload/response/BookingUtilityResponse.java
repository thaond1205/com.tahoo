package com.tahoo.infastructure.payload.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingUtilityResponse {
    private Long id;

    private String description;

    private Long idBooking;

    private UtilityResponse utility;
}
