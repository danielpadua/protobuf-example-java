# README Localization
- [English](README.md)

# Objetivo
Este repositório é um exemplo funcional de uma aplicação console java 15 que gera um arquivo serializado com protobuf
utilizando o [contrato customer definido](src/main/proto/customer.proto) para ser lido posteriormente pela 
[aplicação csharp](https://github.com/danielpadua/protobuf-example-csharp), usado para demonstrar o protobuf no 
meu artigo no medium: [Entendendo Protobuf]().

# Pré-Requisitos
- OpenJDK 15

# Como executar
1. Clonar este projeto utilizando: `git clone https://github.com/danielpadua/protobuf-example-java`
2. Navegar até o diretório raíz: `cd protobuf-example-java`
3. Executar o comando:
```
./mvnw clean compile exec:java -o ${path}
```
ou
```
./mvnw clean compile exec:java --outputPath ${path}
```
onde: `${path}` representa o caminho do diretório onde você quer que o projeto java gere o arquivo. 
**Não** incluir o nome do arquivo, apenas o caminho completo até o diretório.

> **_NOTA:_** Se você está utilizando windows, use **`./mvnw.cmd`** ao invés de `./mvnw`
