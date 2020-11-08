package com.example.postgresdemo.model;


public class Department {
    
 	private Long deptId;
	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getNameDpdt() {
		return nameDpdt;
	}

	public void setNameDpdt(String nameDpdt) {
		this.nameDpdt = nameDpdt;
	}

	private String nameDpdt;

	public Department(){

	}

	public void finalize() throws Throwable {

	}

}
