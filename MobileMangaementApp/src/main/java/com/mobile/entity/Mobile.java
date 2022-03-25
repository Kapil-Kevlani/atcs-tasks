package com.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobdata")
public class Mobile {
	@Id
	@Column(name = "mId", length = 10)
	private int mobileId;
	@Column(name = "mName", length = 15)
	private String mobileName;
	@Column(name = "mType", length = 10)
	private String mobileTYPE;
	@Column(name = "mPrice", length = 10)
	private int mobilePrice;
	@Column(name = "mWar", length = 10)
	private String mobileWarenty;
	@Column(name = "mImNo.", length = 10)
	private int mobileIMEINumber;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileTYPE() {
		return mobileTYPE;
	}
	public void setMobileTYPE(String mobileTYPE) {
		this.mobileTYPE = mobileTYPE;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileWarenty() {
		return mobileWarenty;
	}
	public void setMobileWarenty(String mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}
	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public Mobile(int mobileId, String mobileName, String mobileTYPE, int mobilePrice, String mobileWarenty,
			int mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileTYPE = mobileTYPE;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileTYPE=" + mobileTYPE
				+ ", mobilePrice=" + mobilePrice + ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}
	

	
	

}
