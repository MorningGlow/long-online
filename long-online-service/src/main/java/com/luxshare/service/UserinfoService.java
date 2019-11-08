package com.luxshare.service;

import com.luxshare.common.service.BaseService;
import com.luxshare.pojo.Userinfo;

/**
 * 通用 Service 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 15:47:14
 */
public interface UserinfoService extends BaseService<Userinfo> {

    /**
     * 根据用户的名称来判断表中是否已有这个名称记录
     *
     * @param userName 用户的名称
     * @return false/true
     */
    boolean existUserName(String userName);
}




