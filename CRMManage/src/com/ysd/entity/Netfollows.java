package com.ysd.entity;
//追踪记录
public class Netfollows {

	private int Id;//编号
	private int StudentId;//学生编号
	private String StudentName;//学生姓名
	private String FollowTime;//追踪时间
	private String NextFollowTime;//下次追踪时间
	private String Content;//内容
	private int UserId;//用户编号
	private String FollowType;//回访方式
	private String CreateTime;//创建时间
	private int FollowState;//回访状态
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getFollowTime() {
		return FollowTime;
	}
	public void setFollowTime(String followTime) {
		FollowTime = followTime;
	}
	public String getNextFollowTime() {
		return NextFollowTime;
	}
	public void setNextFollowTime(String nextFollowTime) {
		NextFollowTime = nextFollowTime;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFollowType() {
		return FollowType;
	}
	public void setFollowType(String followType) {
		FollowType = followType;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public int getFollowState() {
		return FollowState;
	}
	public void setFollowState(int followState) {
		FollowState = followState;
	}
	@Override
	public String toString() {
		return "Netfollows [Id=" + Id + ", StudentId=" + StudentId + ", StudentName=" + StudentName + ", FollowTime="
				+ FollowTime + ", NextFollowTime=" + NextFollowTime + ", Content=" + Content + ", UserId=" + UserId
				+ ", FollowType=" + FollowType + ", CreateTime=" + CreateTime + ", FollowState=" + FollowState + "]";
	}
	
}
