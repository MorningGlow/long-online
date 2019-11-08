package com.luxshare.service.impl;

import com.luxshare.common.service.impl.BaseServiceImpl;
import com.luxshare.pojo.Userinfo;
import com.luxshare.service.UserinfoService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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
}




