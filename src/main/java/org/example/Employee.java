package org.example;


public class Employee {

    String emp_name;
    String emp_dept;
    long emp_salary;
    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_dept() {
        return emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        this.emp_dept = emp_dept;
    }

    public long getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(long emp_salary) {
        this.emp_salary = emp_salary;
    }

    public Employee(String emp_name, String emp_dept, long emp_salary) {
        this.emp_name = emp_name;
        this.emp_dept = emp_dept;
        this.emp_salary = emp_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_dept='" + emp_dept + '\'' +
                ", emp_salary=" + emp_salary +
                '}';
    }
}
