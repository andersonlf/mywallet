/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.mywallet.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.andersonlfeitosa.apoena.entity.ApoenaEntity;

/**
 * TODO Documentar Document
 *
 * @author andersonlf@gmail.com
 */
@Entity
@Table(name = "Document")
@Inheritance(strategy = InheritanceType.JOINED)
public class Document extends ApoenaEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDocument", insertable = false, nullable = false, updatable = false)
	private Long id;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "idDocumentType", insertable = true, nullable = false, updatable = true)
	private DocumentType documentType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "dateTimeInsert", insertable = true, nullable = false, updatable = true)
	private Date dateTimeInsert;

	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "dateTimeUpdate", insertable = true, nullable = false, updatable = true)
	private Date dateTimeUpdate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "idUser", insertable = true, updatable = true, nullable = false)
	private User user;

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
	 * @return O documentType.
	 */
	public DocumentType getDocumentType() {
		return documentType;
	}

	/**
	 * Método JavaBean.
	 * @param documentType O novo documentType.
	 */
	public void setDocumentType(DocumentType type) {
		this.documentType = type;
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
	 * @return O user.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Método JavaBean.
	 * @param user O novo user.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Document [id=" + id + ", documentType=" + documentType + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((documentType == null) ? 0 : documentType.hashCode());
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
		Document other = (Document) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (documentType != other.documentType)
			return false;
		return true;
	}
	
}
