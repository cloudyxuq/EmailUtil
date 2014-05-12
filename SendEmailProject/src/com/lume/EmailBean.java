package com.lume;

public class EmailBean {
	
	private String hostName;
	private String authName;
	private String authPwd;
	private Integer smtpPort;
	private String smtpSSLProt;
	private Boolean isSSL = Boolean.FALSE;
	private String sendFrom;
	private String addTo;
	private String content;
	private String title;
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthPwd() {
		return authPwd;
	}
	public void setAuthPwd(String authPwd) {
		this.authPwd = authPwd;
	}
	public Integer getSmtpPort() {
		return smtpPort;
	}
	public void setSmtpPort(Integer smtpPort) {
		this.smtpPort = smtpPort;
	}
	
	public String getSmtpSSLProt() {
		return smtpSSLProt;
	}
	public void setSmtpSSLProt(String smtpSSLProt) {
		this.smtpSSLProt = smtpSSLProt;
	}
	public Boolean getIsSSL() {
		return isSSL;
	}
	public void setIsSSL(Boolean isSSL) {
		this.isSSL = isSSL;
	}
	public String getSendFrom() {
		return sendFrom;
	}
	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}
	public String getAddTo() {
		return addTo;
	}
	public void setAddTo(String addTo) {
		this.addTo = addTo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
	
}
