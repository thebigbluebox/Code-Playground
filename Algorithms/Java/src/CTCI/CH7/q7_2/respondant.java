package CTCI.CH7.q7_2;

import java.util.List;

public class respondant extends handler {
    List<employee> respondants;

    public respondant(List<employee> employees)
    {
        this.respondants = employees;
    }

    public employee getFreeRespondant(){
        for(employee respondant: respondants){
            if(!respondant.isBusy()){
                return respondant;
            }
        }
        return null;
    }

    @Override
    public void handleRequest(request request) {
        employee freeRespondant = getFreeRespondant();
        if(freeRespondant != null){
            System.out.println("Handled by respondant");
            freeRespondant.respond();
        } else {
            successor.handleRequest(request);
        }
    }
}
