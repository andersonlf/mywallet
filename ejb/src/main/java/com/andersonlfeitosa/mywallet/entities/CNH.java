/*
 * Desenvolvido por Anderson Lobo Feitosa, 2014
 */
package com.andersonlfeitosa.mywallet.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TODO Documentar CNH
 *
 * @author andersonlf@gmail.com
 */
@Entity
@Table (name = "CNH")
public class CNH extends Document {

	private static final long serialVersionUID = 1L;

	@Column (name = "type", insertable = true, nullable = false, updatable = true)
	private String type;
	
	@Column (name = "recordNumber", insertable = true, nullable = false, updatable = true)
	private String recordNumber;

	@Column (name = "city", insertable = true, nullable = false, updatable = true)
	private String city;

	@Column (name = "uf", insertable = true, nullable = false, updatable = true)
	private String uf;
	
	@Temporal(TemporalType.DATE)
	@Column (name = "expireDate", insertable = true, nullable = false, updatable = true)
	private Date expireDate;

	@Temporal(TemporalType.DATE)
	@Column (name = "firstLicenseDate", insertable = true, nullable = false, updatable = true)
	private Date firstLicenseDate;

	@Temporal(TemporalType.DATE)
	@Column (name = "emissionDate", insertable = true, nullable = false, updatable = true)
	private Date emissionDate;

	/**
	 * Método JavaBean.
	 * @return O type.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Método JavaBean.
	 * @param type O novo type.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Método JavaBean.
	 * @return O recordNumber.
	 */
	public String getRecordNumber() {
		return recordNumber;
	}

	/**
	 * Método JavaBean.
	 * @param recordNumber O novo recordNumber.
	 */
	public void setRecordNumber(String recordNumber) {
		this.recordNumber = recordNumber;
	}

	/**
	 * Método JavaBean.
	 * @return O city.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Método JavaBean.
	 * @param city O novo city.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Método JavaBean.
	 * @return O uf.
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * Método JavaBean.
	 * @param uf O novo uf.
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * Método JavaBean.
	 * @return O expireDate.
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * Método JavaBean.
	 * @param expireDate O novo expireDate.
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * Método JavaBean.
	 * @return O firstLicenseDate.
	 */
	public Date getFirstLicenseDate() {
		return firstLicenseDate;
	}

	/**
	 * Método JavaBean.
	 * @param firstLicenseDate O novo firstLicenseDate.
	 */
	public void setFirstLicenseDate(Date firstLicenseDate) {
		this.firstLicenseDate = firstLicenseDate;
	}

	/**
	 * Método JavaBean.
	 * @return O emissionDate.
	 */
	public Date getEmissionDate() {
		return emissionDate;
	}

	/**
	 * Método JavaBean.
	 * @param emissionDate O novo emissionDate.
	 */
	public void setEmissionDate(Date emissionDate) {
		this.emissionDate = emissionDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CNH [recordNumber=" + recordNumber + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((recordNumber == null) ? 0 : recordNumber.hashCode());
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
		CNH other = (CNH) obj;
		if (recordNumber == null) {
			if (other.recordNumber != null)
				return false;
		} else if (!recordNumber.equals(other.recordNumber))
			return false;
		return true;
	}
	
}
