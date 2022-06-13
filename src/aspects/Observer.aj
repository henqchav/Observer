package aspects;

import javafx.scene.layout.StackPane;

public aspect Observer {
	pointcut yellowChange(): call (* *Yellow(..));
	pointcut blueChange(): call (* *Blue(..));
	pointcut redChange(): call (* *Red(..));
	pointcut contador1(): execution (* sumcol1());
	pointcut contador2(): execution (* sumcol2());
	pointcut contador3(): execution (* sumcol3());
	
	after(): yellowChange(){
		Object[] parameterList = thisJoinPoint.getArgs();
		StackPane root = (StackPane) parameterList[0];
		root.setStyle("-fx-background-color: yellow");
		System.out.println("La pantalla cambio a color amarillo");
	}
	after(): blueChange(){
		Object[] parameterList = thisJoinPoint.getArgs();
		StackPane root = (StackPane) parameterList[0];
		root.setStyle("-fx-background-color: blue");
		System.out.println("La pantalla cambio a color azul");
	}
	after(): redChange(){
		Object[] parameterList = thisJoinPoint.getArgs();
		StackPane root = (StackPane) parameterList[0];
		root.setStyle("-fx-background-color: red");
		System.out.println("La pantalla cambio a color rojo");
	}
	after(): contador1() || contador2() || contador3() {
		System.out.println("El contador de colores aumento en 1");
	}
	
}
