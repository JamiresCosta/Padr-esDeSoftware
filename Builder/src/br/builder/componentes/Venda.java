package br.builder.componentes;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private int codVenda;
	private Cliente cliente;
	private Vendedor vendedor;
	
	private double valorTotal=0;
	
	public ArrayList<Produto> getListProdutos() {
		return produtos;
	}
	public void getProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto.getNome()+ " - "+produto.getValor());
		}
	}
	public void setProdutos(Produto produto) {
		this.produtos.add(produto);
		this.valorTotal+=produto.getValor();
	}
	public int getCodVenda() {
		return codVenda;
	}
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public double getValorTotal() {
		return valorTotal;
	}

	public void imprimirComprovante() {
		System.out.println("******Comprovante de Venda ********");
		System.out.println("CodVenda:"+this.getCodVenda());
		System.out.println("Cliente:"+ this.getCliente().getNome());
		System.out.println("Vendedor:" + this.getVendedor().getNome());
		System.out.println("Produtos:\n");
		this.getProdutos();
		System.out.println("Valor Total: "+ this.getValorTotal());
		
		
		
	}
	
	
	

}
