package person;

import java.time.*;
import java.time.format.*;

public class Person {

    // Creating instance variables for the person's name and date of birth
    private String name;
    private LocalDate DoB;

    // A constructor taking the arguements of the name and date of birth of the person
    public Person(String _name, String _DoB) {
        name = _name;

        /* Created a formatter to format the date. Set the date of birth using the format, if the date is valid. 
        If it is not valid, print the error message 'date not valid' and set date to null. */
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        try {
            DoB = LocalDate.parse(_DoB, formatters); //initialise date of birth using formatter with the received date    
        } catch (DateTimeParseException ex) {
            System.out.println("Date not valid! - Setting date of birth to null!");
            DoB = null;
        }
    }

    /* This method returns the age in years, uses the formatter to retrieve date if it is not null, then calculates 
    the years between the given date and date of birth. If the date is not valid, it returns 0 as the date. */
    public int age(String _date) {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu"); 

        if (DoB != null) {
            try {
                LocalDate _localDate = LocalDate.parse(_date, formatters); 
                int ageInYears = Period.between(DoB, _localDate).getYears(); 
                return ageInYears;
            } 
            catch (DateTimeParseException ex) {
                System.out.println("Date not valid!");
                return 0;
            }
        } else {
            System.out.println("Date of birth is null - returning age as 0");
            return 0;
        }
    }

    // localdate returns the age in years, calculates period between given date and date of birth to get data
    public int age(LocalDate _date) {
        int ageInYears = Period.between(DoB, _date).getYears();
        return ageInYears;
    }

    /* toString() method returns a representation of person, returns the age in years by using formatted date of birth */
    public String toString() {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu"); 
        LocalDate _localDate = LocalDate.now(); 
        String _dateOfBirth;
        int _ageInYears;
        if (DoB != null) {
            _dateOfBirth = DoB.format(formatters); 
            _ageInYears = Period.between(DoB, _localDate).getYears(); 
        } else {
            System.out.println("Date of birth is invalid. So age is set to 0");
            _dateOfBirth = "Invalid";
            _ageInYears = 0;
        }
        return "Name: " + name + ". Date of Birth: " + _dateOfBirth + ". Age: " + _ageInYears + " years old.";
    }

}
