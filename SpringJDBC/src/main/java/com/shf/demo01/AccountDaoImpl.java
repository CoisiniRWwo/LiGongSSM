package com.shf.demo01;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-05-18 10 42
 * @Project:LiGongSSM
 */
public class AccountDaoImpl implements AccountDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(Account account) {
        String sql = "insert into account (username,balance) values(?,?)";
        Object[] objects = {account.getUsername(), account.getBalance()};
        return jdbcTemplate.update(sql,objects);
    }

    @Override
    public int updateAccount(Account account) {
        return 0;
    }

    @Override
    public int deleteAccount(int id) {
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id = ?";
        RowMapper<Account> accountRowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        Account account = jdbcTemplate.queryForObject(sql, accountRowMapper, id);
        return account;
    }

    @Override
    public List<Account> findAccount(int id) {
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED,readOnly = false,isolation = Isolation.DEFAULT)
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        jdbcTemplate.update("update account set balance = balance - ? where username = ?",money,inUser);
//        int i = 1/0;
        jdbcTemplate.update("update account set balance =balance + ? where username = ?",money,outUser);
    }
}
