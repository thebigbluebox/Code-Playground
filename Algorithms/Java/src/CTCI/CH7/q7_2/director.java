package CTCI.CH7.q7_2;

import java.util.List;

public class director extends handler {
    List<employee> directors;

    public director(List<employee> employees)
    {
        this.directors = employees;
    }

    public employee getFreeRespondant(){
        for(employee director: directors){
            if(!director.isBusy()){
                return director;
            }
        }
        return null;
    }

    @Override
    public void handleRequest(request request) {
        employee freeRespondant = getFreeRespondant();
        if(freeRespondant != null){
            System.out.println("Handled by director");
            freeRespondant.respond();
        } else {
            successor.handleRequest(request);
        }
    }
}
