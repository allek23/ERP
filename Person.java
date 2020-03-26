package Persons;
import javax.persistence.*;

@MappedSuperclass
public abstract class Person extends Exception{

	private static final long serialVersionUID = 1L;
	String firstname;
	String lastname;
	/*String street;
	String housenumber;
	String citycode;
	String city;
	Date birthdate;
	String email;
	String telephone;
	String mobile;
	*/
	
	/*
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.street = street;
		this.housenumber = housenumber;
		this.citycode = citycode;
		this.city = city;
		this.birthdate = birthdate;
		this.email = email;
		this.telephone = telephone;
		this.mobile = mobile;
		
	}*/
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/*
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	*/
}
