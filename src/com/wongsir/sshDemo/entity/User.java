package com.wongsir.sshDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
* @Description:User实体类 
* @author hjd
* @date 2017年2月24日 上午9:17:13 
*  
*/
@Entity
@Table(name="ssh_user")
public class User {
	@Id //必须。@Id定义了映射到数据库表的主键的属性，一个实体只能有一个属性被映射为主键。
	//UUID主键生成策略
//	@GeneratedValue(generator="system-uuid")  //generator:表示主键生成器的名称
//	@GenericGenerator(name="system-uuid",strategy="uuid") //strategy:表示主键生成策略
	@GeneratedValue(strategy = GenerationType.AUTO)
//	private String id;
	private int id;
	
	/**
	 * 可选
		@Column描述了数据库表中该字段的详细定义,这对于根据JPA注解生成数据库表结构的工具非常有作用.
		name:表示数据库表中该字段的名称,默认情形属性名称一致
		nullable:表示该字段是否允许为null,默认为true
		unique:表示该字段是否是唯一标识,默认为false
		length:表示该字段的大小,仅对String类型的字段有效
	 */
	@Column(name="userName",length=32)
	private String userName;
	@Column(name="age")
	private String age;

	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
