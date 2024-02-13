package org.online;
import org.online.data.interfaces.IDB;
import org.online.data.PostgresDB;
import org.online.repesitories.interfaces.IUserRepository;
import org.online.repesitories.UserRepository;
import org.online.controllers.UserController;
import org.online.repesitories.interfaces.ICourseRepository;
import org.online.repesitories.CourseRepository;
import org.online.controllers.CourseController;
import org.online.repesitories.interfaces.IEnrollmentRepository;
import org.online.repesitories.EnrollmentRepository;
import org.online.controllers.EnrollmentController;
//main
public class Main {
    public static void main(String[] args) {

        IDB db = new PostgresDB();
        IUserRepository repo = new UserRepository(db);
        UserController controller = new UserController(repo);
        ICourseRepository repo1 = new CourseRepository(db);
        CourseController controller1 = new CourseController(repo1);
        IEnrollmentRepository repo2 = new EnrollmentRepository(db);
        EnrollmentController controller2 = new EnrollmentController(repo2);

        MyApplication app = new MyApplication(controller, controller1,controller2);
        app.start();

    }
}