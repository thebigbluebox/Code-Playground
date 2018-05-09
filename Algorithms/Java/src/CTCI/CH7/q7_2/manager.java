package CTCI.CH7.q7_2;

import java.util.List;

public class manager extends handler{
    List<employee> manager;

    public manager(List<employee> employees)
    {
        this.manager = employees;
    }

    public employee getFreeRespondant(){
        for(employee respondant: manager){
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
            System.out.println("Handled by manager");
            freeRespondant.respond();
        } else {
            successor.handleRequest(request);
        }
    }
}
