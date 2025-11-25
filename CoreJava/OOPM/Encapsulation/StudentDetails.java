package Encapsulation;

public class StudentDetails {
	private String name;
	private int age;
	private int rollNo;
	private int pmark;
	private int cmark;
	private int mmark;

	public StudentDetails(String name, int age, int rollNo, int pmark, int cmark, int mmark) {
		setName(name);
		setAge(age);
		setRollNo(rollNo);
		setPmark(pmark);
		setCmark(cmark);
		setMmark(mmark);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 5 && age < 25) {	
			this.age = age;
		}else {
			System.out.println("Invalid Age : ");
		}
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getPmark() {
		return pmark;
	}

	public void setPmark(int pmark) {
		if(pmark >= 0 && pmark <= 100) {
			this.pmark = pmark;
		} else {
			System.out.println("Invalid Physics Marks : ");
		}
	}

	public int getCmark() {
		return cmark;
	}

	public void setCmark(int cmark) {
		if(cmark >= 0 && cmark <= 100) {
			this.cmark = cmark;
	} else {
		System.out.println("Invalid Chemistry Marks : ");
	}
	}

	public int getMmark() {
		return mmark;
	}

	public void setMmark(int mmark) {
		if(mmark >= 0 && mmark <= 100) {
			this.mmark = mmark;
		} else {
			System.out.println("Invalid Mathematics Marks : ");
		}
	}
	
	public double getPercentage() {
		return (pmark + cmark + mmark)/3;
	}
	
	public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Physics : " + pmark);
        System.out.println("Chemistry : " + cmark);
        System.out.println("Maths : " + mmark);
        System.out.println("Percentage : " + getPercentage() + "%");
        System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) {
		
		StudentDetails student[] = new StudentDetails[5];
		
		student[0] = new StudentDetails("Govind", 18, 231001, 74, 89, 88);
		student[1] = new StudentDetails("Akshat", 19, 231002, 70, 90, 98);
		student[2] = new StudentDetails("Rizwan", 17, 231003, 86, 100, 78);
		student[3] = new StudentDetails("Krishna", 20, 231004, 94, 49, 84);
		student[4] = new StudentDetails("Gopal", 25, 231005, 54, 82, 86);
		
		for(StudentDetails s : student) s.display();
		
		for(int i=0; i<student.length; i++) {
			for(int j=i+1; j<student.length; j++) {
				if(student[i].getPercentage() > student[j].getPercentage()) {
					StudentDetails temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		System.out.println("\n......................Sorting By Percentage...................");
		for(StudentDetails s : student) s.display();
	}

}
