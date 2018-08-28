package com.bank.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.bank.db.ConnectionFactory;
import com.bank.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private Logger logger = Logger.getLogger("bank-txr");

	public JdbcAccountRepository() {
		logger.info("JdbcAccountRepository instance created");
	}

	@Override
	public Account loadAccount(String num) {
		logger.info("loading account - " + num);
		Connection con = null;
		Account account = null;
		try {
			con = ConnectionFactory.getDataSource().getConnection();

			String sql = "select * from ACCOUNT acc where acc.num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, num);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				account = new Account();
				account.setNum(rs.getString(1));
				account.setName(rs.getString(2));
				account.setBalance(rs.getDouble(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close(); //
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return account;
	}

	@Override
	public void updateAccount(Account account) {
		//logger.info("udating account - " + account.getNum());
		Connection con = null;
		try {
			con = ConnectionFactory.getDataSource().getConnection();
			String sql = "update ACCOUNT set balance=? where num=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, account.getBalance());
			ps.setString(2, account.getNum());

			ps.executeUpdate();

			logger.info("udated account - " + account.getNum());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close(); //
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
