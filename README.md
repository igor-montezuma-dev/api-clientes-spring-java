# Sistema Help Desk com Spring Boot

Este é um projeto de API RESTful desenvolvido com Spring Boot para um sistema de vendas, que inclui funcionalidades de cadastro de clientes e realização de serviços.

## Funcionalidades Principais

- Cadastro de Clientes: Permite o cadastro, atualização, remoção e consulta de clientes.
- Realização de Serviços: Funcionalidade para realizar serviços para os clientes cadastrados.
- Segurança de Rotas: Utilização de autenticação JWT para proteger as rotas da API.
- Restrição de Acesso: Controle de acesso baseado em papéis (roles) para diferentes tipos de usuário.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Spring Security (JWT)
- Maven

## Pré-requisitos

- JDK 11 ou superior
- PostgreSQL (com banco de dados criado)

## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL com o nome `sistema_vendas`.
2. Configure as credenciais de acesso ao banco de dados no arquivo `application.properties`.

Exemplo de `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/sistema_vendas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
````

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/sua-feature`)
3. Commite suas alterações (`git commit -m 'Adiciona sua feature'`)
4. Faça um push para a branch (`git push origin feature/sua-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito por [Igor Montezuma](https://github.com/igor-montezuma-dev)
