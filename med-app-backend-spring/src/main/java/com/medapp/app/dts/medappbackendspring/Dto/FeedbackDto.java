package com.medapp.app.dts.medappbackendspring.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDto {
    private Long id;
    private String text;
    private Double rating;
    private FullNameUser client;
    private Long doctorId;
}
