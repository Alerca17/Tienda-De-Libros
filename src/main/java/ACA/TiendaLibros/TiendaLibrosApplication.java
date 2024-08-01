package ACA.TiendaLibros;

import ACA.TiendaLibros.Vista.LibroForm;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class TiendaLibrosApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(TiendaLibrosApplication.class).headless(false).web(WebApplicationType.NONE).run(args);
        EventQueue.invokeLater(() -> {

            LibroForm libroForm = context.getBean(LibroForm.class);
            libroForm.setVisible(true);
        });
    }
}
