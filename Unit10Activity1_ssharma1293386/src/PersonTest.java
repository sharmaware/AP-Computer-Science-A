/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date alfredoBirthDate = new Date(3, 27, 1);
        Person alfredo = new Person("Alfredo", "327 Dandy Ct.", "coolkid@gmail.com", "4089606896", alfredoBirthDate);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n",
                alfredo.toStringAddress(),
                alfredo.toStringBirthDate(),
                alfredo.toStringEAddress(),
                alfredo.toStringPhoneNumber(),
                alfredo.toStringName()
        );

        Date aliBirthDate = new Date(5, 4, 78);
        Student ali = new Student("Ali", "2342 skldjfhg Dr.", "AliIsACoolKid@gmail.com", "4088734583", aliBirthDate);
        ali.setClassStatus("1");

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n",
                ali.toStringAddress(),
                ali.toStringBirthDate(),
                ali.toStringEAddress(),
                ali.toStringPhoneNumber(),
                ali.toStringName(),
                ali.toStringClassStatus()
        );
        Date alanBirthDate = new Date(9, 9, 99);
        Employee alan = new Employee("Alan", "3832 dasukd Rd.", "AlanIsCooler@gmail.com", "4086543221", alanBirthDate);
        Date alanHireDate = new Date(2, 2, 22);
        alan.setHireDate(alanHireDate);
        alan.setSalary(2364758);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                alan.toStringAddress(),
                alan.toStringBirthDate(),
                alan.toStringEAddress(),
                alan.toStringPhoneNumber(),
                alan.toStringName(),
                alan.toStringHireDate(),
                alan.toStringSalary()
        );
        Date arnavBirthDate = new Date(34, 56, 78);
        Staff arnav = new Staff(arnavBirthDate);
        arnav.setAddress("2347 asdfjasldf Ct.");

        arnav.setEAddress("arnav.123@gmail.com");
        Date arnavHireDate = new Date(2, 4, 78);
        arnav.setHireDate(arnavHireDate);
        arnav.setJobTitle("Store Manager");
        arnav.setName("Arnav");
        arnav.setPhoneNumber("8278623798");
        arnav.setSalary(927368273);

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                arnav.toStringAddress(),
                arnav.toStringBirthDate(),
                arnav.toStringEAddress(),
                arnav.toStringPhoneNumber(),
                arnav.toStringName(),
                arnav.toStringHireDate(),
                arnav.toStringSalary(),
                arnav.toStringJobTitle()
        );

        Date melanieBirthDate = new Date(34, 56, 78);
        FacultyMember melanie = new FacultyMember(melanieBirthDate);
        melanie.setAddress("2347 asdfjasldf Ct.");
        melanie.setEAddress("arnav.123@gmail.com");
        Date melanieHireDate = new Date(2, 4, 78);
        melanie.setHireDate(melanieHireDate);
        melanie.setName("Melanie");
        melanie.setPhoneNumber("8278623798");
        melanie.setSalary(927368273);
        melanie.setOfficeHours("10-12");
        melanie.setRank("3");

        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                melanie.toStringAddress(),
                melanie.toStringBirthDate(),
                melanie.toStringEAddress(),
                melanie.toStringHireDate(),
                melanie.toStringName(),
                melanie.toStringPhoneNumber(),
                melanie.toStringOfficeHours(),
                melanie.toStringSalary(),
                melanie.toStringRank()
        );
    }
}
