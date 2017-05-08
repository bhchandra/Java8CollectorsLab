package com.java8collectorslab.collector;

import com.java8collectorslab.qualifiers.SalaryQualifier;
import com.java8collectorslab.model.Employee;
import lombok.Getter;
import lombok.ToString;

/**
 *
 * @author MITRA
 */

@Getter
@ToString
public class StatsCollector {

    private int maxAge = Integer.MIN_VALUE;
    private double hightestSalary = Double.MIN_VALUE;
    private double lowestSalary = Double.MAX_VALUE;
    private int noHighBracket;
    private int noLowBracket;
    private int noOfUsers;

    public StatsCollector() {
    }

    public void accept(Employee user) {
        ++noOfUsers;
        maxAge = Math.max(maxAge, user.getAge());
        hightestSalary = Math.max(hightestSalary,user.getSalary());
        lowestSalary = Math.min(lowestSalary, user.getSalary());
        if(SalaryQualifier.isHighSalaryBracket().test(user)){
            noHighBracket++;
        }
        if(SalaryQualifier.isLowSalaryBracket().test(user)){
            noLowBracket++;
        }
    }
    
    public void combine(StatsCollector other){
        noOfUsers += other.noOfUsers;
        maxAge = Math.max(maxAge, other.maxAge);
        hightestSalary = Math.max(hightestSalary, other.hightestSalary);
        lowestSalary = Math.min(lowestSalary, other.lowestSalary);
        noHighBracket+= other.noHighBracket;
        noLowBracket += other.noLowBracket;
    }

}
