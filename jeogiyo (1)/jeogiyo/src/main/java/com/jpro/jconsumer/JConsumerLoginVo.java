package com.jpro.jconsumer;

public class JConsumerLoginVo {
	String mid, pwd, name, email, phone, address, zipcode, storeName, mainLocal, subLocal, status, doc, subject, nal;
	
	public JConsumerLoginVo(String mid,String pwd,String name,String email,String phone,String address,String zipcode,String storeName,String mainLocal,String subLocal,String status,String doc,String subject,String nal) {
		
		this.mid = mid;
		this.name= name;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.zipcode =zipcode;
		this.storeName =storeName;
		this.mainLocal=mainLocal;
		this.status=status;
		this.doc=doc;
		this.nal=nal;
	}
		
		public String getMainLocal() {
			return mainLocal;
		}

		public String getStatus() {
			return status;
		}

		public String getNal() {
			return nal;
		}

		public void setNal(String nal) {
			this.nal = nal;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDoc() {
			return doc;
		}

		public void setDoc(String doc) {
			this.doc = doc;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public void setMainLocal(String mainLocal) {
			this.mainLocal = mainLocal;
		}

		public String getSubLocal() {
			return subLocal;
		}

		public void setSubLocal(String subLocal) {
			this.subLocal = subLocal;
		}

		public String getMid() {
			return mid;
		}

		public void setMid(String mid) {
			this.mid = mid;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		
		
	}


