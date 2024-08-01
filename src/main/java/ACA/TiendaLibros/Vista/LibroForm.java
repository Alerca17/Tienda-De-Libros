package ACA.TiendaLibros.Vista;

import ACA.TiendaLibros.Servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class LibroForm extends JFrame {

    LibroServicio libroServicio;
    private JPanel Ppanel;

    @Autowired
    public LibroForm(LibroServicio libroServicio) {

        this.libroServicio = libroServicio;
        iniciarVista();

    }

    private void iniciarVista() {

        setContentPane(Ppanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 600);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - getWidth() / 2);
        int y = (screenSize.height - getHeight() / 2);
        setLocation(x, y);
    }
}
