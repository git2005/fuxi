package com.service;

import com.mapper.EmpInfoMapper;

public class EmpInfoServiceImpl implements EmpInfoService {
    private EmpInfoMapper empInfoMapper;
    private String name;

//    构造注入构造方法
/*    public EmpInfoServiceImpl(EmpInfoMapper empInfoMapper) {
        this.empInfoMapper = empInfoMapper;
        this.name = name;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpInfoMapper(EmpInfoMapper empInfoMapper) {
        this.empInfoMapper = empInfoMapper;
    }

    @Override
    public void insert() {
        empInfoMapper.insert();
    }
}
