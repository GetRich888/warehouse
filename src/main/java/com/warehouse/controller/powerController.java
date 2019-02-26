package com.warehouse.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import com.warehouse.pojo.adminManage.Personnel;
import com.warehouse.pojo.adminManage.Power;
import com.warehouse.pojo.adminManage.Role;
import com.warehouse.service.PersonnelService;
import com.warehouse.service.PowerService;
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
	
	@Autowired
	PowerService powerService;
	
	@Autowired
	PersonnelService personnelService;
	
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
	public String permission(Model model) {
		//查询权限集合 (默认条件)
		List<Power> queryPower = powerService.queryPower(null);
		 
		model.addAttribute("data",queryPower);
		return "/powerSystem/admin-permission";
	}
	
	/**
	 * 管理员模块  同等于用户
	 * @return
	 */
	@RequestMapping("/adminList")
	public String adminList(Model model) {
		
		List<Personnel> queryPersonnel = personnelService.queryPersonnel(null);
		model.addAttribute("data", queryPersonnel);
		
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
	 * @param require
	 * @return
	 */
	public List<Role> roleQuery(Map<String, Object> require){
		List<Role> roleSelect = roleService.roleSelect(require);
		return roleSelect;
	}
	
	@RequestMapping("/roleInsert")
	@ResponseBody
	@Transactional
	public int roleInsert(Role role) {
		
		try {
			int roleInsert = roleService.roleInsert(role);
			return roleInsert;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
		
	}
	
	
	
	/**
	 * 条件转换 --将请求参数转换为Map
	 * @param sr
	 * @return
	 */
	public Map<String,Object> requestConvertMap(ServletRequest sr){
		Map<String, Object> parametersStartingWith = WebUtils.getParametersStartingWith(sr,"");
		
		return parametersStartingWith;
	}
}
