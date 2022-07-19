package com.jpro.jstore;

public class JpayAfterVo {
	String address, apiAddressDetail, nal, storeName, mainLocal, date1, date2;
	int J_totalPrice;
	
	public String getAddress() {
		return address;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getApiAddressDetail() {
		return apiAddressDetail;
	}
	public String getMainLocal() {
		return mainLocal;
	}
	public void setMainLocal(String mainLocal) {
		this.mainLocal = mainLocal;
	}
	public void setApiAddressDetail(String apiAddressDetail) {
		this.apiAddressDetail = apiAddressDetail;
	}
	public String getNal() {
		return nal;
	}
	public void setNal(String nal) {
		this.nal = nal;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public int getJ_totalPrice() {
		return J_totalPrice;
	}
	public void setJ_totalPrice(int j_totalPrice) {
		J_totalPrice = j_totalPrice;
	}
}
