package com.example.demo.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

@Service
public class AgeCalculatorService {
	
	public String calculateAge(String dob) {
        LocalDate birthDate = LocalDate.parse(dob);
        LocalDate currentDate = LocalDate.now();

        if (birthDate.isAfter(currentDate)) {
            return "Date of birth cannot be in the future!";
        }

        Period age = Period.between(birthDate, currentDate);

        return "Your age is: " + age.getYears() + " years, " +
               age.getMonths() + " months, and " +
               age.getDays() + " days.";
    }

}
