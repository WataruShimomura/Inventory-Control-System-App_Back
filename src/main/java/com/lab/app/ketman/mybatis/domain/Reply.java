package com.lab.app.ketman.mybatis.domain;

public class Reply {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column reply.id
	 * @mbg.generated  Tue Oct 22 22:40:48 JST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column reply.name
	 * @mbg.generated  Tue Oct 22 22:40:48 JST 2019
	 */
	private String name;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column reply.id
	 * @return  the value of reply.id
	 * @mbg.generated  Tue Oct 22 22:40:48 JST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column reply.id
	 * @param id  the value for reply.id
	 * @mbg.generated  Tue Oct 22 22:40:48 JST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column reply.name
	 * @return  the value of reply.name
	 * @mbg.generated  Tue Oct 22 22:40:48 JST 2019
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column reply.name
	 * @param name  the value for reply.name
	 * @mbg.generated  Tue Oct 22 22:40:48 JST 2019
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}