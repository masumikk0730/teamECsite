package com.internousdev.red.action;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.red.dao.CartInfoDAO;
import com.internousdev.red.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private int totalPrice;
	private List<CartInfoDTO> cartInfoDTOList;

	public String execute(){

		// セッションタイムアウトの判定
		if(Objects.isNull(session.get("userId")) && Objects.isNull(session.get("tempUserId"))){
			return "sessionTimeout";
		}

		String userId = null;
		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		int logined = Integer.parseInt(String.valueOf(session.get("logined")));
		//ログイン状態ならユーザーIDの獲得、未ログインなら仮ユーザーIDの獲得
		if(logined == 1){
			userId = session.get("userId").toString();
		} else{
			userId = String.valueOf(session.get("tempUserId"));
		}

		//カート情報と合計金額の取得
		cartInfoDTOList = cartInfoDAO.getCartInfoDTOList(userId);
		totalPrice = cartInfoDAO.getTotalPrice(userId);

		return SUCCESS;
		}

	//	getter&setter
	public Map<String, Object> getSession(){
		return this.session;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public List<CartInfoDTO> getCartInfoDTOList(){
		return this.cartInfoDTOList;
	}
	public void setCartInfoDTOList(List<CartInfoDTO> cartInfoDTOList){
		this.cartInfoDTOList = cartInfoDTOList;
	}
	public int getTotalPrice(){
		return this.totalPrice;
	}
	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

}
