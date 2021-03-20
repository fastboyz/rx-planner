package com.stevembiele.planner.employee;

import com.stevembiele.domain.Organization;
import lombok.Data;
import lombok.NonNull;

import java.time.OffsetDateTime;

@Data
public class EmployeeAvailability {

    @NonNull
    private Employee employee;

    @NonNull
    private Organization organization;

    @NonNull
    private OffsetDateTime startDateTime;

    @NonNull
    private OffsetDateTime endDateTime;

    @NonNull
    private EmployeeAvailabilityState state;
}
