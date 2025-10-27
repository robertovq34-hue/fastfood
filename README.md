# 🍗 Sistema de Gestión de Pedidos – El Chino Brasa

Proyecto desarrollado en **Python (POO)** como parte del curso **Programación Orientada a Objetos II**, con el objetivo de automatizar y optimizar el proceso de pedidos en el restaurante *El Chino Brasa*.  
El sistema integra las áreas de atención, cocina y administración, aplicando principios de diseño orientado a objetos y buenas prácticas de ingeniería de software.

---

## 🧩 Descripción del proyecto

El sistema responde a la problemática actual del restaurante, que enfrenta errores, demoras y falta de trazabilidad en la gestión manual de pedidos.  
A través de una interfaz lógica y modular, el sistema permite:
- Registrar pedidos de manera digital.
- Enviar automáticamente los pedidos al área de cocina.
- Actualizar el estado de los pedidos en tiempo real.
- Generar facturas automáticas.
- Emitir reportes administrativos para la toma de decisiones.

---

## 🎯 Objetivos

### Objetivo general
Desarrollar un sistema informático basado en la Programación Orientada a Objetos (POO) que automatice y optimice el proceso de gestión de pedidos en el restaurante El Chino Brasa.

### Objetivos específicos
- Analizar el proceso actual de gestión de pedidos e identificar sus fallas.
- Diseñar la arquitectura del sistema usando principios POO y diagramas UML.
- Implementar módulos en Python para pedidos, usuarios, facturación y reportes.
- Validar el correcto funcionamiento mediante pruebas unitarias y de integración.
- Evaluar el impacto del sistema en la eficiencia operativa.

---

## ⚙️ Requerimientos

### Funcionales
- Registrar y editar pedidos.
- Comunicar automáticamente pedidos al área de cocina.
- Calcular el total del pedido y generar factura.
- Gestionar roles de usuario (Mesero, Cocinero, Administrador).
- Generar reportes de ventas y tiempos de atención.

### No funcionales
- **Usabilidad:** interfaz sencilla y entendible.
- **Rendimiento:** respuesta rápida incluso en horas pico.
- **Compatibilidad:** ejecutable en Windows/Linux con Python 3.10+.
- **Seguridad:** control de acceso por roles.
- **Mantenibilidad:** código documentado y modular.

---

## 💻 Tecnologías utilizadas

| Tipo | Herramienta |
|------|--------------|
| Lenguaje | Python 3.10+ |
| Paradigma | Programación Orientada a Objetos |
| Librerías | `datetime`, `typing` |
| Control de versiones | Git / GitHub |
| Diagramas | UML (Clases, Casos de Uso, Secuencia) |

---

## 🧠 Diseño del sistema

### Diagramas UML
- **Diagrama de Clases:** modela las entidades principales (`Usuario`, `Pedido`, `Producto`, `Factura`).
- **Diagrama de Casos de Uso:** define las interacciones entre actores (`Mesero`, `Cocinero`, `Administrador`).
- **Diagrama de Secuencia:** representa el flujo lógico del pedido hasta su facturación.

### Principales clases

| Clase | Descripción |
|--------|--------------|
| `Usuario` | Clase base para todos los roles del sistema. |
| `Mesero` | Registra los pedidos de los clientes. |
| `Cocinero` | Actualiza el estado de los pedidos. |
| `Administrador` | Genera reportes de ventas y pedidos. |
| `Pedido` | Contiene los productos y su estado. |
| `Producto` | Representa los ítems del menú. |
| `Factura` | Calcula y muestra el total del pedido. |

---

## 🧩 Estructura del proyecto

