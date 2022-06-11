package com.shopping.model;

import java.sql.Date;

/*
    productId number primary key,
    productName varchar2(50)   not null,
    productPrice number not null,
    productStock number not null,
    productIntro varchar2(100),
    productContents varchar2(100),
    regDate date default sysdate,
    updateDate date default sysdate
 */
public class ProductVO {

	private int productId;
	private String productName;
	private int productPrice;
	private int productStock;
	private String productContents;
	private Date regDate;
	private Date updateDate;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + ", productContents=" + productContents + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
