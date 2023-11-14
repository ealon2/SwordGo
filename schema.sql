
    create table Accesorios (
        id bigint not null,
        personaje_id bigint,
        primary key (id)
    )

    create table Armas (
        ataque integer not null,
        defensa integer not null,
        id bigint not null,
        personaje_id bigint,
        primary key (id)
    )

    create table BolsaDeMoneda (
        monedas integer not null,
        id bigint not null,
        primary key (id)
    )

    create table Items (
        id bigint generated by default as identity (start with 1),
        costo integer not null,
        nombre varchar(255),
        personaje_duenio_id bigint,
        ubicacion_id bigint,
        primary key (id)
    )

    create table Personajes (
        id bigint generated by default as identity (start with 1),
        monedas integer not null,
        nombre varchar(255),
        tipoDePersonaje varchar(255),
        primary key (id)
    )

    create table Regalo (
        fraseMotivacional varchar(255),
        id bigint not null,
        primary key (id)
    )

    create table Ubicacion (
        id bigint generated by default as identity (start with 1),
        nivel integer not null,
        x integer not null,
        y integer not null,
        nombre varchar(255),
        primary key (id)
    )

    create table Ubicaciones_Visitadas (
        Personajes_id bigint not null,
        ubicaciones_id bigint not null
    )

    alter table Accesorios 
        add constraint FK_dvsig8clcsxaflgf3pf4coyh7 
        foreign key (id) 
        references Items

    alter table Accesorios 
        add constraint FK_thei8f1xsk8wd6sy607cp7s5s 
        foreign key (personaje_id) 
        references Personajes

    alter table Armas 
        add constraint FK_ris441i5f0m40uo9817xgjfwv 
        foreign key (id) 
        references Items

    alter table Armas 
        add constraint FK_aob6r2sg341nxcgk05r5nv9gr 
        foreign key (personaje_id) 
        references Personajes

    alter table BolsaDeMoneda 
        add constraint FK_f2ylun97qhldtuhjuxi0eubv1 
        foreign key (id) 
        references Items

    alter table Items 
        add constraint FK_hel2qkrln701yxeykdhk8x34a 
        foreign key (personaje_duenio_id) 
        references Personajes

    alter table Items 
        add constraint FK_a817hogcp5k29eihmuwen08ye 
        foreign key (ubicacion_id) 
        references Ubicacion

    alter table Regalo 
        add constraint FK_347m6xm8qomwlctni9npcilaf 
        foreign key (id) 
        references Items

    alter table Ubicaciones_Visitadas 
        add constraint FK_tb942mi3x0ytq5l3j5kmyx3io 
        foreign key (ubicaciones_id) 
        references Ubicacion

    alter table Ubicaciones_Visitadas 
        add constraint FK_nrjlh4eg7cbu4vvhnt6bg0tcf 
        foreign key (Personajes_id) 
        references Personajes
