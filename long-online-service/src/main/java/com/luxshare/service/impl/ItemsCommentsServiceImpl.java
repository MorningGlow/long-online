package com.luxshare.service.impl;

import com.luxshare.common.service.impl.BaseServiceImpl;
import com.luxshare.mapper.ItemsCommentsCustomDao;
import com.luxshare.pojo.ItemsComments;
import com.luxshare.service.ItemsCommentsService;
import com.luxshare.vo.ItemContendWithUserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 通用 ServiceImpl 代码生成器
 *
 * @author lion hua
 * @since 2019-11-08 09:17:54
 */
@Service
public class ItemsCommentsServiceImpl extends BaseServiceImpl<ItemsComments> implements ItemsCommentsService {

    @Autowired(required = false)
    private ItemsCommentsCustomDao itemsCommentsCustomDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public ItemContendWithUserInfoVO getItemContendWithUserInfo(String itemContendId) {
        return itemsCommentsCustomDao.getItemContendWithUserInfo(itemContendId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveItemContents(Map<String, Object> map) {

        itemsCommentsCustomDao.saveItemContents(map);
    }
}




