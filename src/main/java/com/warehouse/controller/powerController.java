package com.warehouse.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.warehouse.pojo.adminManage.Role;
import com.warehouse.service.RoleService;

/**
 * 权限管理控制器
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/admin")
public class powerController {
	
	@Autowired
	RoleService roleService;
	
	/**
	 * 角色管理模块
	 * @return
	 */
	@RequestMapping("/roleManage")
	public String roleManage(Model model) {
		 List<Role> roleQuery = roleQuery(null);
		model.addAttribute("data", roleQuery);
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
	
	
	
	
	
	
	/**
	 * 角色查询
	 * @return
	 */
	@RequestMapping("/roleSelect")
	@ResponseBody
	public List<Role> roleSelect(ServletRequest request) {
		Map<String, Object> requirement = requestConvertMap(request);
		
		List<Role> roleQuery = roleQuery(requirement);
		return roleQuery;
	}
	
	/**
	 * 角色查询 --查询数据库
	 * @param requirement
	 * @return
	 */
	public List<Role> roleQuery(Map<String, Object> requirement){
		List<Role> roleSelect = roleService.roleSelect(requirement);
		return roleSelect;
	}
	
	public Map<String,Object> requestConvertMap(ServletRequest sr){
		Map<String, Object> parametersStartingWith = WebUtils.getParametersStartingWith(sr,"");
		
		return parametersStartingWith;
	}
}
