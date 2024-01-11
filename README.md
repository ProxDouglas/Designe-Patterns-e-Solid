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

#### Dependency inversion principal

​	"deve-se depender de abstrações, não de objetos concretos."

