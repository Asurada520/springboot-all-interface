package com.ybzbcq.service;

import com.ybzbcq.model.InfoUser;

import java.util.List;

public interface UserService {

    /**
     * 根据主键ID 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增数据
     * @param infoUser
     * @return
     */
    int insertSelective(InfoUser infoUser);

    /**
     * 根据主键id 查询
     * @param id
     * @return
     */
    InfoUser selectByPrimaryKey(Integer id);

    /**
     * 根据主键ID 更新
     * @param infoUser
     * @return
     */
    int updateByPrimaryKeySelective(InfoUser infoUser);

    /**
     * 条件查询
     * @param infoUser
     * @return
     */
    List<InfoUser> selectByMultCondition(InfoUser infoUser);
}
