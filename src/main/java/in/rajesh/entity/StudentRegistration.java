package in.rajesh.entity;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentRegistration {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;	
	private String sname;
	private String semail;
	private String gender;
	@JdbcTypeCode(SqlTypes.JSON)
	private CourseEntity course;
	@JdbcTypeCode(SqlTypes.JSON)
	private List<TimingsEntity> time;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public CourseEntity getCourse() {
		return course;
	}
	public void setCourse(CourseEntity course) {
		this.course = course;
	}
	public List<TimingsEntity> getTime() {
		return time;
	}
	public void setTime(List<TimingsEntity> time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "StudentRegistration [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", gender=" + gender
				+ ", course=" + course + ", time=" + time + "]";
	}
	
	

}
