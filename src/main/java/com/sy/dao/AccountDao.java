package com.sy.dao;

import com.sy.domain.Account;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface AccountDao {
    //查询全部账户(包含用户信息)
    @Select("select * from account")
    public List<Account> findAll();
}
