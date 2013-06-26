package cn.tbd.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.tbd.common.dao.IBaseDao;
import cn.tbd.common.service.impl.BaseService;
import cn.tbd.demo.dao.UserDao;
import cn.tbd.demo.model.UserModel;
import cn.tbd.demo.service.UserService;

/**
 * 
 */

@Service("UserService")
public class UserServiceImpl extends BaseService<UserModel, Integer> implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDao userDao;

    @Autowired
    @Qualifier("UserDao")
    @Override
    public void setBaseDao(IBaseDao<UserModel, Integer> userDao) {
        this.baseDao = userDao;
        this.userDao = (UserDao) userDao;
    }

   
}