package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept findDeptByStepTwo(@Param("did") Integer did);

    Dept findDeptByDuo(@Param("did") Integer did);
}
