package com.shf.demo01;

import java.util.List;

public interface AccountDao {
    public int addAccount(Account account);
    public int updateAccount(Account account);
    public int deleteAccount(int id);
    public Account findAccountById(int id);
    public List<Account> findAccount(int id);

    void transfer(String outUser,String inUser,Double money);
}
