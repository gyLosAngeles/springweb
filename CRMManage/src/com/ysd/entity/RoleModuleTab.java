package com.ysd.entity;
//角色模块关系表
public class RoleModuleTab {

	private int roleModuleId;//角色模块编号
	private int roleId;//角色编号
	private int moduleId;//模块编号
	private String roleModuleLastUpdateTime;//最后一次角色修改时间
	public int getRoleModuleId() {
		return roleModuleId;
	}
	public void setRoleModuleId(int roleModuleId) {
		this.roleModuleId = roleModuleId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getRoleModuleLastUpdateTime() {
		return roleModuleLastUpdateTime;
	}
	public void setRoleModuleLastUpdateTime(String roleModuleLastUpdateTime) {
		this.roleModuleLastUpdateTime = roleModuleLastUpdateTime;
	}
	@Override
	public String toString() {
		return "RoleModuleTab [roleModuleId=" + roleModuleId + ", roleId=" + roleId + ", moduleId=" + moduleId
				+ ", roleModuleLastUpdateTime=" + roleModuleLastUpdateTime + "]";
	}
	
}
