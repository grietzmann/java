package br.esig.com.nujava.interfaces;

import java.text.ParseException;

import br.esig.com.nujava.dominio.Conta;

/** Esta entendidade representa um contrato para operações bancárias.
 * 
 * Uma operação deve ser saque, depósito e transferência <p><br />
 */
public interface Operacoes {
	
	/** Esta função é responsável por sacar dinheiro de uma conta.
	 */
	public void sacar(Conta conta, double valor);
	
	/** Esta função é responsável por inserir dinheiro em uma conta.	
	 */
	public void depositar(Conta conta, double valor);
	
	/** Esta função é responsável por transferir dinheiro entre contas bancárias.
	 */
	public void transferir(Conta suaConta, Conta contaDestino, double valor);
	
	/** Esta função é responsável por solicitar cartões de crédito.
	 */
	public void solicitarCartao(Conta conta) throws ParseException;
	
	/** Esta função é responsável por exibir os dados bancários de uma conta.
	 */
	public void exibirDadosBancarios(Conta conta);
}
