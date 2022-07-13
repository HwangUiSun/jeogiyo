package com.jpro.jstore;

public class JbaljuListVo {
	int sno;
	String category;
	String productName;
	int ea;
	boolean status;
	
	
	public JbaljuListVo() {
		this.category="임시카테고리";
		this.productName="임시제품명";
		this.ea=0;
		this.status=true;
	}
	
	public JbaljuListVo(String productName) {
		this.category="임시카테고리";
		this.productName=productName;
		this.ea=0;
		this.status=true;
	}
	
	public JbaljuListVo(String category, String productName, int ea, boolean status) {
		this.category=category;
		this.productName=productName;
		this.ea=ea;
		this.status=status;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
