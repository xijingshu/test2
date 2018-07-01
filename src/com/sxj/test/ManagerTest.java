package com.sxj.test;

import java.util.List;

import com.byshj.common.dao.DaoFactory;
import com.sxj.dao.ManagerDao;
import com.sxj.entity.Manager;

public class ManagerTest {
	public static void main(String[] args) {
		// TestSave();
		// TestFindALL();
		 testFindByName();
		// testFindByGender();
		// testUpdate();
		//testUpdate1();
		//testdEL();
	}
	public static void testdEL(){
		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
	  ma.delete(4l);
	  System.out.println("删除完毕！");
	}

	public static void testUpdate1() {

		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
		Manager manager = ma.findOne("select * from manager where name=? ", "张三");
		System.out.println("查到的manager=" + manager.toString());
		manager.setTel("110");
		System.out.println("修改后的manager="+manager.toString());
		ma.update(manager);
		System.out.println("修改数据库后11111");

	}

	public static void testUpdate() {
		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
		ma.update("update manager set tel=? where id=?", "136171628192", 3);
		System.out.println("修改完毕！");

	}

	public static void testFindByGender() {
		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
		List<Manager> mlist = ma.find("select * from manager where gender=?", 1);
		for (Manager manager : mlist) {
			System.out.println(manager.toString());
		}
	}

	public static void testFindByName() {
		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
		Manager manager = ma.findOne("select * from manager where name=?", "张三");
		System.out.println(manager.toString());
	}

	public static void TestFindALL() {
		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
		List<Manager> mlis = ma.findAll();
		for (Manager manager : mlis) {
			System.out.println(manager.toString());
		}

	}

	public static void TestSave() {
		ManagerDao ma = (ManagerDao) DaoFactory.getDaoImpl("maDao");
		Manager manager = new Manager();
		manager.setName("李四");
		manager.setPassword("1111");
		manager.setGender(0);
		manager.setTel("13516172819");

		ma.save(manager);
		System.out.println("添加成功!");
	}

}
