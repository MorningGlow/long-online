package com.luxshare.mapper;

import com.luxshare.pojo.Userinfo;
import com.luxshare.vo.UserinfoWithItemContentVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * user 自定义sql处理接口
 *
 * @author lion hua
 * @since 2019-11-08 15:47:14
 */
public interface UserinfoCustomDao {

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
    @Select("SELECT * FROM Userinfo WHERE realname = #{realName}")
    Userinfo getUserInfoByRealName(@Param("realName") String realName);


    /**
     * 根据用户id来获取用户所有评论记录
     *
     * @param userinfoId 用户id
     * @return 返回一个用户评论记录对象
     */
    UserinfoWithItemContentVO getAllItemCommentByUserinfoId(String userinfoId);
}




