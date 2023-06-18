%base de conocimiento-----

entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

%-------------------------

%Implementar las reglas necesarias para formular las siguientes consultas en Prolog:

%¿Cuáles son los menús que ofrece el restaurante?

menus(Entrada, Principal, Postre):- entrada(Entrada), (carne(Principal); pescado(Principal)), postre(Postre).

%¿Cuáles son los menús que tienen Consomé en las entradas?

menus_con_consome(Principal, Postre):- Entrada = consomé, menus(Entrada, Principal, Postre).
menus_con_consome2(Entrada, Principal, Postre):- menus(Entrada, Principal, Postre), Entrada == consomé.

%¿Cuáles son los menús que no contienen flan como postre?

menus_sin_flan(Entrada, Principal, Postre):- menus(Entrada, Principal, Postre), Postre \== flan.

