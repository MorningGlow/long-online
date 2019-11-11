package com.luxshare.service.impl;

import com.github.pagehelper.PageHelper;
import com.luxshare.common.service.impl.BaseServiceImpl;
import com.luxshare.common.util.PageGridResult;
import com.luxshare.common.util.PageUtil;
import com.luxshare.pojo.Userinfo;
import com.luxshare.service.UserinfoService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 通用 ServiceImpl 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 15:47:14
 */
@Service
public class UserinfoServiceImpl extends BaseServiceImpl<Userinfo> implements UserinfoService {

    @Override
    public boolean existUserName(String userName) {
        Example example = new Example(Userinfo.class);
        example.createCriteria().andEqualTo(Userinfo.DB_USERNAME, userName);
        Userinfo userinfo = this.mapper.selectOneByExample(example);
        return userinfo != null;
    }

    @Override
    public PageGridResult page(Integer page, Integer pageSize) {

        Example example = new Example(Userinfo.class);
        example.createCriteria();

        PageHelper.startPage(page, pageSize);
        List<Userinfo> list = mapper.selectByExample(example);
        return PageUtil.setterPageGrid(list, page);
    }
}




