package org.simplilearn.lms.DAO;

import org.simplilearn.lms.entities.User;

public interface UserDao {
	void insert(User user);
	User get(String username,String password);
	void update(User user);
}
