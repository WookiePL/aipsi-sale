/**
 * 
 */
package DesignBuildingBlocks.pl.polsl.aipsi.domain;

import java.util.Date;
import java.util.Set;
import DesignBuildingBlocks.pl.polsl.aipsi.control.ZgloszenieKontroler;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Administrator
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Ticket {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer id;

	/** 
	 * @return the id
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getId() {
		// begin-user-code
		return id;
		// end-user-code
	}

	/** 
	 * @param id the id to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setId(Integer id) {
		// begin-user-code
		this.id = id;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String title;

	/** 
	 * @return the title
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/** 
	 * @param title the title to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTitle(String title) {
		// begin-user-code
		this.title = title;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String description;

	/** 
	 * @return the description
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getDescription() {
		// begin-user-code
		return description;
		// end-user-code
	}

	/** 
	 * @param description the description to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDescription(String description) {
		// begin-user-code
		this.description = description;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date reportDate;

	/** 
	 * @return the reportDate
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Date getReportDate() {
		// begin-user-code
		return reportDate;
		// end-user-code
	}

	/** 
	 * @param reportDate the reportDate to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setReportDate(Date reportDate) {
		// begin-user-code
		this.reportDate = reportDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Client client;

	/** 
	 * @return the client
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Client getClient() {
		// begin-user-code
		return client;
		// end-user-code
	}

	/** 
	 * @param client the client to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setClient(Client client) {
		// begin-user-code
		this.client = client;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private java.sql.Date timeOfRealization;

	/** 
	 * @return the timeOfRealization
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public java.sql.Date getTimeOfRealization() {
		// begin-user-code
		return timeOfRealization;
		// end-user-code
	}

	/** 
	 * @param timeOfRealization the timeOfRealization to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTimeOfRealization(java.sql.Date timeOfRealization) {
		// begin-user-code
		this.timeOfRealization = timeOfRealization;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private java.sql.Date overalTime;

	/** 
	 * @return the overalTime
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public java.sql.Date getOveralTime() {
		// begin-user-code
		return overalTime;
		// end-user-code
	}

	/** 
	 * @param overalTime the overalTime to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setOveralTime(java.sql.Date overalTime) {
		// begin-user-code
		this.overalTime = overalTime;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Attachment> attachment;

	/** 
	 * @return the attachment
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Attachment> getAttachment() {
		// begin-user-code
		return attachment;
		// end-user-code
	}

	/** 
	 * @param attachment the attachment to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAttachment(Set<Attachment> attachment) {
		// begin-user-code
		this.attachment = attachment;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Comment> comment;

	/** 
	 * @return the comment
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Comment> getComment() {
		// begin-user-code
		return comment;
		// end-user-code
	}

	/** 
	 * @param comment the comment to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setComment(Set<Comment> comment) {
		// begin-user-code
		this.comment = comment;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Employee> employee;

	/** 
	 * @return the employee
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Employee> getEmployee() {
		// begin-user-code
		return employee;
		// end-user-code
	}

	/** 
	 * @param employee the employee to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEmployee(Set<Employee> employee) {
		// begin-user-code
		this.employee = employee;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Significance significance;

	/** 
	 * @return the significance
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Significance getSignificance() {
		// begin-user-code
		return significance;
		// end-user-code
	}

	/** 
	 * @param significance the significance to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSignificance(Significance significance) {
		// begin-user-code
		this.significance = significance;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Priority priority;

	/** 
	 * @return the priority
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Priority getPriority() {
		// begin-user-code
		return priority;
		// end-user-code
	}

	/** 
	 * @param priority the priority to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPriority(Priority priority) {
		// begin-user-code
		this.priority = priority;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ZgloszenieKontroler zgloszenieKontroler;

	/** 
	 * @return the zgloszenieKontroler
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ZgloszenieKontroler getZgloszenieKontroler() {
		// begin-user-code
		return zgloszenieKontroler;
		// end-user-code
	}

	/** 
	 * @param zgloszenieKontroler the zgloszenieKontroler to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setZgloszenieKontroler(ZgloszenieKontroler zgloszenieKontroler) {
		// begin-user-code
		this.zgloszenieKontroler = zgloszenieKontroler;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void NoweZgloszenie() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}