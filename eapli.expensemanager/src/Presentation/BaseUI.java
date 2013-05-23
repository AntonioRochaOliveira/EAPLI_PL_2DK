package Presentation;

import Controllers.BaseController;
import Persistence.PersistenceFactory;

public abstract class BaseUI {
    
    public void show(){
        showHeader();
        showBody();
        showFooter();
    }
    
    public abstract BaseController getController();
    
    public abstract String getTitle();
    
    public void showHeader(){
        System.out.println("*****  "+getTitle()+"  ***** \n");
    }    
    public abstract void showBody();

    public void showFooter(){
        System.out.println("Saldo corrente: " + getController().getSaldo());
    }
}
