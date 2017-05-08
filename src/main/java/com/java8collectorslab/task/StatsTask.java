package com.java8collectorslab.task;


import com.java8collectorslab.collector.StatsCollector;
import com.java8collectorslab.model.Language;
import com.java8collectorslab.model.Proficiency;
import com.java8collectorslab.model.Employee;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author MITRA
 */
public class StatsTask {
    public static void main(String[] args) {
       
        //Creating users
        Employee user1 = Employee.of("Mat", "Dam", LocalDate.now(), Language.JAVA, Proficiency.NOVICE, 49000.00, 22);
        Employee user2 = Employee.builder()
                .firstName("Jim")
                .lastName("Krat")
                .dateOfBirth(LocalDate.now())
                .language(Language.C)
                .proficiency(Proficiency.MIDLEVEL)
                .salary(85000.00)
                .Age(27)
                .build();
        Employee user3 = Employee.of("Barak", "Obama", LocalDate.now(), Language.HASKELL, Proficiency.EXPERIENCED, 100000.00, 28);
        Employee user4 = Employee.of("Gates", "Steve", LocalDate.now(), Language.SCALA, Proficiency.EXPERT, 120000.00, 29);
        Employee user5 = Employee.of("Timothy", "Dave", LocalDate.now(), Language.C, Proficiency.BEGINNER, 45000.00, 23);
        
        
        List<Employee> users = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));
        
        StatsCollector stats = users.stream()
                .collect(StatsCollector::new,
                        StatsCollector::accept,
                        StatsCollector::combine);
        
        
        
        System.out.println(stats);
    }
}
