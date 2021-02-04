package com.company;

import java.util.ArrayList;

public class PersonMaker {

    /**
     * TODO: Burde de her make-metoder være static?
     */
    public ArrayList<Employee> makeEmployeesArrayList(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        // Adding some employees
        employeeArrayList.add(new Administration("Anna Admin", "11111111", 37,33000,5));
        employeeArrayList.add(new Administration("Kevin Kontor", "22222222", 37,33000,5));
        employeeArrayList.add(new Instructor("Yngve Yogi", "33333333", 29, 0)); // Ikke så elegant med salary
        employeeArrayList.add(new Instructor("Bobby Bokser", "44444444", 14, 0)); // Ikke så elegant med salary
        employeeArrayList.add(new Instructor("Zussi Zumba", "55555555", 40,0)); // Ikke så elegant med salary
        return employeeArrayList;
    }

    public ArrayList<Member> makeMembersArrayList(){
        ArrayList<Member> memberArrayList = new ArrayList<>();
        // Adding some members
        memberArrayList.add(new Member("Mette Medlem", "66666666", true));
        memberArrayList.add(new Member("Mikkel Medlem", "77777777", true));
        memberArrayList.add(new Member("Maggy Medlem", "88888888", false));
        memberArrayList.add(new Member("Mark Medlem", "99999999", false));
        return memberArrayList;
    }

    public void showEmployees(){
        ArrayList<Employee> employeesArrayList = makeEmployeesArrayList();
        System.out.println("FITNESS EMPLOYEES");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Name", "Cpr", "Hours", "Salary", "Vacation");
        System.out.println("*************************************************************************");
        for (Employee e : employeesArrayList){
            if (e instanceof Administration) {
                e = (Administration) e;
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", e.getName(), e.getCpr(), e.getHours(), e.getSalary(), ((Administration) e).getVacation());
            }
            else if (e instanceof Instructor){
                System.out.printf("%-15s %-15s %-15s %-15s %n", e.getName(), e.getCpr(), e.getHours(), e.getSalary());
            }
        }
        System.out.println("=========================================================================");
    }

    public void showMembers(){
        ArrayList<Member> memberArrayList = makeMembersArrayList();
        System.out.println("FITNESS MEMBERS");
        System.out.printf("%-15s %-15s %-15s %-15s %n", "Name", "Cpr", "Member Type", "Fee");
        System.out.println("*************************************************************************");
        for (Member m : memberArrayList){
            System.out.printf("%-15s %-15s %-15s %-15s %n", m.getName(), m.getCpr(), m.getMemberType(), m.monthlyFee());
        }
        System.out.println("=========================================================================");
    }

    public void showAllNamesAndCprs(){
        ArrayList<Person> personArrayList = new ArrayList<>(); // To hold everyone
        ArrayList<Employee> employeesArrayList = makeEmployeesArrayList();
        for (Employee e : employeesArrayList) {
            personArrayList.add(e); // Adding all employees
        }
        ArrayList<Member> memberArrayList = makeMembersArrayList();
        for (Member m : memberArrayList) {
            personArrayList.add(m); // Adding all members
        }
        System.out.println("EMPLOYEES & MEMBERS Name and Cpr");
        System.out.printf("%-15s %-15s %n", "Name", "Cpr");
        System.out.println("*************************************************************************");
        for (Person p : personArrayList){
            System.out.printf("%-15s %-15s %n", p.getName(), p.getCpr());
        }
        System.out.println("=========================================================================");
    }
}
