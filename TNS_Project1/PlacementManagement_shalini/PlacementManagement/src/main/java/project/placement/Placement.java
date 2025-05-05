package project.placement;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "placement")

public class Placement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String companyName;
    private String jobTitle;
    private LocalDate placementDate;
    private Long studentId;
	
    
    //constructor

	public Placement() {
	super();
	
	}

	//parameterized constructor
	
	public Placement(Long id, String companyName, String jobTitle, LocalDate placementDate, Long studentId) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.placementDate = placementDate;
		this.studentId = studentId;
	}

	
	//getter setter method

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDate getPlacementDate() {
		return placementDate;
	}

	public void setPlacementDate(LocalDate placementDate) {
		this.placementDate = placementDate;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	
	
	
	//String representation
	@Override
	public String toString() {
		return "Placement [id=" + id + ", companyName=" + companyName + ", jobTitle=" + jobTitle + ", placementDate="
				+ placementDate + ", studentId=" + studentId + "]";
	}

	
}
