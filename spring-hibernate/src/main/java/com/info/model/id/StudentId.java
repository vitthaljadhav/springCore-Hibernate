package com.info.model.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class StudentId  implements Serializable{

	@Column(name = "STUD_ID")
	private String studId;
	
	@Column(name = "ENROLL_ID")
	private String enrollmentId;

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(String enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enrollmentId == null) ? 0 : enrollmentId.hashCode());
		result = prime * result + ((studId == null) ? 0 : studId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentId other = (StudentId) obj;
		if (enrollmentId == null) {
			if (other.enrollmentId != null)
				return false;
		} else if (!enrollmentId.equals(other.enrollmentId))
			return false;
		if (studId == null) {
			if (other.studId != null)
				return false;
		} else if (!studId.equals(other.studId))
			return false;
		return true;
	}
	
}
