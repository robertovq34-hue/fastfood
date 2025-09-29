# 🍔 FastFood MVP

Proyecto en Java que implementa un sistema de pedidos personalizados para una cadena de comida rápida.  
Incluye los patrones **Factory**, **Builder** y el enfoque **MVC**.

## 🚀 Funcionalidades
- Crear combos base de manera flexible.
- Personalizar paso a paso (bebida, acompañamiento, extra).
- Visualizar el resumen final del pedido.

## 📊 Diagrama UML

```mermaid
classDiagram
    class Combo {
        - String base
        - String bebida
        - String acompanamiento
        - String extra
        + toString()
    }

    class ComboBuilder {
        - String base
        - String bebida
        - String acompanamiento
        - String extra
        + setBase(base)
        + setBebida(bebida)
        + setAcompanamiento(acompanamiento)
        + setExtra(extra)
        + build() Combo
    }

    class ComboFactory {
        + crearComboBase(type ComboType) String
    }

    enum ComboType {
        HAMBURGUESA
        POLLO
        VEGETARIANO
    }

    ComboBuilder --> Combo
    ComboFactory --> ComboType
```
