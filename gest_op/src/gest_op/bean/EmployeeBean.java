package gest_op.bean;
import java.sql.Date;
import java.util.ArrayList;

public class EmployeeBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1882506608461211014L;
	private String Idemployee;
	private String name;
	private String surname;
	private String badge;
	private String FK_company;
	private Date date_ins;
	private ArrayList<EmployeeBean> companyEmployees;
	
	public String getIdemployee() {
		return Idemployee;
	}
	public void setIdemployee(String idemployee) {
		Idemployee = idemployee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	public String getFK_company() {
		return FK_company;
	}
	public void setFK_company(String fK_company) {
		FK_company = fK_company;
	}
	public Date getDate_ins() {
		return date_ins;
	}
	public void setDate_ins(Date date_ins) {
		this.date_ins = date_ins;
	}
	public ArrayList<EmployeeBean> getCompanyEmployees() {
		return companyEmployees;
	}
	public void setCompanyEmployees(ArrayList<EmployeeBean> companyEmployees) {
		this.companyEmployees = companyEmployees;
	}
}
