package StudentDemo;

public class Student implements Comparable<Student>{
	private int stuId;
	private String name;
	private String city;
	private String subject;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getStuId() {
		return stuId;
	}


	public void setStuId(int stuId) {
		this.stuId = stuId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public Student(int stuId, String name, String city, String subject) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.city = city;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", city=" + city + ", subject=" + subject + "]";
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getCity().compareTo(o.getCity());
	}
	
	
}
