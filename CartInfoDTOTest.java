package com.internousdev.red.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.red.dto.CartInfoDTO;

public class CartInfoDTOTest{

	@Test
	public void testGetId1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setId(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setId(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}
//	setId
	@Test
	public void testSetId1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setId(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setId(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}
//	getUserId
	@Test
	public void testGetUserId1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

//	setUserId
	@Test
	public void testSetUserId1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " 　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

//	getProductId Test
	@Test
	public void testGetProductId1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setProductId(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testGetProductId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setProductId(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	setProductId test
	@Test
	public void testSetProductId1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductId4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setProductId(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testSetProductId5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setProductId(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	getProductCount test
	@Test
	public void testGetProductCount1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductCount4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setProductCount(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testGetProductCount5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setProductCount(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	SetProductCount test
	@Test
	public void testSetProductCount1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductCount4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setProductCount(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testSetProductCount5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setProductCount(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	Get Price test
	@Test
	public void testGetPrice1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPrice4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setPrice(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setPrice(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	set Price test
	@Test
	public void testSetPrice1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPrice4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setPrice(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testSetPrice5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setPrice(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	get ProductName test
	@Test
	public void testGetProductName1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductName12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

//	set ProductName Test
	@Test
	public void testSetProductName1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductName12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

//	get ProductNameKana test
	@Test
	public void testGetProductNameKana1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetProductNameKana12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

//	set ProductNameKana test
	@Test
	public void testSetProductNameKana1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetProductNameKana12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

//	get ImageFilePath test
	@Test
	public void testGetImageFilePath1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

//	set ImageFilePath test
	@Test
	public void testSetImageFilePath1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

//	get ImageFileName test
	@Test
	public void testGetImageFileName1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFileName12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

//	set ImageFileName test
	@Test
	public void testSetImageFileName1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFileName12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

//	get ReleaseDate test
	@Test
	public void testGetReleaseDate1(){
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseDate2() throws ParseException{
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected,dto.getReleaseDate());
	}

//	set ReleaseDate test
	@Test
	public void testSetReleaseDate1(){
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseDate2() throws ParseException{
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected,dto.getReleaseDate());
	}

//	get ReleaseCompany test
	@Test
	public void testGetReleaseCompany1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetReleaseCompany12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

//	set ReleaseCompany test
	@Test
	public void testSetReleaseCompany1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetReleaseCompany12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

//	get Status test
	@Test
	public void testGetStatus1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

//	set Status test
	@Test
	public void testSetStatus1(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus2(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus3(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus4(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus5(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus6(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus7(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus8(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus9(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus10(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus11(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus12(){
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

//	get SubTotal test
	@Test
	public void testGetSubTotal1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setSubTotal(expected);
		int actual = dto.getSubTotal();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetSubTotal2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setSubTotal(expected);
		int actual = dto.getSubTotal();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetSubTotal3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setSubTotal(expected);
		int actual = dto.getSubTotal();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetSubTotal4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setSubTotal(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testGetSubTotal5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setSubTotal(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}

//	set SubTotal test
	@Test
	public void testSetSubTotal1(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setSubTotal(expected);
		int actual = dto.getSubTotal();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetSubTotal2(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setSubTotal(expected);
		int actual = dto.getSubTotal();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetSubTotal3(){
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setSubTotal(expected);
		int actual = dto.getSubTotal();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetSubTotal4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setSubTotal(postalMax);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483647\"");
		}
	}
	@Test
	public void testSetSubTotal5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483647");
			dto.setSubTotal(postalMin);
		} catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483647\"");
		}
	}
}
