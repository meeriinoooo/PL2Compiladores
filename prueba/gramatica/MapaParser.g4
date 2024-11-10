parser grammar MapaParser;

options { tokenVocab = MapaLexer; }

mapa : MAPA peligroInfo* barcoInfo* posicionInfo*  EOF ;

barcoInfo : NOMBRE_BARCO TE_DA NUMERO PUNTOS ;

posicionInfo : NOMBRE_BARCO ENTERRADO_EN NUMERO COMA NUMERO ;

peligroInfo : NOMBRE_PELIGRO TE_QUITA NUMERO PUNTOS;