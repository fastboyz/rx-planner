package com.stevembiele.planner.shift;

import com.stevembiele.domain.Organization;
import com.stevembiele.planner.Skill;
import com.stevembiele.planner.Spot;
import com.stevembiele.planner.employee.Employee;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.time.OffsetDateTime;
import java.util.Set;

@Data
@EqualsAndHashCode
public class Shift {

    @NonNull
    private Organization organization;

    @NonNull
    private Employee employee;

    @NonNull
    private OffsetDateTime startDateTime;
    @NonNull
    private OffsetDateTime endDateTime;

    @NonNull
    private Set<Skill> requiredSkillSet;

    @NonNull
    private Spot spot;
}
