package org.db.soft.base;

import org.db.soft.base.dao.AdminServer;
import org.db.soft.base.dao.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp {

    public static void main(String[] args) {
        AbstractApplicationContext app = new ClassPathXmlApplicationContext("configuration.xml");

        Server server = app.getBean( "server" , Server.class );
        server.operation();
        // 手动停止Spring引擎
        app.registerShutdownHook();

    }
}
