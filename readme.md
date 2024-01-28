# Contact List

>API de contatos, feita em java com Spring Boot e arquitetura em 3 camadas.


**camada: Cotroller**
- resposável pelos endpoints disponibilizados da API, e a configuração deles(post, get, put, delete e params)

**camada: Service**
- responsável tratar das regras de negócio

**Camada: Repository**
- responsável por conectar e realizar querys no banco de dados

# Tecnologias utilizadas
1. java
2. Spring JPA
3. Spring WEB
3. Maven
4. Banco de dados: H2 (banco de dados relacional em memória)

# Práticas adotadas
- SOLID
- API REST
- Injeção de dependências
- Arquiterua de 3 camadas

# API endpoints
>use acese http://localhost:8080/swagger-ui/index.html após fazer a build do projeto, para ter acesso a documentação web
- Criar contato

```
http POST :8080/contacts

[
  {
    "name": "nome de exemplo",
    "phone": "99 99999-9999",
  }
]
```

- Buscar o contato por ID
```
http GET :8080/contacts/{id} 

[]
```

- Atualizar contato
```
http PUT :8080/contacts/ 

[
  {
    "id": 5,
    "name": "nome exemplo ",
    "phone": "99 99999-9999"
  }
]
```

- Deletar contato
```
http DELETE :8080/contacts/{id} 

[]
```

- Listar todos os contados com mesmo nome
```
http GET :8080/contacts ? name={nome exemplo}

[]
```

- Listar todos os contatos
```
http GET :8080/contacts/all

[]
```

- Criar contatos em lote
```
http POST :8080/contacts/batch

[
  {
    "name": "nome exemplo ",
    "phone": "99 99999-9999"
  },
  {
    "name": "nome exemplo 2",
    "phone": "88 888888888"
  }
]
```

- Deletar contatos em lote
```
http DELETE :8080/contacts/delete-batch

[
    1,
    2,
    3
]
```




