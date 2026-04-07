# 🚀 JobTracker API

REST API para gerenciamento de vagas e acompanhamento de candidaturas.

---

## 📖 Sobre o projeto

O **JobTracker** é uma aplicação back-end desenvolvida para auxiliar no controle de vagas de emprego e processos seletivos.
A API permite cadastrar, atualizar, listar e gerenciar vagas, facilitando o acompanhamento da evolução de candidaturas.

Este projeto foi desenvolvido com foco em **boas práticas de mercado**, como arquitetura em camadas, validação de dados e código limpo.

---

## 🛠️ Tecnologias utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate Validator
* PostgreSQL
* Maven

---

## 🧱 Arquitetura

O projeto segue o padrão de arquitetura em camadas:

```
Controller → Service → Repository → Database
```

### 📌 Responsabilidades

* **Controller** → Recebe requisições HTTP
* **Service** → Contém regras de negócio
* **Repository** → Comunicação com o banco de dados
* **DTOs** → Transferência de dados entre camadas

---

## ⚙️ Como rodar o projeto

### 📋 Pré-requisitos

* Java 17+
* Maven
* PostgreSQL

---

### 🚀 Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/jobtracker.git

# Acesse a pasta
cd jobtracker

# Configure o banco de dados no application.properties

# Execute o projeto
./mvnw spring-boot:run
```

---

## 🔧 Configuração do banco

Exemplo no `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/jobtracker
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
```

---

## 📌 Funcionalidades

* ✅ Cadastro de vagas
* ✅ Atualização de informações
* ✅ Listagem de vagas
* ✅ Exclusão de registros
* ✅ Validação de dados com Bean Validation
* ✅ Classificação por nível profissional:

  * Júnior
  * Pleno
  * Sênior

---

## 📬 Exemplo de requisição

### Criar vaga

```json
POST /jobs

{
	"nomeEmpresa": "Technology company",
	"cargo": "Software Developer",
	"nivel": "Senior",
	"plataforma": "LINKEDIN",
	"linkVaga": "www.exemple.com",
	"dataCandidatura": "2026-04-06",
	"status": "EM_ANDAMENTO",
	"descricaoVaga": "Desenvolvedor FullSatck JAVA e ANGULAR"
}
```

---

## ⚠️ Validações

O projeto utiliza **Hibernate Validator** para garantir integridade dos dados.

Exemplo:

* `@NotNull` para enums
* `@NotBlank` para Strings
* `@Size` para limites de texto

---

## 🔐 Melhorias futuras

* Autenticação com JWT
* Paginação e filtros avançados
* Deploy em cloud (AWS / Railway / Render)
* Integração com front-end (Angular)

---

## 👨‍💻 Autor

Desenvolvido por **Breno Chiori Santos**

* LinkedIn: https://www.linkedin.com/in/breno-chiori/
* GitHub: https://https://github.com/BrenoChiori

---
