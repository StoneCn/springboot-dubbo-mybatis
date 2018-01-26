package com.stone.mapper;

import com.stone.entity.Department;
import com.stone.entity.Employee;
import com.stone.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author stone
 * @date 2018/1/25 14:56
 */
@Mapper
@Component
public interface DeptMapper {

    void save(Department dept);

    Department selectOne(Long deptId);

}
