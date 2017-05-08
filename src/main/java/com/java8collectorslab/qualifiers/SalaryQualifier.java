package com.java8collectorslab.qualifiers;

import com.java8collectorslab.model.Employee;
import java.util.function.Predicate;

/**
 *
 * @author MITRA
 */
public class SalaryQualifier {
    
    public static Predicate<Employee>  isHighSalaryBracket(){
        return user -> user.getSalary() > 80000.00;
    }
    
    public static Predicate<Employee>  isLowSalaryBracket(){
        return user -> user.getSalary() < 50000.00;
    }
}
