
import java.util.Scanner;

public class Admin {
    private String Worker;

    public Visitor(Worker worker) {
        this.worker = worker;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String Worker) {
        if ((worker == "Врач") && (worker == "Главный врач") && (worker == "Администратор")) {
            System.out.println("Введите Ваш логин");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваш логин");
        String login = in.toString();
        if (login == "Врач") {
            System.out.println("Вы возшли как врач");
        }
        if (login == "Главный врач") {
            System.out.println("Вы возшли как главный врач");
        }
        if (login == "Администратор") {
            System.out.println("Вы возшли как алминистранор");
        }
        if (login == "Администратор") {
            System.out.println("Вы возшли как алминистранор");

        } this.Worker = Worker;}
    }

