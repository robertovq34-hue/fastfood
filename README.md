[README_ElChinoBrasa.md](https://github.com/user-attachments/files/23175912/README_ElChinoBrasa.md)

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

```
📦 el-chino-brasa
├── 📄 README.md
├── 📄 main.py
├── 📄 clases.py
├── 📄 diagramas/
│   ├── diagrama_clases.png
│   ├── diagrama_casos_uso.png
│   └── diagrama_secuencia.png
└── 📄 requirements.txt
```

---

## 🚀 Ejecución del programa

### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/tuusuario/el-chino-brasa.git
cd el-chino-brasa
```

### 2️⃣ Ejecutar el sistema
```bash
python main.py
```

El sistema simula el flujo completo:
1. El mesero registra un pedido.
2. El cocinero actualiza el estado.
3. Se genera una factura automática.
4. El administrador visualiza el reporte.

---

## 🧪 Ejemplo de salida en consola

```
Pedido #1 actualizado a: Listo

Factura N°: 1001
Detalle del pedido:
 - Pollo a la brasa (S/ 35.00)
 - Papas fritas (S/ 8.00)
 - Inca Kola 1L (S/ 6.00)
Total a pagar: S/ 49.00

=== Reporte de Pedidos ===
Pedido #1 [Listo] - Total: S/ 49.00
```

---

## 🧾 Autores

| Integrante | Carrera | Código |
|-------------|----------|---------|
| **Fernando Avendaño Fajardo** | Ingeniería Agroindustrial | 2512145 |
| **Roberto Villacorta Quispe** | Ingeniería de Sistemas de Información | 2310398 |
| **Pedro Gabriel Sáenz Pachas** | Ingeniería de Software | 2411166 |

---

## 📚 Referencias bibliográficas

- Booch, G., Rumbaugh, J., & Jacobson, I. (2005). *El lenguaje unificado de modelado: Manual de referencia (2.ª ed.)*. Pearson Educación.  
- Pressman, R. S. (2010). *Ingeniería del software: un enfoque práctico (7.ª ed.)*. McGraw-Hill.  
- Sommerville, I. (2011). *Ingeniería de Software (9.ª ed.)*. Pearson Educación.  

---

## 🏁 Estado actual del proyecto

✅ Módulos implementados: Registro de pedidos, Cocina, Facturación, Reportes.  
🔧 Pendiente: Integración de interfaz gráfica (Tkinter o JavaFX) y conexión a base de datos.  
📦 Versión: `v1.0.0`  
📅 Fecha: Febrero 2025  

---
