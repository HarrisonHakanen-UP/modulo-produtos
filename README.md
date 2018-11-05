# modulo-produtos

## Rotas

- [GET]    Listar:    http://localhost:8094/produto/listar
- [POST]   Cadastrar: http://localhost:8094/produto/cadastrarProduto
- [DELETE] Deletar:   http://localhost:8094/produto/deletar/{id_do_produto}
- [PUT]    Alterar:   http://localhost:8094/produto/listar

### JSON de produto
```
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
