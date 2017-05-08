package com.java8collectorslab.model;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author MITRA
 */
@Data
@RequiredArgsConstructor(staticName = "of")
@Builder
public class Employee {
    
    private final String firstName;
    
    private final String lastName;
    
    private final LocalDate dateOfBirth;
    
    private final Language language;
    
    private final Proficiency proficiency;
    
    private final double salary;
    
    private final int Age;
    
}
