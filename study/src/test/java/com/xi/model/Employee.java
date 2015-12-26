package com.xi.model;

/**
 * Created by Administrator on 2015/12/26.
 */
public class Employee {
    private Integer empId;
    private String entryDate;
    private Integer contratId;
    private String contratNo;
    private double income;
    private double cost;
    //my equals
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee obj = (Employee) o;
        if (empId == null) {
            if (obj.empId != null) {
                return false;
            }
        } else {
            if (!empId.equals(obj.empId)) {
                return false;
            }
        }
        if (entryDate == null) {
            if (obj.entryDate != null) {
                return false;
            }
        } else {
            if (!entryDate.equals(obj.entryDate)) {
                return false;
            }
        }
        return true;
    }

    public Employee() {
    }

    public Employee(int empId, double cost, double income, String contratNo, int contratId, String entryDate) {
        this.empId = empId;
        this.cost = cost;
        this.income = income;
        this.contratNo = contratNo;
        this.contratId = contratId;
        this.entryDate = entryDate;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public int getContratId() {
        return contratId;
    }

    public String getContratNo() {
        return contratNo;
    }

    public double getIncome() {
        return income;
    }

    public double getCost() {
        return cost;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public void setContratId(int contratId) {
        this.contratId = contratId;
    }

    public void setContratNo(String contratNo) {
        this.contratNo = contratNo;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
