package com.entity;

import java.util.List;

public class DepartEntity {
    private Integer departId;
    private String departName;
    private List<EmpEntity> emps;//1对多 在1的一端存多的列表

    @Override
    public String toString() {
        return "DepartEntity{" +
                "departId=" + departId +
                ", departName='" + departName + '\'' +
                ", emps=" + emps +
                '}';
    }

    public List<EmpEntity> getEmps() {
        return emps;
    }

    public void setEmps(List<EmpEntity> emps) {
        this.emps = emps;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}
