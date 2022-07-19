package com.jpro.jstore;

public class JpayAfterVo {
	String address, apiAddressDetail, nal, storeName, mainLocal;
	int J_totalPrice;
	
	public String getAddress() {
		return address;
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
