package com.hz.hz.persistence.dao;

import com.hz.hz.persistence.model.Admin;

public interface AdminDao {

	public int insert(Admin sAdmin);

	public int update(Admin sAdmin);

	public int delete(java.lang.Integer id);

	public Admin getAdminByKey(java.lang.Integer id);

	public java.util.List<Admin> getAdmins(Admin sAdmin);
}
