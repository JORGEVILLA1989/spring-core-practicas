package es.practica5;

public  abstract class SaldoBase implements Saldo {
	
	protected int saldo;

    public abstract int getTarifa();

	@Override
	public int consultarSaldo() {
		
		return saldo;
	}

	@Override
	public boolean tieneSaldoSuficiente() {
	    if (saldo < getTarifa()) {
	        return false;
	    } else {
	        return true;
	    }
	}

	@Override
	public void recargar(int monto) {
	    saldo = saldo + monto;
	}

}
