parcial1(ana,7).
parcial1(juan,4).
parcial1(julio, 2).
parcial1(maria, 10).

parcial2(ana,9).
parcial2(juan,8).
parcial2(julio, 4).
parcial2(maria, 2).

%Se desea obtener
%El listado de los alumnos que promocionan la materia

promocionados(Nombre):- parcial1(Nombre,P1), parcial2(Nombre,P2), P1 >= 7, P2 >= 7.

%El mismo listado pero esta vez incluyendo la nota final (promedio de los dos parciales) para cada uno

promocionadosNotaFinal(Nombre, NotaFinal):- promocionados(Nombre), parcial1(Nombre, P1), parcial2(Nombre, P2), NotaFinal is (P1 + P2)/ 2.

%El listado de los alumnos que recursan la materia.

recursan(Nombre):- parcial1(Nombre, P1), parcial2(Nombre, P2), (  P1 < 4 ; P2 < 4 ).

%El listado de los alumnos que obtendrán la cursada.

cursada(Nombre):- parcial1(Nombre, _), parcial2(Nombre, _),\+promocionados(Nombre), \+recursan(Nombre).

%A fin de entregar la medalla al mérito, encontrar de aquellos que promocionan (1b), el o los alumnos con mayor nota final (nombre y nota)

%Ahora se desea obtener cuales fueron las dos notas más altas, considerando simplemente a la nota como el promedio de la nota de parcial1 y parcial2. Solo interesan los números. Un tip es pensar la resolución en dos etapas, la más alta, y después la más alta de lo restante