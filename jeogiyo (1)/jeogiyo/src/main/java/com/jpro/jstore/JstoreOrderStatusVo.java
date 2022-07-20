package com.jpro.jstore;
// 가맹 주문현황
public class JstoreOrderStatusVo {
	String mid;
	String ordertime;
	int totalprice;
	String howtopay;
	String ordermenu;
	String address;
	int sno;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public String getHowtopay() {
		return howtopay;
	}
	public void setHowtopay(String howtopay) {
		this.howtopay = howtopay;
	}
	public String getOrdermenu() {
		return ordermenu;
	}
	public void setOrdermenu(String ordermenu) {
		this.ordermenu = ordermenu;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	String phone;
	/*	회의 후 결정
	 *  주문시간, 메뉴정보, 주소, 결제정보, 남은시간, 가격
	 * */
	
}
