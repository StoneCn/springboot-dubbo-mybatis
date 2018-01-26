package com.stone.mapper;

import com.stone.entity.Department;
import com.stone.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author stone
 * @date 2018/1/25 14:56
 */
@Mapper
@Component
public interface PermissionMapper {

    void save(Permission permission);

    Department selectOne(Long permissionId);

}
