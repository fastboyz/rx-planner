package com.stevembiele.planner;

import com.stevembiele.domain.Organization;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;


@EqualsAndHashCode
@Data
public class Skill {

    @NonNull
    private String name;
    @NonNull
    private Organization organization;
}
