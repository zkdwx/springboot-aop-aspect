package com.space.aspect.service;

import com.space.aspect.bo.SysLogBO;
import com.space.aspect.mapper.SysLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuzhe
 * @date 2018/6/4 9:41
 * @email 1529949535@qq.com
 */
//@Slf4j
@Service
public class SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;
    private Logger log;

    public boolean save(SysLogBO sysLogBO){
        sysLogMapper.save(sysLogBO);
        log.info(sysLogBO.getParams());
        return true;
    }
}
