package com.ysd.entity;
//模块表
public class ModuleTab {

	private int moduleId;//模块编号
	private int parentId;//父编号
	private String moduleName;//模块名称
	private Double moduleWeight;//模块权重
	private String moduleUrl;//模块路径
	private String moduleCreateTime;//模块创建时间
	private String roleModuleLastUpdateTime;//最后一次角色修改时间
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Double getModuleWeight() {
		return moduleWeight;
	}
	public void setModuleWeight(Double moduleWeight) {
		this.moduleWeight = moduleWeight;
	}
	public String getModuleUrl() {
		return moduleUrl;
	}
	public void setModuleUrl(String moduleUrl) {
		this.moduleUrl = moduleUrl;
	}
	public String getModuleCreateTime() {
		return moduleCreateTime;
	}
	public void setModuleCreateTime(String moduleCreateTime) {
		this.moduleCreateTime = moduleCreateTime;
	}
	public String getRoleModuleLastUpdateTime() {
		return roleModuleLastUpdateTime;
	}
	public void setRoleModuleLastUpdateTime(String roleModuleLastUpdateTime) {
		this.roleModuleLastUpdateTime = roleModuleLastUpdateTime;
	}
	@Override
	public String toString() {
		return "ModuleTab [moduleId=" + moduleId + ", parentId=" + parentId + ", moduleName=" + moduleName
				+ ", moduleWeight=" + moduleWeight + ", moduleUrl=" + moduleUrl + ", moduleCreateTime="
				+ moduleCreateTime + ", roleModuleLastUpdateTime=" + roleModuleLastUpdateTime + "]";
	}
	
}
