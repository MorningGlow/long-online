package com.luxshare.common.service;

/**
 * 基础 BaseService 接口
 *
 * @author lion hua
 * @since 2019-11-07
 */
public interface BaseService<T> {

    /**
     * 根据一张表的主键 KEY 来获取一笔数据
     *
     * @param primaryKey 表主键 key
     * @return T
     */
    T getOneByPrimaryKey(Object primaryKey);

    /**
     * 根据所传实体对象中的唯一 key 值来更新数据,所传实体中其它属性是要更新的值
     *
     * @param t T的实体对象
     * @return 更新数据库记录的条数
     */
    int updateByPrimaryKey(T t);

    /**
     * 插入一条数据
     *
     * @param t T的实体对象
     * @return 返回一个 int 值
     */
    int insert(T t);

    /**
     * 根据单表中的唯一键值来删除一笔数据
     *
     * @param primaryKey 表中唯一主键
     * @return 返回 int 值
     */
    int deleteByPrimaryKey(Object primaryKey);


}
