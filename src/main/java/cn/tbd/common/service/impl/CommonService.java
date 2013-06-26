package cn.tbd.common.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.tbd.common.dao.ICommonDao;
import cn.tbd.common.model.AbstractModel;
import cn.tbd.common.service.ICommonService;

@Service("CommonService")
public class CommonService implements ICommonService {
    
    @Autowired
    @Qualifier("CommonHibernateDao")
    private ICommonDao commonDao;


    public <T extends AbstractModel> T save(T model) {
        return commonDao.save(model);
    }

    public <T extends AbstractModel> void saveOrUpdate(T model) {
        commonDao.saveOrUpdate(model);
        
    }
    
    public <T extends AbstractModel> void update(T model) {
        commonDao.update(model);
    }
    
    public <T extends AbstractModel> void merge(T model) {
        commonDao.merge(model);
    }

    public <T extends AbstractModel, PK extends Serializable> void delete(Class<T> entityClass, PK id) {
        commonDao.delete(entityClass, id);
    }

    public <T extends AbstractModel> void deleteObject(T model) {
        commonDao.deleteObject(model);
    }

    public <T extends AbstractModel, PK extends Serializable> T get(Class<T> entityClass, PK id) {
        return commonDao.get(entityClass, id);
        
    }
    
    public <T extends AbstractModel> int countAll(Class<T> entityClass) {
        return commonDao.countAll(entityClass);
    }
    
    public <T extends AbstractModel> List<T> listAll(Class<T> entityClass) {
        return commonDao.listAll(entityClass);
    }

}
