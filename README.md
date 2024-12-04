# Projeto: Lista de Carros com Generics em Java - EBAC 

Este projeto demonstra o uso de **Generics** em Java para criar uma lista que pode armazenar objetos de diferentes tipos de carros, utilizando herança e polimorfismo.

## 🚗 Descrição

O projeto implementa:
- Uma classe base `Carro` e duas subclasses específicas: `Sedan` e `SUV`.
- Uma lista do tipo `List<Carro>` que aceita objetos de qualquer classe derivada de `Carro`.
- Uso de herança e sobrescrita do método `toString()` para exibir informações específicas de cada tipo de carro.

## 🛠 Estrutura do Código

### Classes
1. **Carro**:
    - Classe base para representar atributos genéricos de um carro.
    - Atributos: `modelo`, `marca`.
2. **Sedan**:
    - Subclasse de `Carro`.
    - Atributo adicional: `capacidadePortaMalas`.
3. **SUV**:
    - Subclasse de `Carro`.
    - Atributo adicional: `tracao4x4`.

### Principais Recursos
- **Lista Generics**:
    - Utilizamos `List<Carro>` para armazenar diferentes tipos de carros.
- **Polimorfismo**:
    - A lista aceita qualquer objeto que seja instância de `Carro` ou suas subclasses.
- **Sobrescrita de Métodos**:
    - O método `toString()` foi sobrescrito para personalizar a exibição das informações de cada classe.

### Saída Esperada
- Carro { modelo='Gol', marca='Volkswagen' }
- Sedan { Carro { modelo='Civic', marca='Honda' }, capacidadePortaMalas=450 }
- SUV { Carro { modelo='Compass', marca='Jeep' }, tracao4x4=true }

## 📚 Conceitos Aprendidos

- Uso de **Generics** em Java.
- Aplicação de **herança** e **polimorfismo**.
- Criação e manipulação de listas (`ArrayList`) em Java.
- Sobrescrita de métodos (`toString()`).

## 🛠 Possíveis Melhorias

- Adicionar mais subclasses de `Carro` (como `Hatch` ou `Picape`).
- Implementar métodos adicionais para filtragem e manipulação dos objetos na lista.
- Salvar e carregar a lista de carros de um arquivo.



