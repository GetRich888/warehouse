package com.warehouse.service;

import java.util.List;
import java.util.Map;

import com.warehouse.pojo.adminManage.Power;

/**
 * 权限管理 --业务逻辑层
 * @author Administrator
 *
 */
public interface PowerService {
	
	
	List<Power> queryPower(Map<String, Object> require);
}
