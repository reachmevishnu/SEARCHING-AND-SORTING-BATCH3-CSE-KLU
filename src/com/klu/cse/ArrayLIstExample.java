package com.klu.cse;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstExample {
    static class Employee{
        private String name;
        private String designation;
        private Double sal;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public Double getSal() {
            return sal;
        }

        public void setSal(Double sal) {
            this.sal = sal;
        }

        public Employee() {
        }

        public Employee(String name, String designation, Double sal) {
            this.name = name;
            this.designation = designation;
            this.sal = sal;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", designation='" + designation + '\'' +
                    ", sal=" + sal +
                    '}';
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> a=new ArrayList();
        Employee e1=new Employee("vishnu","Trainer",50000.0);
        Employee e2=new Employee("Ajay","Professor",100000.0);
        Employee e3=new Employee("Vikas","Assistant Professor",75000.0);
        a.add(e1);
        a.add(e2);
        a.add(e3);
        a.remove(e3);
        a.add(0,e3);
        a.set(0,e2);
        for (Employee i:a) {
            System.out.println(i);
        }
    }
}
