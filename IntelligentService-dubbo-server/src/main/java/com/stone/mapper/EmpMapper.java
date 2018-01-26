package com.stone.mapper;

import com.stone.entity.Department;
import com.stone.entity.Employee;
import com.stone.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author stone
 * @date 2018/1/25 14:56
 */
@Mapper
@Component
public interface EmpMapper {

    void save(Employee emp);

    Employee selectOne(Long empId);

    List<Employee> selectAll();

}
