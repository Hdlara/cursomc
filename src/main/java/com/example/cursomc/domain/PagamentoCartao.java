package com.example.cursomc.domain;

import javax.persistence.Entity;

import com.example.cursomc.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("pagamentoCartao")
public class PagamentoCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroParecelas;
	
	public PagamentoCartao() {
		
	}

	public PagamentoCartao(Integer id, EstadoPagamento estado, Pedido pedido,Integer numeroParecelas) {
		super(id, estado, pedido);
		this.numeroParecelas = numeroParecelas;
	}

	public Integer getNumeroParecelas() {
		return numeroParecelas;
	}

	public void setNumeroParecelas(Integer numeroParecelas) {
		this.numeroParecelas = numeroParecelas;
	}
	
	
	
}
