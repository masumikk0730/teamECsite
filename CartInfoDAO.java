package com.internousdev.red.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.red.dto.CartInfoDTO;
import com.internousdev.red.util.DBConnector;

public class CartInfoDAO{

	// ログイン機能 カート機能   カート情報の確認
	public List<CartInfoDTO> getCartInfoDTOList(String userId){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<CartInfoDTO> cartInfoDTOList = new ArrayList<CartInfoDTO>();

		//		設計書より（ログイン時ユーザーID、未ログイン時仮ユーザーID
		//		カート情報･･･値段、個数、金額、カート合計金額(subtotal)
		//		商品情報･･･商品名、ふりがな、画像、発売年月日、発売会社、ステータス
		String sql = "SELECT ci.id,"
				+ " ci.user_id as user_id,"
				+ " ci.product_id as product_id,"
				+ " ci.product_count as product_count,"
				+ " pi.price as price,"
				+ " ci.regist_date as regist_date,"
				+ " ci.update_date as update_date,"
				+ " pi.product_name as product_name,"
				+ " pi.product_name_kana as product_name_kana,"
				+ " pi.image_file_path as image_file_path,"
				+ " pi.image_file_name as image_file_name,"
				+ " pi.release_date as release_date,"
				+ " pi.release_company as release_company,"
				+ " pi.status as status,"
				+ " (ci.price * ci.product_count) as subtotal"
				+ " FROM cart_info as ci"
				+ " LEFT JOIN product_info as pi"
				+ " ON ci.product_id = pi.product_id"
				+ " WHERE ci.user_id = ?"
				+ " ORDER BY update_date DESC, regist_date DESC";

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartInfoDTO dto = new CartInfoDTO();
				dto.setId(rs.getInt("id"));
				dto.setUserId(rs.getString("user_id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductCount(rs.getInt("product_count"));
				dto.setPrice(rs.getInt("price"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setStatus(rs.getString("status"));
				dto.setSubTotal(rs.getInt("subtotal"));
				cartInfoDTOList.add(dto);

			}
		}catch(SQLException e){
				e.printStackTrace();

		}finally{

			try{
				connection.close();

				}catch(SQLException e){
					e.printStackTrace();
			}
		}
		return cartInfoDTOList;
	}

	// 合計金額を抽出
	public int getTotalPrice(String userId){
		int totalPrice = 0;

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		String sql = "SELECT SUM(product_count * price) as total_price "
				+"FROM cart_info WHERE user_id = ? GROUP BY user_id";

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				totalPrice = rs.getInt("total_price");
			}

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return totalPrice;
	}

	public int regist(String userId, int productId, int productCount, int price){

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();
		int count = 0;

		String sql = "INSERT INTO cart_info(user_id, product_id, product_count, price, regist_date, update_date)"
				+ "VALUES (?, ?, ?, ?, now(), now())";
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.setInt(3, productCount);
			ps.setInt(4, price);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

	// login機能 ユーザーID 商品番号 価格 の引継ぎ
	public int updateProductCount(String userId, int productId, int productCount){

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		String sql = "UPDATE cart_info SET product_count = (product_count + ?), update_date = now() WHERE user_id = ? AND product_id = ?";

		int result = 0;

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productCount);
			ps.setString(2, userId);
			ps.setInt(3, productId);

			result = ps.executeUpdate();

			connection.close();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	public int delete(String productId, String userId){

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		int count = 0;

		String sql = "DELETE FROM cart_info WHERE product_id = ? AND user_id = ?";

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, productId);
			ps.setString(2, userId);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

	public int deleteAll(String userId){

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		int count = 0;

		String sql = "DELETE FROM cart_info where user_id = ?";

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

	//login機能 ユーザーとカートの紐付け ユーザーIDと商品番号の確認
	public boolean isExistsCartInfo(String userId, int productId){

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		String sql = "SELECT COUNT(id) AS COUNT FROM cart_info WHERE user_id = ? and product_id = ?";

		boolean result = false;

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				if(rs.getInt("COUNT")>0){
					result = true;
				}
			}

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return result;
	}

	// login機能 仮ユーザーから本ユーザーへ ?
	public int linkToUserId(String tempUserId, String userId, int productId){

		DBConnector dbConnector = new DBConnector();
		Connection connection =dbConnector.getConnection();

		int count = 0;

		String sql = "UPDATE cart_info set user_id = ?, update_date = now() WHERE user_id = ? AND product_id = ?";

		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, tempUserId);
			ps.setInt(3, productId);

			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();

		}finally{

			try{
				connection.close();

			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

}
