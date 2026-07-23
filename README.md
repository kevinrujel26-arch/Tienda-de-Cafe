#  Sistema de Pedidos - Tienda de Café

## Descripción del problema

Una tienda de café necesita un sistema que permita gestionar los pedidos realizados por los clientes.

Cuando un pedido cambia de estado, diferentes áreas de la cafetería necesitan recibir la información automáticamente:

- La cocina necesita conocer los pedidos que debe preparar.
- El cliente necesita recibir actualizaciones sobre el estado de su pedido.
- La caja necesita conocer los cambios del pedido.

El problema es que una implementación tradicional generaría un alto acoplamiento, ya que la clase encargada del pedido tendría que comunicarse directamente con cada módulo.

Para solucionar este problema se aplicó el patrón de diseño **Observer**.

---

## Patrón de diseño aplicado: Observer

El patrón **Observer** permite que un objeto notifique automáticamente a otros objetos cuando cambia su estado.

En este proyecto:

- **Pedido** representa el Subject (sujeto observable).
- **Cocina**, **Cliente** y **Caja** representan los Observers (observadores).

Cuando el estado del pedido cambia, todos los observadores registrados reciben la actualización automáticamente.

---

## Funcionamiento del sistema

El flujo del sistema es el siguiente:

1. Se crea un pedido.
2. Se registran los observadores:
    - Cocina.
    - Cliente.
    - Caja.
3. El pedido cambia de estado.
4. El sistema notifica automáticamente a todos los observadores.

Ejemplo de ejecución:

Estado del pedido: Preparando café

Cocina: Preparando café

Cliente: Preparando café

Caja: Preparando café


Estado del pedido: Pedido entregado

Cocina: Pedido entregado

Cliente: Pedido entregado

Caja: Pedido entregado
