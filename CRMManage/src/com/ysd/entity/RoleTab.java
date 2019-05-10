package com.ysd.entity;
//角色表
public class RoleTab {

	private int roleId;//角色编号
	private String roleName;//角色名称
	private String roleExplain;//角色接释
	private String roleCreateTime;//角色创建时间
	private String roleLastUpdateTime;//最后一次角色修改时间
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleExplain() {
		return roleExplain;
	}
	public void setRoleExplain(String roleExplain) {
		this.roleExplain = roleExplain;
	}
	public String getRoleCreateTime() {
		return roleCreateTime;
	}
	public void setRoleCreateTime(String roleCreateTime) {
		this.roleCreateTime = roleCreateTime;
	}
	public String getRoleLastUpdateTime() {
		return roleLastUpdateTime;
	}
	public void setRoleLastUpdateTime(String roleLastUpdateTime) {
		this.roleLastUpdateTime = roleLastUpdateTime;
	}
	@Override
	public String toString() {
		return "RoleTab [roleId=" + roleId + ", roleName=" + roleName + ", roleExplain=" + roleExplain
				+ ", roleCreateTime=" + roleCreateTime + ", roleLastUpdateTime=" + roleLastUpdateTime + "]";
	}
	
}
