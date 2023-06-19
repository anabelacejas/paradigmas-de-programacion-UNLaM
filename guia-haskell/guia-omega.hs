--1.Escribir una función que sume dos números enteros.
sumaEnteros :: Int -> Int-> Int

sumaEnteros num1 num2 = num1 + num2

--2.Implementar una función que calcule el área de un círculo dado su radio.

areaCirculo :: Float -> Float

areaCirculo radio = (pi * radio * radio)

--3.Definir una función que determine si un número es par o impar.

numeroPar :: Int -> Bool
numeroPar numero = numero `mod` 2 == 0

--4.Escribir una función que calcule el factorial de un número.

factorial :: Int -> Int
factorial 0 = 1
factorial 1 = 1
factorial num = num * factorial(num-1)

--6.Definir una función que determine si una lista está ordenada de forma ascendente.

estaOrdenada :: [Int]->Bool

estaOrdenada [] = True
estaOrdenada [a] = True

estaOrdenada (el1:el2:resto) = if el1 <= el2
 then estaOrdenada (el2:resto)
 else False


--7.Escribir una función que cuente la cantidad de elementos en una lista.

--8.Implementar una función que obtenga los elementos en posiciones pares de una lista.

--9.Definir una función que calcule el máximo común divisor de dos números.

--13.Implementar una función que verifique si una cadena de texto es un palíndromo.

esPalindromo:: [Char] -> Bool
esPalindromo [] = True
esPalindromo [x] = True
esPalindromo cadena = if head cadena == last cadena
 then esPalindromo (init(tail cadena))
 else False
