/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.mywallet.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.andersonlfeitosa.apoena.entity.ApoenaEntity;

/**
 * TODO Documentar User
 *
 * @author andersonlf@gmail.com
 */
@Entity
@Table (name = "User")
public class User extends ApoenaEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "idUser", insertable = false, nullable = false, updatable = false)
	private Long id;
	
	@Column (name = "email", insertable = true, nullable = false, updatable = true, unique = true)
	private String email;

	@Column (name = "name", insertable = true, nullable = true, updatable = true)
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "dateTimeInsert", insertable = true, nullable = false, updatable = true)
	private Date dateTimeInsert;

	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "dateTimeUpdate", insertable = true, nullable = false, updatable = true)
	private Date dateTimeUpdate;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
	private List<Document> documents = new ArrayList<Document>();

	/**
	 * Método JavaBean.
	 * @return O id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Método JavaBean.
	 * @param id O novo id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Método JavaBean.
	 * @return O email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método JavaBean.
	 * @param email O novo email.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método JavaBean.
	 * @return O name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Método JavaBean.
	 * @param name O novo name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método JavaBean.
	 * @return O dateTimeInsert.
	 */
	public Date getDateTimeInsert() {
		return dateTimeInsert;
	}

	/**
	 * Método JavaBean.
	 * @param dateTimeInsert O novo dateTimeInsert.
	 */
	public void setDateTimeInsert(Date dateTimeInsert) {
		this.dateTimeInsert = dateTimeInsert;
	}

	/**
	 * Método JavaBean.
	 * @return O dateTimeUpdate.
	 */
	public Date getDateTimeUpdate() {
		return dateTimeUpdate;
	}

	/**
	 * Método JavaBean.
	 * @param dateTimeUpdate O novo dateTimeUpdate.
	 */
	public void setDateTimeUpdate(Date dateTimeUpdate) {
		this.dateTimeUpdate = dateTimeUpdate;
	}

	/**
	 * Método JavaBean.
	 * @return O documents.
	 */
	public List<Document> getDocuments() {
		return documents;
	}

	/**
	 * Método JavaBean.
	 * @param documents O novo documents.
	 */
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	
}
