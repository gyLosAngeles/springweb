package com.ysd.entity;
//用户表
public class UserTab {

	private int userId;//用户编号
	private String userName;//用户姓名
	private String userPassWord;//用户密码
	private int userIsLockout;//是否被锁定
	private String userUpdateTime;//用户修改时间
	private String userCreateTime;//用户创建时间
	private String userLastLoginTime;//最后一次登陆时间
	private String userLastLoginIp;//最后一次登陆ip
	private int userPassWrongCout;//用户密码错误次数
	private String userLockoutTime;//用户锁定时间
	private String userEmail;//用户的Email
	private String userTelephone;//用户电话
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassWord() {
		return userPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}
	public int getUserIsLockout() {
		return userIsLockout;
	}
	public void setUserIsLockout(int userIsLockout) {
		this.userIsLockout = userIsLockout;
	}
	public String getUserUpdateTime() {
		return userUpdateTime;
	}
	public void setUserUpdateTime(String userUpdateTime) {
		this.userUpdateTime = userUpdateTime;
	}
	public String getUserCreateTime() {
		return userCreateTime;
	}
	public void setUserCreateTime(String userCreateTime) {
		this.userCreateTime = userCreateTime;
	}
	public String getUserLastLoginTime() {
		return userLastLoginTime;
	}
	public void setUserLastLoginTime(String userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
	}
	public String getUserLastLoginIp() {
		return userLastLoginIp;
	}
	public void setUserLastLoginIp(String userLastLoginIp) {
		this.userLastLoginIp = userLastLoginIp;
	}
	public int getUserPassWrongCout() {
		return userPassWrongCout;
	}
	public void setUserPassWrongCout(int userPassWrongCout) {
		this.userPassWrongCout = userPassWrongCout;
	}
	public String getUserLockoutTime() {
		return userLockoutTime;
	}
	public void setUserLockoutTime(String userLockoutTime) {
		this.userLockoutTime = userLockoutTime;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTelephone() {
		return userTelephone;
	}
	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}
	@Override
	public String toString() {
		return "UserTab [userId=" + userId + ", userName=" + userName + ", userPassWord=" + userPassWord
				+ ", userIsLockout=" + userIsLockout + ", userUpdateTime=" + userUpdateTime + ", userCreateTime="
				+ userCreateTime + ", userLastLoginTime=" + userLastLoginTime + ", userLastLoginIp=" + userLastLoginIp
				+ ", userPassWrongCout=" + userPassWrongCout + ", userLockoutTime=" + userLockoutTime + ", userEmail="
				+ userEmail + ", userTelephone=" + userTelephone + "]";
	}
}
