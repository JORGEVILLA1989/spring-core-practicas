package es.practica5;

import javax.swing.JOptionPane;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoTarjeta {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext contexto =
                new AnnotationConfigApplicationContext(Configuracion6.class);

        Saldo tarjeta = contexto.getBean("saldoAdulto", Saldo.class);

        try {
            String textoSaldo = JOptionPane.showInputDialog("Escribe tu saldo actual");

            if (textoSaldo != null) {

                tarjeta.recargar(Integer.parseInt(textoSaldo));

                if (tarjeta.tieneSaldoSuficiente()) {
                    JOptionPane.showMessageDialog(null,
                            "Acceso permitido. Saldo: " + tarjeta.consultarSaldo());
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Acceso denegado. Saldo: " + tarjeta.consultarSaldo());

                    String textoMonto = JOptionPane.showInputDialog("¿Cuánto quieres recargar?");

                    if (textoMonto != null) {

                        tarjeta.recargar(Integer.parseInt(textoMonto));

                        if (tarjeta.tieneSaldoSuficiente()) {
                            JOptionPane.showMessageDialog(null,
                                    "Acceso permitido. Nuevo saldo: " + tarjeta.consultarSaldo());
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Acceso denegado. Nuevo saldo: " + tarjeta.consultarSaldo());
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes escribir un número válido");
        }

        contexto.close();
    }
}