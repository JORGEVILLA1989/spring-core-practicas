package es.practica5;

public interface Saldo {

    int consultarSaldo();

    boolean tieneSaldoSuficiente();

    void recargar(int monto);
}