package OOPM.Inheritance;

public class A_TestPerson {
	public static void main(String[] args) {
		A_Student st = new A_Student();
		A_Businessman bs = new A_Businessman();
		A_Teacher t = new A_Teacher();

		st.setName("Govind");
		st.setAge(19);
		st.setMobile("7067624564");
		st.setAdd("Rajgarh");
		st.setRollNo("0863CS231062");
		st.setCourse("B.tech");

		bs.setName("Mukesh Ambani");
		bs.setAge(75);
		bs.setMobile("0000000000");
		bs.setAdd("Mumbai");
		bs.setWealth("$105 billion");

		t.setName("Vidhyut sir");
		t.setAge(32);
		t.setMobile("1234567890");
		t.setAdd("Indore");
		t.setProfession("Teaching");
		t.setId(101);

		System.out.println("Student Details are...........................");
		System.out.println(st.getName() + "   " + st.getAge() + "   " + st.getMobile() + "   " + st.getRollNo() + "   "
				+ st.getCourse() + "   " + st.getAdd());

		System.out.println("Businessman Details are...........................");
		System.out.println(bs.getName() + "   " + bs.getAge() + "   " + bs.getMobile() + "   " + bs.getAdd() + "   "
				+ bs.getWealth());

		System.out.println("Student Details are...........................");
		System.out.println(t.getName() + "   " + t.getAge() + "   " + t.getMobile() + "   " + t.getId() + "   "
				+ t.getProfession());
	}

}
