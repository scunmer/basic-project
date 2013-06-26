package cn.diamond.citest;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.tbd.demo.model.UserModel;
import cn.tbd.demo.service.UserService;

/**
 * 
 * Integration Test
 * 
 */
//@Ignore

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
public class UserServiceTest {
    
    AtomicInteger counter = new AtomicInteger();
    
    @Autowired
    private UserService userService;
    
 
    @Test
    public void testCreate() {
        
        int beforeDbCount = userService.countAll();
        
        userService.save(genRandomUser());
        
        int afterDbCount = userService.countAll();
        
        assertEquals(beforeDbCount + 1, afterDbCount);
    }
    
    @Test
    public void testUpdate() {
        
        UserModel user = userService.save(genRandomUser());
        String expectedPassword = "123234";
        user.setPassword(expectedPassword);
        userService.update(user);
        
        String actualPassword = userService.get(user.getId()).getPassword();
        
        assertEquals(expectedPassword, actualPassword);
        
    }
    
    @Test
    public void testDelete() {

        int beforeDbCount = userService.countAll();
        
        UserModel user = userService.save(genRandomUser());
        
        userService.delete(user.getId());
        
        int afterDbCount = userService.countAll();
        
        assertEquals(beforeDbCount, afterDbCount);
    }
    
    @Test
    public void testList() {

        UserModel user = userService.save(genRandomUser());
        
        List<UserModel> userList = userService.listAll();
        
        assertThat(userList, hasItem(user));
    }
    
    
    public UserModel genRandomUser() {
        long randomKey = System.nanoTime() + counter.addAndGet(1);
        UserModel user = new UserModel();
        user.setUsername("test" + randomKey);
        user.setEmail("test" + randomKey + "@gmail.com");
        user.setPassword("123456");
        return user;
    }
    
    

}
