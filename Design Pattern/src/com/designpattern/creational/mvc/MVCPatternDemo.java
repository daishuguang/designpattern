package com.designpattern.creational.mvc;

public class MVCPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �����ݿɻ�ȡѧ����¼
		Student model = retrieveStudentFromDatabase();
		// ����һ����ͼ:��ѧ����ϸ��Ϣ���������̨
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();
		// ����ģ������
		controller.setStudentName("John");
		controller.updateView();
	}

	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
