package org.db.soft.base.dao;

import lombok.Setter;

@Setter
public class Server {
    private UserDAO userDAO;

    public void myInit(){
        System.out.println("execute init......");
    }

    public void myDestroy(){
        System.out.println("execute DESTORY......");
        System.out.println("execute DESTORY......");
    }

    public void operation(){
        boolean b = userDAO.userLogin( "china" , "chinese" );
        if(b){
            System.out.println("login success");
        }else{
            System.out.println("login fail");
        }
    }
}
