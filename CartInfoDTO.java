package com.internousdev.red.dto;

import java.util.Date;

public class CartInfoDTO{

	private int id;
	private String userId;
	private int productId;
	private int productCount;
	private int price;

	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private Date releaseDate;
	private String releaseCompany;
	private String status;
	private int subTotal;

	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getUserId(){
		return this.userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public int getProductId(){
		return this.productId;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}
	public int getProductCount(){
		return this.productCount;
	}
	public void setProductCount(int productCount){
		this.productCount = productCount;
	}
	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getProductName(){
		return this.productName;
	}
	public void setProductName(String productName){
		this.productName = productName;
	}
	public String getProductNameKana(){
		return this.productNameKana;
	}
	public void setProductNameKana(String productNameKana){
		this.productNameKana = productNameKana;
	}
	public String getImageFilePath(){
		return this.imageFilePath;
	}
	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName(){
		return this.imageFileName;
	}
	public void setImageFileName(String imageFileName){
		this.imageFileName = imageFileName;
	}
	public Date getReleaseDate(){
		return this.releaseDate;
	}
	public void setReleaseDate(Date releaseDate){
		this.releaseDate = releaseDate;
	}
	public String getReleaseCompany(){
		return this.releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany){
		this.releaseCompany = releaseCompany;
	}
	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
	public int getSubTotal(){
		return this.subTotal;
	}
	public void setSubTotal(int subTotal){
		this.subTotal = subTotal;
	}

}
