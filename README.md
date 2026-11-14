Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Unidades de Combate y Estrategia Militar (Clases Abstractas, Herencia y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# ⚔️ Simulación de Sistema de Combate y Unidades Militares (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema táctico de estrategia militar, implementando una arquitectura basada en clases abstractas y herencia para administrar distintos tipos de unidades de combate (infantería, caballería y unidades aéreas) con reglas especializadas de movimiento vectorial, consumo energético, rangos de desplazamiento y ataques tácticos. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la implementación obligatoria de contratos en clases abstractas (`abstract`), la sobrescritura polimórfica de comportamiento (`@Override`), el procesamiento masivo mediante listas tipadas (`List<UnidadCombate>`) y la gestión de lógica condicional defensiva en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta, sus respectivas subclases especializadas, un componente gestor de operaciones y un punto de ejecución:

* **`UnidadCombate` (Clase Abstracta)**: Centraliza los atributos y comportamientos comunes de cualquier fuerza militar dentro del campo de batalla.
* **Atributos protegidos (`protected`)**: `posicionX`, `posicionY` y `energia`, permitiendo que las clases hijas accedan directamente a las coordenadas espaciales y al estado vital de la unidad.
* **Constructor**: Inicializa la posición inicial en el plano y los puntos de energía disponibles.
* **Métodos operativos**:
* `abstract void moverse(int nuevaX, int nuevaY)`: Método abstracto que obliga a cada unidad a implementar su propia lógica geométrica y restricciones de desplazamiento.
* `abstract void atacar()`: Método abstracto que define el contrato obligatorio para la ejecución de ofensivas con consumo energético.
* `mostrar()`: Método concreto compartido que imprime por consola las coordenadas actuales y el nivel de energía restante de la unidad.




* **`Infanteria`**: Extiende de `UnidadCombate` para modelar tropas de infantería terrestre con desplazamientos cortos y precisos.
* **Sobrescritura (`@Override`)**:
* `moverse(...)`: Valida que la distancia Manhattan sea exactamente de una casilla (`distancia == 1`) y que se cuente con al menos 5 puntos de energía para actualizar la posición y descontar el costo operativo.
* `atacar()`: Comprueba la disponibilidad energética (mínimo 10 puntos), descuenta el costo y ejecuta un ataque cuerpo a cuerpo con espada.




* **`Caballeria`**: Extiende de `UnidadCombate` para modelar unidades montadas con gran velocidad de desplazamiento en línea recta.
* **Sobrescritura (`@Override`)**:
* `moverse(...)`: Valida desplazamientos estrictamente horizontales o verticales en rangos de 1 a 3 casillas, verificando el consumo de 10 puntos de energía.
* `atacar()`: Ejecuta una carga ofensiva si la unidad dispone de al menos 15 puntos de energía.




* **`UnidadesAereas`**: Extiende de `UnidadCombate` para modelar fuerzas de apoyo aéreo con libertad de movimiento diagonal y amplio alcance.
* **Sobrescritura (`@Override`)**:
* `moverse(...)`: Calcula la distancia máxima de Chebyshev entre coordenadas permitiendo alcances de hasta 5 casillas con un costo de 8 puntos de energía.
* `atacar()`: Realiza un ataque aéreo a distancia si cuenta con al menos 12 puntos de energía.




* **`GestorDeUnidades`**: Componente controlador encargado de administrar el ciclo operativo del ejército.
* **Método operativo**: `ejecutarAcciones(List<UnidadCombate> unidades)`: Recorre una lista polimórfica de unidades aplicando dinámicamente comandos de movimiento hacia coordenadas destino (`2, 2`), acciones de ataque y despliegue de estado.


* **`Main`**: Punto de entrada del programa. Instancia unidades de infantería, caballería y aéreas con posiciones iniciales específicas, las agrupa en una lista tipada de tipo `List<UnidadCombate>`, instancia el objeto `GestorDeUnidades` y procesa la simulación táctica completa por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Restricciones Geométricas Diferenciadas:** Cada tipo de unidad implementa su propio algoritmo de validación de movimiento (distancia Manhattan estricta para infantería, vectores ortogonales para caballería y distancia máxima para unidades aéreas).
2. **Gestión Defensiva de Recursos Energéticos:** Todas las acciones de desplazamiento y ataque verifican rigurosamente que la unidad posea el umbral de energía requerido antes de modificar sus atributos internos.
3. **Procesamiento Masivo Polimórfico:** El gestor de unidades procesa de manera completamente uniforme y desacoplada a través de la superclase abstracta comportamientos radicalmente distintos en tiempo de ejecución.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
La infanteria avanzó una casilla
La infanteria ataca con su espada.
Posicion X: 2 Posicion Y: 2
Energia: 85

La caballeria se desplazo rapidamente.
La caballeria realiza una carga de ataque.
Posicion X: 2 Posicion Y: 2
Energia: 75

La unidad aerea volo hasta su destino.
La unidad aerea realiza un ataque desde el aire.
Posicion X: 2 Posicion Y: 2
Energia: 80

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción Táctica y Polimorfismo:** Modelado de entidades de combate heterogéneas mediante contratos estrictos en clases abstractas.
* **Separación de Responsabilidades:** Clara división entre las reglas internas de cada tropa, el componente de control táctico (`GestorDeUnidades`) y la inicialización en el cliente (`Main`).
* **Algoritmos Geométricos en POO:** Implementación de cálculos de distancia y validaciones de vectores espaciales encapsulados dentro de los métodos de las subclases.
