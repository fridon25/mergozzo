package gest_op.bean;
import java.sql.Date;

public class CompanyBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3802515851242859899L;
	
	private String idcompany;
	private String company_name;
	private String phone;
	private String email;
	private Date date_ins;
	public String getIdcompany() {
		return idcompany;
	}
	public void setIdcompany(String idcompany) {
		this.idcompany = idcompany;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate_ins() {
		return date_ins;
	}
	public void setDate_ins(Date date_ins) {
		this.date_ins = date_ins;
	}

}
