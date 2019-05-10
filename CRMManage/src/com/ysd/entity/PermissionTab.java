package com.ysd.entity;
//权限表
public class PermissionTab {

	private int permissionId;//权限编号
	private String permissionValue;//权限值
	private String permissionModule;//权限模块
	private String permissionName;//权限名称
	private String permissionLastUpdateTime;//最后一次角色修改时间
	public int getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(int permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionValue() {
		return permissionValue;
	}
	public void setPermissionValue(String permissionValue) {
		this.permissionValue = permissionValue;
	}
	public String getPermissionModule() {
		return permissionModule;
	}
	public void setPermissionModule(String permissionModule) {
		this.permissionModule = permissionModule;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionLastUpdateTime() {
		return permissionLastUpdateTime;
	}
	public void setPermissionLastUpdateTime(String permissionLastUpdateTime) {
		this.permissionLastUpdateTime = permissionLastUpdateTime;
	}
	@Override
	public String toString() {
		return "PermissionTab [permissionId=" + permissionId + ", permissionValue=" + permissionValue
				+ ", permissionModule=" + permissionModule + ", permissionName=" + permissionName
				+ ", permissionLastUpdateTime=" + permissionLastUpdateTime + "]";
	}
	
}
