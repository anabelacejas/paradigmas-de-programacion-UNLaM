hombre(pedro) .
hombre(manuel) .
hombre(arturo) .
hombre(pepe).
hombre(jose).
hombre(pepito).
hombre(pepin).
hombre(juancito).
hombre(alberto).

mujer(mariana).
mujer(maría).

padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría) .
padre(pepe, jose) .
padre(pepe, pepito) .
padre(pepe, pepin) .
padre(juancito, mariana) .
padre(juancito, alberto) .


% expresa que X es hijo o hija de Y.

niño(X,Y):- padre(Y,X).

% expresa que X es un hijo varón de Y.
hijo(X,Y):- padre(Y,X), hombre(X).

% expresa que X es una hija de Y.
hija(X,Y):- padre(Y,X), mujer(X).

% expresa que X es hermano o hermana de Y.
hermano_o_hermana(X,Y):- padre(Padre,X), padre(Padre, Y), X\==Y.

% expresa que X es un hermano de Y.
hermano(X,Y):- hermano_o_hermana(X,Y), hombre(X).

% expresa que X es una hermana de Y.
hermana(X,Y):- hermano_o_hermana(X,Y), mujer(X).




