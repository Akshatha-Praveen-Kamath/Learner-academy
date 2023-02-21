package org.simplilearn.lms.DAO;

import org.simplilearn.lms.entities.User;

public interface SavedUserLoginDao {
	void insert(User user);
}
