import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to Student MGMT APP");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter 1 to Add student");
			System.out.println("Enter 2 to Delete student");
			System.out.println("Enter 3 to Display student");
			System.out.println("Enter 4 to Exit");

			int ch = Integer.parseInt(br.readLine());

			if (ch == 1) {
				System.out.println("Enter name");
				String name = br.readLine();
				System.out.println("Enter phone no");
				String phone = br.readLine();
				System.out.println("Enter city");
				String city = br.readLine();
				Student student = new Student(name, phone, city);
				boolean conn=StudentDao.insertStudentToDB(student);
				if(conn)
				{
					System.out.println("Query Executed");
				}
			} else if (ch == 2) {
				System.out.println("Enter id");
				int id = Integer.parseInt(br.readLine());
				boolean conn=StudentDao.deletetStudentFromDB(id);
				if(conn)
				{
					System.out.println("Query Executed");
				}

			} else if (ch == 3) {
				StudentDao.showStudentFromDB();

			} else if (ch == 4) {
				break;
			}
		}

		System.out.println("App completed");
	}

}
