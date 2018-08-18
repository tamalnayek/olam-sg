package com.bank.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bank.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("bank");

	private JdbcTemplate jdbcTemplate;

	public JdbcAccountRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		logger.info("JdbcAccountRepository instance created...");
	}

	public Account load(String num) {
		logger.info("loading account - " + num);
		String sql = "select * from ACCOUNT where num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Account>() {
			public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString("num"));
				account.setBalance(rs.getDouble("balance"));
				return account;
			}
		}, num);
	}

	public void update(Account account) {
		logger.info("updating account");
		jdbcTemplate.update("update ACCOUNT set balance=? where num=?", account.getBalance(), account.getNum());
	}

}
