package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Clg1")
public class Clg {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="S_No")
	private Long s_no;
	
	@Column(name="College_Name")
	private String college_Name;
	
	@Column(name="NIRF")
	private int nIRF;
	
	@Column(name="user_rating")
	private int user_rating;
	
	@Column(name="AICETE Approved")
	private String aICETE_Approved;
	
	@Column(name="place")
	private String location;
	
	@Column(name="Outlook_Rating")
	private int outlook_Rating;

	public Long getS_no() {
		return s_no;
	}

	public void setS_no(Long s_no) {
		this.s_no = s_no;
	}

	public String getCollege_Name() {
		return college_Name;
	}

	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}

	public int getnIRF() {
		return nIRF;
	}

	public void setnIRF(int nIRF) {
		this.nIRF = nIRF;
	}

	public int getUser_rating() {
		return user_rating;
	}

	public void setUser_rating(int user_rating) {
		this.user_rating = user_rating;
	}

	public String getaICETE_Approved() {
		return aICETE_Approved;
	}

	public void setaICETE_Approved(String aICETE_Approved) {
		this.aICETE_Approved = aICETE_Approved;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getOutlook_Rating() {
		return outlook_Rating;
	}

	public void setOutlook_Rating(int outlook_Rating) {
		this.outlook_Rating = outlook_Rating;
	}

	public Clg(Long s_no, String college_Name, int nIRF, int user_rating, String aICETE_Approved, String location,
			int outlook_Rating) {
		super();
		this.s_no = s_no;
		this.college_Name = college_Name;
		this.nIRF = nIRF;
		this.user_rating = user_rating;
		this.aICETE_Approved = aICETE_Approved;
		this.location = location;
		this.outlook_Rating = outlook_Rating;
	}
	
	public Clg() {
		
	}
}