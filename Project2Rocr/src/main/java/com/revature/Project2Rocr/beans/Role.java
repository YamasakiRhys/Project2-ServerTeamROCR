package com.revature.Project2Rocr.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Role implements Serializable{

	@Id
	@Column(name="ROLE_ID")
	private int roleId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@OneToMany(mappedBy="role", fetch=FetchType.LAZY)
	private Set<Account> acc = new HashSet<Account>();
	
	public Role() {}

	public Role(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
	
}
