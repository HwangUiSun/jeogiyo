package com.jpro.jconsumer;

public class JConsumerVo {
	//<로그인> - Jlogin
	//<회원가입> - JsignUp
	
	//아이디
	String mId;
	
	//이름
	String name;
	
	//비밀번호
	String pwd;
	
	//전화번호
	String phone;
	
	
	//이메일
	String email;
	
	//주소
	int zipcode;
	
	//----------------------------
	//<매장선택> - JstoreSelect
	
	//지역 검색
	String mapFindStr;
	
	//매장 검색
	String storeFindStr;
	
	//매장 리스트
	String storeList;
	
	//----------------------------
	//<메뉴 선택> - JmenuSelect
	
	//신메뉴
	String menuNew;
	
	//달콤
	String menuDal;
	
	//매콤
	String menuMae;
	
	//사이드
	String menuSide;
	
	//음료
	String menuDrink;
	
	//상품정보(foodImg) - 이미지
	
	//추가 특징
	String foodInfo;
	
	//메뉴 금액
	int J_menuPrice;
	
	//----------------------------
	//<장바구니> - bag
	
	//상품정보(foodImg) ☆
	
	//추가 특징(foodInfo) ☆
	//String foodInfo;
	
	//메뉴 금액
	//int J_menuPrice;

	//수량
	int ea;
	
	
	//----------------------------
	//<결제 및 상세정보> - Jpayhistory
	
	//주소
	String J_address;
	
	//상세주소
	String J_apiAddressDetail;
	
	//요청사항
	String request;
	
	//배달비
	int riderPrice;
	
	//상품 금액
	//int J_menuPrice;
	
	//결제 금액
	int J_totalPrice;
	
	//----------------------------
	//<결제 이후> - JpayAfter
	
	//주소
	//String address;
	
	//상세주소
	//String apiAddressDetail
	
	//결제금액
	//int J_totalPrice;

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getMapFindStr() {
		return mapFindStr;
	}

	public void setMapFindStr(String mapFindStr) {
		this.mapFindStr = mapFindStr;
	}

	public String getStoreFindStr() {
		return storeFindStr;
	}

	public void setStoreFindStr(String storeFindStr) {
		this.storeFindStr = storeFindStr;
	}

	public String getStoreList() {
		return storeList;
	}

	public void setStoreList(String storeList) {
		this.storeList = storeList;
	}

	public String getMenuNew() {
		return menuNew;
	}

	public void setMenuNew(String menuNew) {
		this.menuNew = menuNew;
	}

	public String getMenuDal() {
		return menuDal;
	}

	public void setMenuDal(String menuDal) {
		this.menuDal = menuDal;
	}

	public String getMenuMae() {
		return menuMae;
	}

	public void setMenuMae(String menuMae) {
		this.menuMae = menuMae;
	}

	public String getMenuSide() {
		return menuSide;
	}

	public void setMenuSide(String menuSide) {
		this.menuSide = menuSide;
	}

	public String getMenuDrink() {
		return menuDrink;
	}

	public void setMenuDrink(String menuDrink) {
		this.menuDrink = menuDrink;
	}

	public String getFoodInfo() {
		return foodInfo;
	}

	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
	}


	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public int getriderPrice() {
		return riderPrice;
	}

	public void setriderPrice(int riderPrice) {
		this.riderPrice = riderPrice;
	}

	public int getJ_menuPrice() {
		return J_menuPrice;
	}

	public void setJ_menuPrice(int j_menuPrice) {
		J_menuPrice = j_menuPrice;
	}

	public String getJ_address() {
		return J_address;
	}

	public void setJ_address(String j_address) {
		J_address = j_address;
	}

	public String getJ_apiAddressDetail() {
		return J_apiAddressDetail;
	}

	public void setJ_apiAddressDetail(String j_apiAddressDetail) {
		J_apiAddressDetail = j_apiAddressDetail;
	}

	public int getJ_totalPrice() {
		return J_totalPrice;
	}

	public void setJ_totalPrice(int j_totalPrice) {
		J_totalPrice = j_totalPrice;
	}

	

	
}
