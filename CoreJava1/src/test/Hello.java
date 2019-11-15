package test;

public class Hello {
	public String stdName;
	public Integer stdNo;

	public Hello(String stdName, Integer stdNo) {
		super();
		this.stdName = stdName;
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Integer getStdNo() {
		return stdNo;
	}

	public void setStdNo(Integer stdNo) {
		this.stdNo = stdNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
		result = prime * result + ((stdNo == null) ? 0 : stdNo.hashCode());
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
		Hello other = (Hello) obj;
		if (stdName == null) {
			if (other.stdName != null)
				return false;
		} else if (!stdName.equals(other.stdName))
			return false;
		if (stdNo == null) {
			if (other.stdNo != null)
				return false;
		} else if (!stdNo.equals(other.stdNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hello [stdName=" + stdName + ", stdNo=" + stdNo + "]";
	}

}
