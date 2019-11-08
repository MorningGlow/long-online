package com.luxshare.common.service.impl;

import com.luxshare.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

/**
 * 通用 BaseServiceImpl 实现类
 *
 * @author lion hua
 * @since 2019-11-07
 */
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired(required = false)
    private Mapper<T> mapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public T getOneByPrimaryKey(Object primaryKey) {
        return mapper.selectByPrimaryKey(primaryKey);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int updateByPrimaryKey(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int insert(T t) {
        return mapper.insert(t);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public int deleteByPrimaryKey(Object primaryKey) {
        return mapper.deleteByPrimaryKey(primaryKey);
    }
}
