package CTCI.CH7.q7_2;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        List<employee> directors = new ArrayList<>();
        List<employee> managers = new ArrayList<>();
        List<employee> respondants = new ArrayList<>();

        employee John = new employee(false);
        employee Joe = new employee(false);
        employee Rock = new employee(true);

        directors.add(John);
        managers.add(Joe);
        respondants.add(Rock);

        director Director = new director(directors);
        manager Manager = new manager(managers);
        respondant Respondant = new respondant(respondants);

        Respondant.setSuccessor(Manager);
        Manager.setSuccessor(Director);

        request Call = new request(true);

        Respondant.handleRequest(Call);
    }

}
