# Contact List

>API de contatos, feita em java com spring boot e arquiterua de 3 camdas


### camada: Cotroller
resposável pelos end points disponibilizados pela API, e a configuração deles(post, get, put, delete e params)

### camada: Service
responsável tratar das regras de negócio

### Camada: Repository
responsável por conectar e realizar querys no bancoa de dados

## Tecnologias utilizadas
1. java
2. Spring JPA
3. Spring WEB
3. maven
4. banco de dados: H2 (banco de dados relacional em memória)

## práticas adotadas
- SOLID
- API REST
- Injeção de dependências


### API endpoints

- criar contato

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

- atualizar contato
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

- Deletar Contato
```
http DELETE :8080/contacts/{id} 

[]
```

- Listar todos os contados com mesmo nome
```
http GET :8080/contacts ? name={nome exemplo}

[]
```


