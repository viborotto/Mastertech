# Exercício de Cartões

 ## Introdução
 Uma startup está com planos de lançar seu  sistema de cartões, para isso, ela entrou em  contato com você para desenvolver um sistema MVP que permita:
 - Cadastrar um novo cliente
 - Criar um novo cartão
 - Ativar um novo cartão
 - Fazer uma compra em um cartão
 - Consultar a fatura de um cartão
 
 Obs: Por ser apenas um MVP, esse sistema não irá  a público então não há necessidade de um  sistema  de autenticação

 ## Regras de negocio:
 - Não deve ser possivel fazer uma compra em um cartão que não existe
 - Não deve ser possivel criar um cartão de um cliente que não exite
 - Não deve ser possivel fazer uma compra em um cartão que não está ativo

___
 ## Requisições de Cliente:

 ### POST /cliente
Cria um cliente no sistema.

**Request Body**
```json
{
    "name": "Nicollas Gabriel"
}
```

**Response 201**
```json
{
    "id": 1,
    "name": "Nicollas Gabriel"
}
```

 ### GET /cliente/{id}
Exibe um cliente do sistema

**Response 200**
```json
{
    "id": 1,
    "name": "Nicollas Gabriel"
}
```

 ## Requisições de cartão:

 ### POST /cartao
Cria um cartão no sistema.

**Request Body**
```json
{
    "numero": "012730871",
    "clienteId": 1
}
```

**Response 201**
```json
{
    "id": 1,
    "numero": "012730871",
    "clienteId": 1,
    "ativo": false
}
```

 ### PATCH /cartao/{numero}
Ativa/Desativa um cartão do sistema.

**Request Body**
```json
{
    "ativo": true
}
```

**Response 200**
```json
{
    "id": 1,
    "numero": "012730871",
    "clienteId": 1,
    "ativo": true
}
```

 ### GET /cartao/{numero}
Exibe um cartão do sistema

**Response 200**
```json
{
    "id": 1,
    "numero": "012730871",
    "clienteId": 1
}
```

 ## Requisições de pagamento:

 ### POST /pagamento
Cria um pagamento no sistema.

**Request Body**
```json
{
    "cartao_id": 1,
    "descricao": "cerveja",
    "valor": 10.5 
}
```

**Response 201**
```json
{
    "id": 1,
    "cartao_id": 1,
    "descricao": "cerveja",
    "valor": 10.5 
}
```

 ### GET /pagamentos/{id_cartao}
Exibe os pagamentos de um Cartão (extrato)

**Response 200**
```json
[
    {
        "id": 1,
        "cartao_id": 1,
        "descricao": "pizza",
        "valor": 20.5 
    },
    {
        "id": 2,
        "cartao_id": 1,
        "descricao": "cerveja",
        "valor": 10.5 
    }
]
```
