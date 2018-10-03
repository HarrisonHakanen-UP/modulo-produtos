#ROTAS

[GET] Listar: http://localhost:3002/produto/listar
[POST] Cadastrar: http://localhost:3002/produto/cadastrarProduto
[DELETE] Deletar: http://localhost:3002/produto/deletar/{id do produto}
[PUT] 
Exemplo body:
 {
        "produtoId": 2,
        "nome": "teste2",
        "numeroProduto": "3",
        "nivelEstoque": 20,
        "pontoReordenar": 3,
        "custoPadrao": 800,
        "precoVenda": 800,
        "tamanhoProduto": null,
        "unidadeMedidaTamanho": null,
        "unidadeMedidaPeso": null,
        "pesoProduto": 30,
        "diasParaFabricarProduto": 20,
        "linhaDoProduto": null,
        "classe": null,
        "estilo": null,
        "dataDisponivelVenda": null,
        "dataNaoDisponivelVenda": null,
        "dataProdutoDescontinuado": null,
        "dataModificacao": null,
        "fotos": [],
        "revisaos": [],
        "produtoSubCategorias": [],
        "documentos": [],
        "modelos": [],
        "unidadeMedida": null,
        "cor": null
    }
 
