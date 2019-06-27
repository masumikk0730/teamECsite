package com.internousdev.red.action;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.red.dao.CartInfoDAO;
import com.internousdev.red.dao.ProductInfoDAO;
import com.internousdev.red.dto.CartInfoDTO;
import com.internousdev.red.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware{

	private int productId;
	private int productCount;
	private int totalPrice;
    private List<CartInfoDTO> cartInfoDTOList;
    private Map<String, Object> session;

	public String execute(){
		// セッションタイムアウトの判定
		if(Objects.isNull(session.get("userId")) && Objects.isNull(session.get("tempUserId"))){
			return "sessionTimeout";
		}
		if(productCount <= 0 || productCount > 5){
			return ERROR;
		}

		String result = ERROR;
		String userId = null;

		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		int logined = Integer.parseInt(String.valueOf(session.get("logined")));
		if(logined == 1){
			userId = session.get("userId").toString();
		} else{
			userId = String.valueOf(session.get("tempUserId"));
		}

	    ProductInfoDAO productInfoDAO = new ProductInfoDAO();
	    ProductInfoDTO productInfoDTO = productInfoDAO.getProductInfoByProductId(productId);

//		    カートに商品を新規登録or情報更新

	    int count = 0;
//		    最初は0を代入

	    if(cartInfoDAO.isExistsCartInfo(userId, productId)){
//		    	カートの中に同じ商品のデータがあるかチェックする
	    	count = cartInfoDAO.updateProductCount(userId, productId, productCount);
	    } else{
//		    	同じ商品データが無い人はデータを追加
	    	count = cartInfoDAO.regist(userId, productId, productCount, productInfoDTO.getPrice());
	    }

	    if(count>0){
	    	cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);
	    	totalPrice = cartInfoDAO.getTotalPrice(userId);
	    	session.put("cartFlag", "cartFlag");

	    	result = "cart";
	    	result = SUCCESS;
	    }

	    return result;

	}
//    getter&setter
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
	public int getTotalPrice(){
		return this.totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}
	public List<CartInfoDTO> getCartInfoDTOList(){
		return this.cartInfoDTOList;
	}
	public void setCartInfoDTOList(List<CartInfoDTO> cartInfoDTOList){
		this.cartInfoDTOList = cartInfoDTOList;
	}
	public Map<String, Object> getSession(){
		return this.session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
