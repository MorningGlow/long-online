package com.luxshare.mapper;

import com.luxshare.vo.ItemContendWithUserInfoVO;

/**
 * 通用 Mapper 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 09:17:54
 */
public interface ItemsCommentsCustomDao {

    /**
     * 返回商品内容与用户相关信息
     *
     * @param itemContendId 商品内容id
     * @return ItemContendWithUserInfoVO
     */
    ItemContendWithUserInfoVO getItemContendWithUserInfo(String itemContendId);
}




