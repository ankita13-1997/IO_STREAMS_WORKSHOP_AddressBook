package com.test.AddressBook_IO;

import java.io.Serializable;
import java.util.Scanner;

import com.google.gson.annotations.Expose;


	class Book implements Serializable {
		
         @Expose
		 int id;
         @Expose
		 String fsname   = "";
         @Expose
		 String lname    = "";
         @Expose
		 String city     = "";
         @Expose
		 String state    = "";
         @Expose
		 String zip_code = "";
         @Expose
		 String phone_no = "";
		 @Expose
		 String email    = "";
		 

		public Book(int id, String fsname, String lname, String city, String state, String zip_code, String phone_no,
				String email) {
			super();
			// this.sc = sc;
			this.id = id;
			this.fsname = fsname;
			this.lname = lname;
			this.city = city;
			this.state = state;
			this.zip_code = zip_code;
			this.phone_no = phone_no;
			this.email = email;
		}

		public Book() {

		}
		

		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFsname() {
			return fsname;
		}

		public void setFsname(String fsname) {
			this.fsname = fsname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip_code() {
			return zip_code;
		}

		public void setZip_code(String zip_code) {
			this.zip_code = zip_code;
		}

		public String getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Book [ id=" + id + ", fsname=" + fsname + ", lname=" + lname + ", city=" + city + ", state=" + state
					+ ", zip_code=" + zip_code + ", phone_no=" + phone_no + ", email=" + email + "]";
		}

	}
	
	public class Pogo_Entries {
		public static void main(String[] args) 
		{
			System.out.println("yeepie");
		}
          }
