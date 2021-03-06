package com.byshj.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.byshj.common.dao.DaoException;


/**
 * 数据库操作
 * @author SXJ
 *
 */
public class DBHelper {
	private static final Properties props = new Properties();
	private static DataSource ds;

	private DBHelper() {
	}

	static {

		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties"));

			ds = DruidDataSourceFactory.createDataSource(props);
		} catch (IOException e) {
			System.err.println("在classpath下未找到jdbc.properties配置文件！！！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Druid连接池初始化出现异常，请检查jdbc.properties配置文件！！！");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 从连接池中获取一个连接对象，此对象在调用close()方法时，会自动放回连接池中
	 * 
	 * @return 成功，返回Connection对象；否则返回null
	 * @throws DaoException
	 */
	public static Connection getConn() throws DaoException {
		Connection conn = null;

		try {
			conn = ds.getConnection();
		} catch (SQLException e) {
			throw new DaoException(DaoException.CODE_CONNECTION_FAIL, "获取数据库的连接失败", e);
		}

		return conn;
	}
	
}
