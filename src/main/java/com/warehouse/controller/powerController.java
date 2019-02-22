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
	
	/**
	 * 角色添加模块
	 * @return
	 */
	@RequestMapping("/roleAdd")
	public String roleAdd() {
		return "/powerSystem/admin-role-add";
	}
	
	/**
	 * 权限管理模块
	 * @return
	 */
	@RequestMapping("/permission")
	public String permission() {
		return "/powerSystem/admin-permission";
	}
	
	/**
	 * 管理员模块  同等于用户
	 * @return
	 */
	@RequestMapping("/adminList")
	public String adminList() {
		return "/powerSystem/admin-list";
	}
	/**
	 * 管理员模块--添加管理员
	 * @return
	 */
	@RequestMapping("/adminAdd")
	public String adminAdd() {
		return "/powerSystem/admin-add";
	}
}
