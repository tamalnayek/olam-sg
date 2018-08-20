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


	public JdbcAccountRepository(DataSource dataSource) {
		logger.info("JdbcAccountRepository instance created...");
	}

	public Account load(String num) {
		logger.info("loading account - " + num);
		return null;
	}

	public void update(Account account) {
		logger.info("updating account");
	}

}
