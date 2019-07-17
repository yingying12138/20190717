package com.sy.test;

import com.sy.dao.AccountDao;
import com.sy.domain.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatisOTO {
    @Test
    public void test(){
        InputStream inputStream = this.getClass().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        List<Account> accountList = accountDao.findAll();

        for(Account account : accountList){
            System.out.println(account);
        }

        sqlSession.close();
    }
}
