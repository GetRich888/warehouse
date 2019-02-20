package com.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 权限管理控制器
 * @author Administrator
 *
 */

@Controller
public class powerController {
	
	/**
	 * 角色管理模块
	 * @return
	 */
	@RequestMapping("/roleManage")
	public String roleManage() {
		return "/powerSystem/admin-role";
	}
}
