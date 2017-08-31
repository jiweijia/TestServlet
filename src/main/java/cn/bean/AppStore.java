package cn.bean;

public class AppStore {

	private int phoneId;
	private String phoneType;
	private String appName;
	private String password;
	public AppStore() {
		super();
	}
	public AppStore(int phoneId, String phoneType, String appName, String password) {
		super();
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.appName = appName;
		this.password = password;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
