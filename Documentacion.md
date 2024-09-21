# Documentacion:

1. **AgeValidation**:
   - Lo primero es importar la libreria Scanner.
   - Se define la constante AGE_LIMIT para eliminar el valor magico "18".
   - Se imprime un mensaje al usuario indicando que ingrese su edad.
   - Se reemplaza el segundo IF (el cual es redundante),por un ELSE ya que se deduse que al no cumplirse la condicion  "(age >= 18)" el ususario no tiene una edad valida para ingresar.
   - Se hace un test con varias edades para comprobar el correcto funcionamiento del codigo.

2. **Store**:
   -Declarar constantes para eliminar los valores magicos.
Hicimos un array para almacenar los valores de los precios y las cantidades de los productos.
Se declara y inicializa la variable 'totalSales': Variable que acumula el total de impuestos calculados.
Despues creamos un bucle for para iterra los arreglos y realizar las operaciones y asi obtener la cantidad de ventas.

3. **TaxCalculation**:
   - Constantes:
      PRODUCT_PRICES: Arreglo que almacena los precios de los productos que se están vendiendo.
      TAX_RATES: Arreglo que contiene las tasas de impuesto aplicables a cada producto en el mismo índice que PRECIOS_PRODUCTOS.
      TAX_THRESHOLD: Valor que determina el umbral para clasificar el total de impuestos como alto o bajo.
   - Se declara y inicializa la variable 'totalTex': Variable que acumula el total de impuestos calculados.
   - Se usa un bucle for para iterar sobre los precios de los productos y sus tasas de impuestos correspondientes. En cada iteración, se calcula el impuesto para ese producto y se suma al total.

