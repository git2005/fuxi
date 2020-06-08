package com.mapper;

import com.entity.DepartEntity;
import com.entity.EmpEntity;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TabEmpMapper {
    List<EmpEntity> selectEmp1();
    List<Map> selectEmp2();
    List<String > selectEmp3();
    String selectEmp4(Integer empId);
    List<String > selectEmp5(Integer empId);/*只不过list里面只有一个数据*/

    List<EmpEntity> selectEmp6();
    List<EmpEntity> selectEmp7();

    List<DepartEntity> selectEmp8();
    List<DepartEntity> selectDept1();

    int insertDept(@Param("departName") String departName1,@Param("departState") String departState);


    List<HashMap> selectDeptEmp(HashMap map);

    int insertDeptMore(List li);

    List<HashMap> selectCall(HashMap map);

}
