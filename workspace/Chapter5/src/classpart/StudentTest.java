package classpart;

public class StudentTest {

	public static void main(String[] args) {

		int i = 10;
		Student studentLee = new Student(100,"�̼���");
		studentLee.address = "����� �������� ���ܵ���";

		Student studentKim = new Student(101, "������");
		studentKim.address = "�̱� ��ȣ��";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();

	}

}