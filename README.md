# Unq-po2-TpFinal

### Mockito y Java 📌

* Se utilizo para los test Junit 5 y el Java utilizado es JavaSE-17
* Para mockito se utilizaron los siguientes jar: https://github.com/MatiasGiraudo/unqui-po2-giraudo/tree/main/mockito

# Tablero de tareas

https://trello.com/b/jOS5yZQJ/cienciaparticipativa

## Patrones de diseño

### State 📌

Para los estados en los que puede estar un desafio del usuario utilizamos el patron State. Los roles que
representan son:

```
* Context:   DesafioUsuario 
* State:   IEstadoDesafio  
* ConcreteState: EstadioSinIniciar, EstadoAceptado y EstadoCompletado

```


### Strategy 📌

Para las recomendaciones de desafios que se le puede dar a un Usuario utilizamos el patron Strategy, este patron nos va
a permitir recomendarles desafios a nuestros Usuarios, se encuentran dos formas de recomendacion RecomendadorPorPreferencia o
RecomendadorPorFavorito. Los roles que representan son:

```
* Context:  Usuario
* Strategy:   Recomendador  
* ConcreteStrategy: RecomendadorPorCoincidencia y RecomendadorPorFavorito

```

### Composite 📌

Primero utilizamos el patron Composite para la parte de busqueda de proyectos. Lo usamos en esta parte
para poder hacer busquedas combinadas por titulares o categorias. Los roles que representan son:

```
* Component:  IBuscadorProyectos
* Composite:  BuscadorCompuesto  
* Leaf: BuscadorPorCategoria, BuscadorPorTitulo, BuscadorAnd, BuscadorOr y BuscadorNot

```
Segundo utilizamos el patron Composite para las restricciones temporales que van a tener nuestros Desafios.
Los roles que representan son:

```

* Component:  IRestriccionTemporal
* Composite:  RestriccionCombinada  
* Leaf: RestriccionFinSemana, RestriccionSemana y RestriccionFecha

```


