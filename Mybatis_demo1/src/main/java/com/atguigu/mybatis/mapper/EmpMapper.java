package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

//  List<Emp> findEmpList();

  List<Emp> findEmpAndDept(@Param("empdid") Integer empdid);

  Emp findEmpByStepOne(@Param("empId") Integer empId);

  List<Emp> getEmpByIf(Emp emp);

  int deleteEmpBatch(@Param("eids") Integer[] eids);

  int addEmpBatch(@Param("emps") List<Emp> emps);

  Emp findEmp(@Param("eid") Integer eid);
}
