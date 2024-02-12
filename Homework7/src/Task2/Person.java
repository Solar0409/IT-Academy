package Homework7.src.Task2;

import java.time.LocalDate;

public class Person {
   private  String firstName;
   private String lastName;
   private int age;
   private LocalDate dateOfBirth;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public LocalDate getDateOfBirth() {
      return dateOfBirth;
   }

   public void setDateOfBirth(LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   @Override
   public String toString() {
      return "Person{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", age=" + age +
              ", dateOfBirth=" + dateOfBirth +
              '}';
   }
}
