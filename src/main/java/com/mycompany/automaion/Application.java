package com.mycompany.automaion;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Asu
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame spyGUI = new MainFrame();
                spyGUI.setVisible(true);
            }
        });
    }
}
