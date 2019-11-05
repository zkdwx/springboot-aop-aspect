package com.space.aspect.mapper;

import com.space.aspect.bo.SysLogBO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysLogMapper {
    public void save(SysLogBO sysLogBO);
}
