package com.stevembiele.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@EqualsAndHashCode
public class Organization {

    @NonNull
    private long id;

    @NonNull
    private String name;

    private int nbMaxHoursPerDay;
}
