package com.bank.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bank.model.Account;

@Component
public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("bank");


	@Autowired
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
