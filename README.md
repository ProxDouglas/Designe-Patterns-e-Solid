# Designe-Patterns-e-Solid

## SOLID: Principios

Exemplos mo github https://github.com/ProxDouglas/Designe-Patterns-e-Solid

https://en.wikipedia.org/wiki/SOLID

Single Responsability principle, Open cloesed principle, Liskov sSubstitution Principal, Intarface Segregation principal, Dependency inversion principal

#### Single Responsability principle

​	"uma [classe](https://pt.wikipedia.org/wiki/Classe_(programação)) deve ter apenas uma única responsabilidade (mudanças em apenas uma parte da especificação do software, devem ser capaz de afetar a especificação da classe)."

​	A ideia é a classe não possuir muitas funções, ou seja ela tenha uma única responsabilidade.

```java
public class Main {
    public static void main(String[] args) {

        ...
    }
    
    public void notificarClient(){	
        ...
	}
    
    public void enviarClient(){	
        ...
	}
    
    public void crarClient(){	
        ...
	}
    
    public void atualizarClient(){	
        ...
	}
    
    public void deletarClient(){	
        ...
	}
}
```

​	Como podemos ver a classe main possui muitas funções e para alterar isso seria interessante existir uma classe para cada funcionalidade melhorando assim a manutenção do código e redução de bugs.

```java
package utility;

public class Notify {
        public void notifyClient(){

        }
}

```



#### Open cloesed principle

​	"entidades de software devem ser abertas para extensão, mas fechadas para modificação."

​		Uma determinada classe pode ser estendida para outras classes, mas ela tem que ser fechada para modificação, algo feito no Designe Patterns de  Stratagy. 
​	Um exemplo de algo que vai contra esse principio é quando usamos herança e fazemos uma modificação na classe pai irá impactar nas classes filhas.

```java
public class Main {
    private static TypeVehicle typeVehicle;
    
    public static void main(String[] args) {
		typeVehicle = TypeVehicle.CAR;
        
        if(typeVehicle == TypeVehicle.CAR){
            Vehicle vehicleHeranca = new Vehicle("Amarelo", "2021", 2.0, 4);
		} else if(typeVehicle == TypeVehicle.MOTOCYCLE) {
            Vehicle vehicleHeranca = new Vehicle("", "2022", 250, 1);   
        }
        
    }
}
```



```java
public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;
    
    public Vehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }
    
    void car(){
        System.out.println("Criando um carro: " + color + " " + engine + " " + " com " + seats + " assentos");
        startVehicle();
    }

    void car(){
        System.out.println("Criando um moto: " + color + " " + engine + " cilindradas");
        startVehicle();
    }
    
    void startVehicle(){
        System.out.println("Ligando os motores");
    }
}
```

```java
public enum TypeVehicle {
	CAR,
	MOTOCYCLE
}
```

​	Como podemos ver o programa funciona, mas inflige vários princípios.

#### Liskov sSubstitution Principal

​	"objetos em um programa devem ser substituíveis por instâncias de seus subtipos, sem alterar a funcionalidade do programa." deve ser capaz de afetar apenas a especificação da classe
​	Em resumo quando uma funcionalidade do sistema é retirado ou adicionado ao software ele não pode fazer o software parar de funcionar.

#### Intarface Segregation principal

​	"muitas interfaces de clientes específicas, são melhores do que uma para todos propósitos."

​	Quando uma interface está com muitas fuções e por conta disso causa methodos vazios em classes que implementam a interface em questão, isso pode ser um problema futuro como no código a seguir 

```java
public interface IVhicle {
    public void configureCar(String color, String year, double engine, int seats);
    public void configureMotocycle(String color, String year, double engine);
    public void startVehicle();
}
```

​	

```java
package br.com.hcode.solid.isp;

public class Car implements IVhicle, IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats){

        configureCar(color, year, engine, seats);
    }
    @Override
    public void configureMotocycle(String color, String year, double engine){}

    @Override
    public void configureCar(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro: " + color + " " + engine + " " + " com " + seats + " assentos");
        startVehicle();
    }

    @Override
    public void startVehicle(){
        System.out.println("Ligando os motores");
    }


}

```

​	A solução para isso é dividir a interface em mais interfaces já que uma classe pode implementar diversas classes. (Exemplo em código)

#### Dependency inversion principal

​	"deve-se depender de abstrações, não de objetos concretos."

​	Um modulo de alto nível não pode depender de um modulo de baixo nível. Ambos dependem de abstrações. Abstrações não devem depender de detalhes.
​	O modulo de alto nível é onde fica a regra de negócio, seria o que deve ser feito no produto e o de baixo nível é como eu devo fazer. Ex: O produto utiliza um banco de dados então o produto é alto nível e o banco de dados é baixo nível.

##### Problema

```java
import payment.Payment;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");
    }
}
```

```java
package model;

public class MySQLProduct {
    public String getProductById(String productID){
        return "Mysql: exibindo dados do produto " + productID;
    }
}

```

```java
package payment;

import model.MySQLProduct;

public class Payment {
    public void pay(String productID){
        MySQLProduct dbProduct = new MySQLProduct();
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}

```

##### Solução em código 

## Designe Patterns 

https://refactoring.guru/

Christopher Alexander

* A Pattern Language(08/1977)

### GOF  - Gang of Four

**Autores** 

Erich Gamma
Richard Helm 
Ralph Johson
John Vlissides

* Designe Patterns 



### Criacional 

#### Factory Method

[Factory Method (refactoring.guru)](https://refactoring.guru/pt-br/design-patterns/factory-method)

​	Nós delegamos a instância de classes para a subclasses, ou seja não é a classe principal que cria a instância. 
​	Neste padrão você deve substituir as chamadas diretas de construção de objetos da classe para um método intermediário que fará o papel de fábrica, este método fabrica ou factory method, irá controlar como criar os objetos que estendem a sua classe serão instânciados.
​	Os objetos retornados pelo método fabrica são chamadas de produtos ou classes Concretas.
​	Assim temos em nosso cenário a classe Veículo que implementa a interface Transporte e as subclasses concretas carros, motos, bicicletas que herdam de veículo e implementar os métodos declarados na interface.
​	A limitação fica por conta das subclasses . Caso estas retornem valores diferentes, precisam compartilhar a mesma classe ou interface base deve ter a interface como o seu tipo de retorno.

![Captura de tela 2024-01-12 141318](C:\Users\dsantos\Desktop\Estudos\Designe-Patterns-e-Solid\images\Captura de tela 2024-01-12 141318.png)



#### Abstract Factory

[Abstract Factory (refactoring.guru)](https://refactoring.guru/pt-br/design-patterns/abstract-factory)

![image-20240115102753903](C:\Users\dsantos\Desktop\Estudos\Designe-Patterns-e-Solid\images\image-20240115102753903.png)



#### Builder 

https://refactoring.guru/pt-br/design-patterns/builder

### https://refactoring.guru/images/patterns/diagrams/builder/structure.png



#### Prototype 

https://refactoring.guru/design-patterns/prototype

O prototype é basicamente criar uma classe com um constructor que recebe um objeto do mesmo tipo da classe ou um objeto de um tipo relacionado para clonar o Objeto original.



### Estrutural

#### Adapter 

https://refactoring.guru/design-patterns/adapter
