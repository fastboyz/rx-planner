package com.stevembiele.planner;

import com.stevembiele.domain.Organization;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class Contract {

    @NonNull
    private Organization organization;

    @NonNull
    private String name;

    @Min(0)
    @Max(24)
    private int maxHoursPerDay;

    @Min(0)
    @Max(24 * 7)
    private int maxHoursPerWeek;

    @Min(0)
    @Max(24 * 31)
    private int maxHourPerMonth;

    @Min(0)
    @Max(24 * 365)
    private int maxHourPerYear;

}
