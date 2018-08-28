package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * The persistent class for the OLAM_EMPLOYEE database table.
 * 
 */
@Entity
@Table(name = "OLAM_EMPLOYEE")
@NamedQuery(name = "OlamEmployee.findAll", query = "SELECT o FROM OlamEmployee o")
public class OlamEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID")
	private int empId;

	private Timestamp doj;

	@Column(name = "EMP_NAME")
	private String empName;

	private String gender;

	@Lob
	private byte[] pic;

	@Lob
	private String profile;

	@ManyToOne(fetch=FetchType.EAGER)
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public OlamEmployee() {
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Timestamp getDoj() {
		return this.doj;
	}

	public void setDoj(Timestamp doj) {
		this.doj = doj;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public byte[] getPic() {
		return this.pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "OlamEmployee [empId=" + empId + ", doj=" + doj + ", empName=" + empName + ", gender=" + gender
				+ ", pic=" + Arrays.toString(pic) + ", profile=" + profile + "]";
	}

}