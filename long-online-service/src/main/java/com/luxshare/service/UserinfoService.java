package com.luxshare.service;

import com.luxshare.common.service.BaseService;
import com.luxshare.common.util.PageGridResult;
import com.luxshare.pojo.Userinfo;
import com.luxshare.vo.UserinfoWithItemContentVO;

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

    /**
     * 用户分页
     *
     * @param page     第几页
     * @param pageSize 一页多少行
     * @return 返回 分页结果集
     */
    PageGridResult<Userinfo> page(Integer page, Integer pageSize);


    /**
     * 根据用户名称来获取用户对象
     *
     * @param userName 用户名称
     * @return 返回一个用户对象
     */
    Userinfo getUserInfoByUserName(String userName);

    /**
     * 根据用户真实名称来获取用户对象
     *
     * @param realName 用户真实名称
     * @return 返回一个用户对象
     */
    Userinfo getUserInfoByRealName(String realName);

    /**
     * 根据用户id来获取用户所有评论记录
     *
     * @param userinfoId 用户id
     * @return 返回一个用户评论记录对象
     */
    UserinfoWithItemContentVO getAllItemCommentByUserinfoId(String userinfoId);
}




