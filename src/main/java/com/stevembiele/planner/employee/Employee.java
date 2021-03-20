package com.stevembiele.planner.employee;

import com.stevembiele.domain.Organization;
import com.stevembiele.planner.Contract;
import com.stevembiele.planner.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

import javax.validation.Valid;
import java.util.Set;

@Data
@EqualsAndHashCode
public class Employee {

    @NonNull
    private String name;
    @NonNull
    private Organization organization;
    @NonNull
    private Contract contract;
    @NonNull
    private Set<Skill> skillSet;
}
