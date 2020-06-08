package com.entity;

public class EmpEntity {
    //emplouee_id 因为开启了驼峰命名法字段能对应上，否则—(下划线)对应不上
    private Integer employeeId;
    private DepartEntity depart;//多对一 在多的一端存一的实体

    private String employeeName;

    @Override
    public String toString() {
        return "EmpEntity{" +
                "employeeId=" + employeeId +
                ", depart=" + depart +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    public DepartEntity getDepart() {
        return depart;
    }

    public void setDepart(DepartEntity depart) {
        this.depart = depart;
    }


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
