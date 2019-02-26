package com.warehouse.service;

import java.util.List;
import java.util.Map;

import com.warehouse.pojo.adminManage.Personnel;

/**
 * 员工管理 --业务逻辑层
 * @author Administrator
 *
 */
public interface PersonnelService {
	
	/**
	 * 按条件查询员工
	 * @param require 条件
	 * @return 员工集合
	 */
	List<Personnel> queryPersonnel(Map<String, Object> require);
}
