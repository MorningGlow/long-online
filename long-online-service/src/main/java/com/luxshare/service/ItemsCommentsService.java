package com.luxshare.service;

import com.luxshare.common.service.BaseService;
import com.luxshare.pojo.ItemsComments;
import com.luxshare.vo.ItemContendWithUserInfoVO;

import java.util.Map;

/**
* 通用 Service 代码生成器
*
* @author lion hua
* @since 2019-11-08 09:17:54
*/
public interface ItemsCommentsService extends BaseService<ItemsComments> {

    /**
     * 返回商品内容与用户相关信息
     *
     * @param itemContendId 商品内容id
     * @return ItemContendWithUserInfoVO
     */
    ItemContendWithUserInfoVO getItemContendWithUserInfo(String itemContendId);


    /**
     * 批量插入商品评价表
     * @param map map
     */
    void saveItemContents(Map<String, Object> map);
}




