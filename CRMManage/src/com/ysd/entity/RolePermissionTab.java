package com.ysd.entity;
//角色权限关系
public class RolePermissionTab {

	private int rolePermissionId;//角色权限编号
	private int roleId;//角色编号
	private int permissionId;//权限编号
	private String rolePermissionLastUpdateTime;//最后一次角色修改时间
	public int getRolePermissionId() {
		return rolePermissionId;
	}
	public void setRolePermissionId(int rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	public String getRolePermissionLastUpdateTime() {
		return rolePermissionLastUpdateTime;
	}
	public void setRolePermissionLastUpdateTime(String rolePermissionLastUpdateTime) {
		this.rolePermissionLastUpdateTime = rolePermissionLastUpdateTime;
	}
	@Override
	public String toString() {
		return "RolePermissionTab [rolePermissionId=" + rolePermissionId + ", roleId=" + roleId + ", permissionId="
				+ permissionId + ", rolePermissionLastUpdateTime=" + rolePermissionLastUpdateTime + "]";
	}
	
}
