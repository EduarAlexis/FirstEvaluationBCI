# FirstEvaluationBCI

Este repositorio contiene sies puntos donde se describe cada
uno de los problemas y se plantea una posible solución.

Se hace uso de lambdas, Streams, Collections, Filters, Map,
Reduce y uso de TDD con spock y lenguaje groovy para las
pruebas unitarias.

La prueba tiene un total de 100 puntos, se considera aprobada
la prueba si se obtiene un puntaje igual o superior a 70 puntos.

## Structure of the project

```
root
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
├── src
│   └── main
│       └── java
│           ├── exercise1
│           ├── exercise2
│           ├── exercise3
│           ├── exercise4
│           ├── exercise5
│               ├── models
│               └── utils
│           └── exercise6
│               ├── interfaces
│               └── utils
└── src
    └── test
        └── groovy
            ├── testExcersiceFive
            ├── testExcersiceFour
            ├── testExcersiceOne
            ├── testExcersiceSix
            ├── testExcersiceThree
            └── testExcersiceTwo
        
```

## Requirements

- Java 8, 11
- Gradle 5.5

## Run tests

For MacOS

`` ./gradlew test ``
