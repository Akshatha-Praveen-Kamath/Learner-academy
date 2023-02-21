package org.simplilearn.lms.service;

import org.simplilearn.lms.DAO.SavedUserLoginDao;
import org.simplilearn.lms.DAO.SavedUserLoginDaoImpl;
import org.simplilearn.lms.entities.User;

public class SavedUserLoginImpl implements SavedUserLogin {
	SavedUserLoginDao dao=new SavedUserLoginDaoImpl();
	public void insert(User user) {
		dao.insert(user);
	}

}
