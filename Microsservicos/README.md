# Exercício de Cartões em microsserviços

 ## Introdução
 A startup de cartões que te pediu o monolito anterior gostou muito do que você fez e agora ela pretende levar isso para produção, porém, ela precisa de algo mais escalável então te pediu para transformar o monolito em microsserviços e adicionar algumas funcionalidades.

 ## Objetivos:
  - Transformar a aplicação em microsserviços
  - Adicionar novos endpoints
___
 ## Requisições de Fatura:

 ### GET /fatura/{cliente-id}/{cartao-id}
Exibe a fatura do cliente de um cartão

**Response 200**
```json
[
    {
        "id": 1,
        "cartao_id": 1,
        "descricao": "cerveja",
        "valor": 10.50
    },
    {
        "id": 2,
        "cartao_id": 1,
        "descricao": "cerveja",
        "valor": 10.50
    }
]
```

 ### POST /fatura/{cliente-id}/{cartao-id}/pagar
Paga a fatura de um cartão do cliente (apaga os registros do banco de dados)

**Response 200**
```json
{
    "id": 1,
    "valorPago": 21.0,
    "pagoEm": "2020-03-11",
}
```


 ### POST /fatura/{cliente-id}/{cartao-id}/expirar
Bloqueia o cartão de um cliente de fazer novas compras (Desativa o cartão)

**Response 200**
```json
{
    "status": "ok"
}
```
