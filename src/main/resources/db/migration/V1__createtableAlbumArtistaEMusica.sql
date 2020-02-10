CREATE TABLE IF NOT EXISTS  Albuns (
                              album_id serial,
                              nome varchar(100)  not null ,
                              ano bigint NULL,
                              primary key (album_id)

);

CREATE TABLE IF NOT EXISTS  Musicas(
                              musica_id  serial not null ,
                              nome varchar(100)  not null ,
                              duracao time,
                              primary key (musica_id)


);

CREATE TABLE IF NOT EXISTS  Artistas (
                                artista_id  serial not null ,
                                nome varchar(100)  not null ,
                                nacionalidade varchar(45),
                                primary key (artista_id)
);