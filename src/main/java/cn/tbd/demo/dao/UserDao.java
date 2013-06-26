package cn.tbd.demo.dao;

import java.util.List;

import cn.tbd.common.dao.IBaseDao;
import cn.tbd.demo.model.UserModel;
import cn.tbd.demo.model.UserQueryModel;


public interface UserDao extends IBaseDao<UserModel, Integer> {
    
    List<UserModel> query(int pn, int pageSize, UserQueryModel command);

    int countQuery(UserQueryModel command);

}
