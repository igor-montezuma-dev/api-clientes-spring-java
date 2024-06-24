# Sistema de Vendas com Spring Boot

Este projeto é um sistema de vendas desenvolvido utilizando Spring Boot, PostgreSQL, Jasper Reports e inclui uma dashboard para visualização de dados em tempo real.

## Funcionalidades

- Cadastro de clientes
- Cadastro de produtos
- Realização de vendas
- Dashboard com gráficos de vendas mensais
- Geração de relatórios utilizando Jasper Reports

## Tecnologias Utilizadas

- Java 11
- Spring Boot 2.x
- PostgreSQL
- Jasper Reports
- HTML, CSS, JavaScript (para a dashboard)

## Pré-requisitos

- JDK 11 ou superior
- PostgreSQL instalado e configurado
- Maven ou Gradle para build do projeto

## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL chamado `sistema_vendas`.
2. Confira e ajuste as configurações de acesso ao banco no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/sistema_vendas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

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
