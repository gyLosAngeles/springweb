package com.ysd.entity;
//用户签到
public class UserChecks {

	private int Id;//编号
	private int UserId;//用户编号
	private String UserName;//用户名称
	private String CheckInTime;//签到时间
	private int CheckState;//签到状态
	private int IsCancel;//是否取消签到
	private String CheckOutTime;//退签时间
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getCheckInTime() {
		return CheckInTime;
	}
	public void setCheckInTime(String checkInTime) {
		CheckInTime = checkInTime;
	}
	public int getCheckState() {
		return CheckState;
	}
	public void setCheckState(int checkState) {
		CheckState = checkState;
	}
	public int getIsCancel() {
		return IsCancel;
	}
	public void setIsCancel(int isCancel) {
		IsCancel = isCancel;
	}
	public String getCheckOutTime() {
		return CheckOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		CheckOutTime = checkOutTime;
	}
	public UserChecks(int id, int userId, String userName, String checkInTime, int checkState, int isCancel,
			String checkOutTime) {
		super();
		Id = id;
		UserId = userId;
		UserName = userName;
		CheckInTime = checkInTime;
		CheckState = checkState;
		IsCancel = isCancel;
		CheckOutTime = checkOutTime;
	}
	
}
