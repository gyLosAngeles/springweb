package com.ysd.entity;
//用户角色关系表
public class UserRoleTab {

	private int userRoleId;//用户角色编号
	private int userId;//用户编号
	private int roleId;//角色编号
	private String userRoleLastUpdateTime;//用户角色最后一次修改时间
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getUserRoleLastUpdateTime() {
		return userRoleLastUpdateTime;
	}
	public void setUserRoleLastUpdateTime(String userRoleLastUpdateTime) {
		this.userRoleLastUpdateTime = userRoleLastUpdateTime;
	}
	@Override
	public String toString() {
		return "UserRoleTab [userRoleId=" + userRoleId + ", userId=" + userId + ", roleId=" + roleId
				+ ", userRoleLastUpdateTime=" + userRoleLastUpdateTime + "]";
	}
	
}
