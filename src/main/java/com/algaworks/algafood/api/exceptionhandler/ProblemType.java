package com.algaworks.algafood.api.exceptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {

	MENSAGEM_INCOMPREENSIVEL("/mensagem-incompreensivel", "Mensagem incompreensível"),
	
	ENTIDADE_NAO_ENCONTRADA("/entidade-nao-encontrada", "Entidade não encontrada"),
	
	ENTIDADE_EM_USO("/entidade-em-uso", "Entidade em uso"),
	
	ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
	
	PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido");
	
	private String title;
	private String uri;
	
	ProblemType(String path, String title) {
		this.uri = "https://algafood.com.br" + path;
		this.title = title;
	}
	
}
