package application;

import java.sql.Connection;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) throws DbException {

		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}