package com.cxs.extension.sys.dto;

import java.io.Serializable;
/**
 * 
 * @Description: 字典项数据对象
 * @ClassName: DictItemDto
 * @author: ryan.guo   
 * @email: chinazan@qq.com
 * @date: 2017年06月12日
 */
public class DictItemDto implements Serializable{
	private static final long serialVersionUID = 1L;
	/**id*/
	private String id;
	/**字典类型编码*/
	private String typeCode;
	/**字典类型名称*/
	private String typeName;
	/**字典项编码*/
	private String itemCode;
	/**字典项值*/
	private String itemValue;
	/**字典项名称*/
	private String itemName;
	/**状态:0-不可用;1-可用*/
	private String state;
	/**排序*/
	private Long scort;
	/**备注*/
	private String itemDes;
	/**创建时间*/
	private Long createTime;
	/**更新时间*/
	private Long updateTime;
	
	
	/**
	 *方法: 取得id
	 *@return: String  id
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: String  id
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得字典类型编码
	 *@return: String  字典类型编码
	 */
	public String getTypeCode(){
		return this.typeCode;
	}

	/**
	 *方法: 设置字典类型编码
	 *@param: String  字典类型编码
	 */
	public void setTypeCode(String typeCode){
		this.typeCode = typeCode;
	}
	
	/**
	 *方法: 取得字典类型名称
	 *@return: String  字典类型名称
	 */
	public String getTypeName(){
		return this.typeName;
	}

	/**
	 *方法: 设置字典类型名称
	 *@param: String  字典类型名称
	 */
	public void setTypeName(String typeName){
		this.typeName = typeName;
	}
	
	/**
	 *方法: 取得字典项编码
	 *@return: String  字典项编码
	 */
	public String getItemCode(){
		return this.itemCode;
	}

	/**
	 *方法: 设置字典项编码
	 *@param: String  字典项编码
	 */
	public void setItemCode(String itemCode){
		this.itemCode = itemCode;
	}
	
	/**
	 *方法: 取得字典项值
	 *@return: String  字典项值
	 */
	public String getItemValue(){
		return this.itemValue;
	}

	/**
	 *方法: 设置字典项值
	 *@param: String  字典项值
	 */
	public void setItemValue(String itemValue){
		this.itemValue = itemValue;
	}
	
	/**
	 *方法: 取得字典项名称
	 *@return: String  字典项名称
	 */
	public String getItemName(){
		return this.itemName;
	}

	/**
	 *方法: 设置字典项名称
	 *@param: String  字典项名称
	 */
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	/**
	 *方法: 取得状态:0-不可用;1-可用
	 *@return: String  状态:0-不可用;1-可用
	 */
	public String getState(){
		return this.state;
	}

	/**
	 *方法: 设置状态:0-不可用;1-可用
	 *@param: String  状态:0-不可用;1-可用
	 */
	public void setState(String state){
		this.state = state;
	}
	
	/**
	 *方法: 取得排序
	 *@return: Long  排序
	 */
	public Long getScort(){
		return this.scort;
	}

	/**
	 *方法: 设置排序
	 *@param: Long  排序
	 */
	public void setScort(Long scort){
		this.scort = scort;
	}
	
	/**
	 *方法: 取得备注
	 *@return: String  备注
	 */
	public String getItemDes(){
		return this.itemDes;
	}

	/**
	 *方法: 设置备注
	 *@param: String  备注
	 */
	public void setItemDes(String itemDes){
		this.itemDes = itemDes;
	}
	
	/**
	 *方法: 取得创建时间
	 *@return: Long  创建时间
	 */
	public Long getCreateTime(){
		return this.createTime;
	}

	/**
	 *方法: 设置创建时间
	 *@param: Long  创建时间
	 */
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}
	
	/**
	 *方法: 取得更新时间
	 *@return: Long  更新时间
	 */
	public Long getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置更新时间
	 *@param: Long  更新时间
	 */
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}
}
