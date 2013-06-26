package cn.tbd.common.service.impl;

import java.util.List;

import cn.tbd.common.dao.IBaseDao;
import cn.tbd.common.service.IBaseService;

public abstract class BaseService<M extends java.io.Serializable, PK extends java.io.Serializable> implements IBaseService<M, PK> {
    
    protected IBaseDao<M, PK> baseDao;
    
    public abstract void setBaseDao(IBaseDao<M, PK> baseDao);
    

    @Override
    public M save(M model) {
        baseDao.save(model);
        return model;
    }
    
    @Override
    public void merge(M model) {
        baseDao.merge(model);
    }

    @Override
    public void saveOrUpdate(M model) {
        baseDao.saveOrUpdate(model);
    }

    @Override
    public void update(M model) {
        baseDao.update(model);
    }
    
    @Override
    public void delete(PK id) {
        baseDao.delete(id);
    }

    @Override
    public void deleteObject(M model) {
        baseDao.deleteObject(model);
    }

    @Override
    public M get(PK id) {
        return baseDao.get(id);
    }

   
    
    @Override
    public int countAll() {
        return baseDao.countAll();
    }

	@Override
	public List<M> listAll() {
		return baseDao.listAll();
	}

}
