package br.com.alura.rh;

public class DataException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataException(String mensagem) {
		super(mensagem);
	}

}
