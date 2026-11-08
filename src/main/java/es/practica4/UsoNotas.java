package es.practica4;

import javax.swing.JOptionPane;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoNotas {

        public static void main(String[] args) {

                AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion5.class);

                ServicioNotas entregaNotas = contexto.getBean(ServicioNotas.class);

                String texto = JOptionPane.showInputDialog("Nota (entre 1 y 5):");

                if (texto != null) {

                        try {
                                double nota = Double.parseDouble(texto);

                                String resultado = entregaNotas.mostrarNota(nota);

                                JOptionPane.showMessageDialog(null, resultado);

                        } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Debes escribir un número válido");
                        } catch (IllegalArgumentException e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                }

                contexto.close();
        }
}