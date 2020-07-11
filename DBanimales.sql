PGDMP                         x            Register    12.3    12.3 �    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    24787    Register    DATABASE     �   CREATE DATABASE "Register" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE "Register";
                postgres    false            �            1259    32982    animal    TABLE     ?  CREATE TABLE public.animal (
    id integer NOT NULL,
    "nombreComun" character varying(255) NOT NULL,
    "nombreCientifico" character varying(255) NOT NULL,
    genero character varying(255) NOT NULL,
    edad integer NOT NULL,
    peso real NOT NULL,
    id_clase integer NOT NULL,
    id_tipo integer NOT NULL
);
    DROP TABLE public.animal;
       public         heap    postgres    false            �            1259    33279    animal_id_seq    SEQUENCE     �   ALTER TABLE public.animal ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.animal_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    203            �            1259    33116    avestruz    TABLE     �   CREATE TABLE public.avestruz (
    id_avestruz integer NOT NULL,
    "periodoDeIncubacion" integer NOT NULL,
    vuela boolean NOT NULL,
    "tamanoCuello" real NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.avestruz;
       public         heap    postgres    false            �            1259    33114    avestruz_id_avestruz_seq    SEQUENCE     �   CREATE SEQUENCE public.avestruz_id_avestruz_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.avestruz_id_avestruz_seq;
       public          postgres    false    215            �           0    0    avestruz_id_avestruz_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.avestruz_id_avestruz_seq OWNED BY public.avestruz.id_avestruz;
          public          postgres    false    214            �            1259    32992    claseAnimal    TABLE     v   CREATE TABLE public."claseAnimal" (
    id_clase integer NOT NULL,
    nombreclase character varying(255) NOT NULL
);
 !   DROP TABLE public."claseAnimal";
       public         heap    postgres    false            �            1259    32990    claseAnimal_id_clase_seq    SEQUENCE     �   CREATE SEQUENCE public."claseAnimal_id_clase_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public."claseAnimal_id_clase_seq";
       public          postgres    false    205            �           0    0    claseAnimal_id_clase_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public."claseAnimal_id_clase_seq" OWNED BY public."claseAnimal".id_clase;
          public          postgres    false    204            �            1259    33183 	   cocodrilo    TABLE     �   CREATE TABLE public.cocodrilo (
    id_cocodrilo integer NOT NULL,
    "periodoDeIncubacion" integer NOT NULL,
    escamas boolean NOT NULL,
    patas boolean NOT NULL,
    "largoDeCola" real NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.cocodrilo;
       public         heap    postgres    false            �            1259    33181    cocodrilo_id_cocodrilo_seq    SEQUENCE     �   CREATE SEQUENCE public.cocodrilo_id_cocodrilo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.cocodrilo_id_cocodrilo_seq;
       public          postgres    false    229            �           0    0    cocodrilo_id_cocodrilo_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.cocodrilo_id_cocodrilo_seq OWNED BY public.cocodrilo.id_cocodrilo;
          public          postgres    false    228            �            1259    33148    elefante    TABLE     �   CREATE TABLE public.elefante (
    id_elefante integer NOT NULL,
    alimento character varying(255) NOT NULL,
    "peridodoDeLactancia" integer NOT NULL,
    "enCelo" boolean NOT NULL,
    "largoTrompa" real NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.elefante;
       public         heap    postgres    false            �            1259    33146    elefante_id_elefante_seq    SEQUENCE     �   CREATE SEQUENCE public.elefante_id_elefante_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.elefante_id_elefante_seq;
       public          postgres    false    221            �           0    0    elefante_id_elefante_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.elefante_id_elefante_seq OWNED BY public.elefante.id_elefante;
          public          postgres    false    220            �            1259    33255    flamenco    TABLE     �   CREATE TABLE public.flamenco (
    id_flamenco integer NOT NULL,
    "periodoDeIncubacion" integer NOT NULL,
    vuela boolean NOT NULL,
    "numPlumas" integer NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.flamenco;
       public         heap    postgres    false            �            1259    33253    flamenco_id_flamenco_seq    SEQUENCE     �   CREATE SEQUENCE public.flamenco_id_flamenco_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.flamenco_id_flamenco_seq;
       public          postgres    false    233            �           0    0    flamenco_id_flamenco_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.flamenco_id_flamenco_seq OWNED BY public.flamenco.id_flamenco;
          public          postgres    false    232            �            1259    33268    halcon    TABLE     �   CREATE TABLE public.halcon (
    id_halcon integer NOT NULL,
    "periodoDeIncubacion" integer NOT NULL,
    vuela boolean NOT NULL,
    "tamanoAla" real NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.halcon;
       public         heap    postgres    false            �            1259    33266    halcon_id_halcon_seq    SEQUENCE     �   CREATE SEQUENCE public.halcon_id_halcon_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.halcon_id_halcon_seq;
       public          postgres    false    235            �           0    0    halcon_id_halcon_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.halcon_id_halcon_seq OWNED BY public.halcon.id_halcon;
          public          postgres    false    234            �            1259    33156    jaguar    TABLE       CREATE TABLE public.jaguar (
    id_jaguar integer NOT NULL,
    alimento character varying(255) NOT NULL,
    "periodoDeLactancia" integer NOT NULL,
    "enCelo" boolean NOT NULL,
    "numManchas" integer NOT NULL,
    "numDientes" integer NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.jaguar;
       public         heap    postgres    false            �            1259    33154    jaguar_id_jaguar_seq    SEQUENCE     �   CREATE SEQUENCE public.jaguar_id_jaguar_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.jaguar_id_jaguar_seq;
       public          postgres    false    223            �           0    0    jaguar_id_jaguar_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.jaguar_id_jaguar_seq OWNED BY public.jaguar.id_jaguar;
          public          postgres    false    222            �            1259    33140    jirafa    TABLE       CREATE TABLE public.jirafa (
    id_jirafa integer NOT NULL,
    alimento character varying(255) NOT NULL,
    "periodoDeLactancia" integer NOT NULL,
    "enCelo" boolean NOT NULL,
    "largoDeCuello" real NOT NULL,
    "numManchas" integer NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.jirafa;
       public         heap    postgres    false            �            1259    33138    jirafa_id_jirafa_seq    SEQUENCE     �   CREATE SEQUENCE public.jirafa_id_jirafa_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.jirafa_id_jirafa_seq;
       public          postgres    false    219            �           0    0    jirafa_id_jirafa_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.jirafa_id_jirafa_seq OWNED BY public.jirafa.id_jirafa;
          public          postgres    false    218            �            1259    33132    lechuza    TABLE     �   CREATE TABLE public.lechuza (
    id_lechuza integer NOT NULL,
    "peridodoDeIncubacion" integer NOT NULL,
    vuela boolean NOT NULL,
    color character varying(255) NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.lechuza;
       public         heap    postgres    false            �            1259    33130    lechuza_id_lechuza_seq    SEQUENCE     �   CREATE SEQUENCE public.lechuza_id_lechuza_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.lechuza_id_lechuza_seq;
       public          postgres    false    217            �           0    0    lechuza_id_lechuza_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.lechuza_id_lechuza_seq OWNED BY public.lechuza.id_lechuza;
          public          postgres    false    216            �            1259    33164 	   orangutan    TABLE       CREATE TABLE public.orangutan (
    id_orangutan integer NOT NULL,
    alimento character varying(255) NOT NULL,
    "periodoDeLactancia" integer NOT NULL,
    "enCelo" boolean NOT NULL,
    iq integer NOT NULL,
    "conPareja" boolean NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.orangutan;
       public         heap    postgres    false            �            1259    33162    orangutan_id_orangutan_seq    SEQUENCE     �   CREATE SEQUENCE public.orangutan_id_orangutan_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.orangutan_id_orangutan_seq;
       public          postgres    false    225            �           0    0    orangutan_id_orangutan_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.orangutan_id_orangutan_seq OWNED BY public.orangutan.id_orangutan;
          public          postgres    false    224            �            1259    33172    oso    TABLE       CREATE TABLE public.oso (
    id_oso integer NOT NULL,
    alimento character varying(255) NOT NULL,
    "periodoDeLactancia" integer NOT NULL,
    "enCelo" boolean NOT NULL,
    color character varying(255) NOT NULL,
    estatura real NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.oso;
       public         heap    postgres    false            �            1259    33170    oso_id_oso_seq    SEQUENCE     �   CREATE SEQUENCE public.oso_id_oso_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.oso_id_oso_seq;
       public          postgres    false    227            �           0    0    oso_id_oso_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.oso_id_oso_seq OWNED BY public.oso.id_oso;
          public          postgres    false    226            �            1259    33008    rana    TABLE     �   CREATE TABLE public.rana (
    id_rana integer NOT NULL,
    "tipoDeAnfibio" character varying(255) NOT NULL,
    venenosa boolean NOT NULL,
    "colorDePiel" character varying(255) NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.rana;
       public         heap    postgres    false            �            1259    33006    rana_id_rana_seq    SEQUENCE     �   CREATE SEQUENCE public.rana_id_rana_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.rana_id_rana_seq;
       public          postgres    false    209            �           0    0    rana_id_rana_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.rana_id_rana_seq OWNED BY public.rana.id_rana;
          public          postgres    false    208            �            1259    33027 
   salamandra    TABLE     �   CREATE TABLE public.salamandra (
    id_salamandra integer NOT NULL,
    "tipoDeAnfibio" character varying(255) NOT NULL,
    venenosa boolean NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.salamandra;
       public         heap    postgres    false            �            1259    33025    salamandra_id_salamandra_seq    SEQUENCE     �   CREATE SEQUENCE public.salamandra_id_salamandra_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.salamandra_id_salamandra_seq;
       public          postgres    false    211            �           0    0    salamandra_id_salamandra_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.salamandra_id_salamandra_seq OWNED BY public.salamandra.id_salamandra;
          public          postgres    false    210            �            1259    33191 	   serpiente    TABLE     *  CREATE TABLE public.serpiente (
    id_serpiente integer NOT NULL,
    "periodoDeIncubacion" integer NOT NULL,
    escamas boolean NOT NULL,
    patas boolean NOT NULL,
    longitud real NOT NULL,
    venenosa boolean NOT NULL,
    color character varying(255) NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.serpiente;
       public         heap    postgres    false            �            1259    33189    serpiente_id_serpiente_seq    SEQUENCE     �   CREATE SEQUENCE public.serpiente_id_serpiente_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.serpiente_id_serpiente_seq;
       public          postgres    false    231            �           0    0    serpiente_id_serpiente_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.serpiente_id_serpiente_seq OWNED BY public.serpiente.id_serpiente;
          public          postgres    false    230            �            1259    33000 
   tipoAnimal    TABLE     s   CREATE TABLE public."tipoAnimal" (
    id_tipo integer NOT NULL,
    nombretipo character varying(255) NOT NULL
);
     DROP TABLE public."tipoAnimal";
       public         heap    postgres    false            �            1259    32998    tipoAnimal_id_tipo_seq    SEQUENCE     �   CREATE SEQUENCE public."tipoAnimal_id_tipo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public."tipoAnimal_id_tipo_seq";
       public          postgres    false    207            �           0    0    tipoAnimal_id_tipo_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public."tipoAnimal_id_tipo_seq" OWNED BY public."tipoAnimal".id_tipo;
          public          postgres    false    206            �            1259    33108    tucan    TABLE     �   CREATE TABLE public.tucan (
    id_tucan integer NOT NULL,
    "periodoDeIncubacion" integer NOT NULL,
    vuela boolean NOT NULL,
    "colorPico" character varying(255) NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.tucan;
       public         heap    postgres    false            �            1259    33106    tucan_id_tucan_seq    SEQUENCE     �   CREATE SEQUENCE public.tucan_id_tucan_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.tucan_id_tucan_seq;
       public          postgres    false    213            �           0    0    tucan_id_tucan_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.tucan_id_tucan_seq OWNED BY public.tucan.id_tucan;
          public          postgres    false    212            �            1259    24788    users    TABLE     �   CREATE TABLE public.users (
    username character varying(20),
    email character varying(20),
    pass character varying(20)
);
    DROP TABLE public.users;
       public         heap    postgres    false            �
           2604    33119    avestruz id_avestruz    DEFAULT     |   ALTER TABLE ONLY public.avestruz ALTER COLUMN id_avestruz SET DEFAULT nextval('public.avestruz_id_avestruz_seq'::regclass);
 C   ALTER TABLE public.avestruz ALTER COLUMN id_avestruz DROP DEFAULT;
       public          postgres    false    215    214    215            �
           2604    32995    claseAnimal id_clase    DEFAULT     �   ALTER TABLE ONLY public."claseAnimal" ALTER COLUMN id_clase SET DEFAULT nextval('public."claseAnimal_id_clase_seq"'::regclass);
 E   ALTER TABLE public."claseAnimal" ALTER COLUMN id_clase DROP DEFAULT;
       public          postgres    false    204    205    205            �
           2604    33186    cocodrilo id_cocodrilo    DEFAULT     �   ALTER TABLE ONLY public.cocodrilo ALTER COLUMN id_cocodrilo SET DEFAULT nextval('public.cocodrilo_id_cocodrilo_seq'::regclass);
 E   ALTER TABLE public.cocodrilo ALTER COLUMN id_cocodrilo DROP DEFAULT;
       public          postgres    false    229    228    229            �
           2604    33151    elefante id_elefante    DEFAULT     |   ALTER TABLE ONLY public.elefante ALTER COLUMN id_elefante SET DEFAULT nextval('public.elefante_id_elefante_seq'::regclass);
 C   ALTER TABLE public.elefante ALTER COLUMN id_elefante DROP DEFAULT;
       public          postgres    false    221    220    221            �
           2604    33258    flamenco id_flamenco    DEFAULT     |   ALTER TABLE ONLY public.flamenco ALTER COLUMN id_flamenco SET DEFAULT nextval('public.flamenco_id_flamenco_seq'::regclass);
 C   ALTER TABLE public.flamenco ALTER COLUMN id_flamenco DROP DEFAULT;
       public          postgres    false    232    233    233            �
           2604    33271    halcon id_halcon    DEFAULT     t   ALTER TABLE ONLY public.halcon ALTER COLUMN id_halcon SET DEFAULT nextval('public.halcon_id_halcon_seq'::regclass);
 ?   ALTER TABLE public.halcon ALTER COLUMN id_halcon DROP DEFAULT;
       public          postgres    false    234    235    235            �
           2604    33159    jaguar id_jaguar    DEFAULT     t   ALTER TABLE ONLY public.jaguar ALTER COLUMN id_jaguar SET DEFAULT nextval('public.jaguar_id_jaguar_seq'::regclass);
 ?   ALTER TABLE public.jaguar ALTER COLUMN id_jaguar DROP DEFAULT;
       public          postgres    false    222    223    223            �
           2604    33143    jirafa id_jirafa    DEFAULT     t   ALTER TABLE ONLY public.jirafa ALTER COLUMN id_jirafa SET DEFAULT nextval('public.jirafa_id_jirafa_seq'::regclass);
 ?   ALTER TABLE public.jirafa ALTER COLUMN id_jirafa DROP DEFAULT;
       public          postgres    false    218    219    219            �
           2604    33135    lechuza id_lechuza    DEFAULT     x   ALTER TABLE ONLY public.lechuza ALTER COLUMN id_lechuza SET DEFAULT nextval('public.lechuza_id_lechuza_seq'::regclass);
 A   ALTER TABLE public.lechuza ALTER COLUMN id_lechuza DROP DEFAULT;
       public          postgres    false    217    216    217            �
           2604    33167    orangutan id_orangutan    DEFAULT     �   ALTER TABLE ONLY public.orangutan ALTER COLUMN id_orangutan SET DEFAULT nextval('public.orangutan_id_orangutan_seq'::regclass);
 E   ALTER TABLE public.orangutan ALTER COLUMN id_orangutan DROP DEFAULT;
       public          postgres    false    224    225    225            �
           2604    33175 
   oso id_oso    DEFAULT     h   ALTER TABLE ONLY public.oso ALTER COLUMN id_oso SET DEFAULT nextval('public.oso_id_oso_seq'::regclass);
 9   ALTER TABLE public.oso ALTER COLUMN id_oso DROP DEFAULT;
       public          postgres    false    227    226    227            �
           2604    33011    rana id_rana    DEFAULT     l   ALTER TABLE ONLY public.rana ALTER COLUMN id_rana SET DEFAULT nextval('public.rana_id_rana_seq'::regclass);
 ;   ALTER TABLE public.rana ALTER COLUMN id_rana DROP DEFAULT;
       public          postgres    false    208    209    209            �
           2604    33030    salamandra id_salamandra    DEFAULT     �   ALTER TABLE ONLY public.salamandra ALTER COLUMN id_salamandra SET DEFAULT nextval('public.salamandra_id_salamandra_seq'::regclass);
 G   ALTER TABLE public.salamandra ALTER COLUMN id_salamandra DROP DEFAULT;
       public          postgres    false    211    210    211            �
           2604    33194    serpiente id_serpiente    DEFAULT     �   ALTER TABLE ONLY public.serpiente ALTER COLUMN id_serpiente SET DEFAULT nextval('public.serpiente_id_serpiente_seq'::regclass);
 E   ALTER TABLE public.serpiente ALTER COLUMN id_serpiente DROP DEFAULT;
       public          postgres    false    230    231    231            �
           2604    33003    tipoAnimal id_tipo    DEFAULT     |   ALTER TABLE ONLY public."tipoAnimal" ALTER COLUMN id_tipo SET DEFAULT nextval('public."tipoAnimal_id_tipo_seq"'::regclass);
 C   ALTER TABLE public."tipoAnimal" ALTER COLUMN id_tipo DROP DEFAULT;
       public          postgres    false    206    207    207            �
           2604    33111    tucan id_tucan    DEFAULT     p   ALTER TABLE ONLY public.tucan ALTER COLUMN id_tucan SET DEFAULT nextval('public.tucan_id_tucan_seq'::regclass);
 =   ALTER TABLE public.tucan ALTER COLUMN id_tucan DROP DEFAULT;
       public          postgres    false    213    212    213            �          0    32982    animal 
   TABLE DATA           n   COPY public.animal (id, "nombreComun", "nombreCientifico", genero, edad, peso, id_clase, id_tipo) FROM stdin;
    public          postgres    false    203   ��       �          0    33116    avestruz 
   TABLE DATA           a   COPY public.avestruz (id_avestruz, "periodoDeIncubacion", vuela, "tamanoCuello", id) FROM stdin;
    public          postgres    false    215   ��       �          0    32992    claseAnimal 
   TABLE DATA           >   COPY public."claseAnimal" (id_clase, nombreclase) FROM stdin;
    public          postgres    false    205   �       �          0    33183 	   cocodrilo 
   TABLE DATA           k   COPY public.cocodrilo (id_cocodrilo, "periodoDeIncubacion", escamas, patas, "largoDeCola", id) FROM stdin;
    public          postgres    false    229   *�       �          0    33148    elefante 
   TABLE DATA           m   COPY public.elefante (id_elefante, alimento, "peridodoDeLactancia", "enCelo", "largoTrompa", id) FROM stdin;
    public          postgres    false    221   \�       �          0    33255    flamenco 
   TABLE DATA           ^   COPY public.flamenco (id_flamenco, "periodoDeIncubacion", vuela, "numPlumas", id) FROM stdin;
    public          postgres    false    233   y�       �          0    33268    halcon 
   TABLE DATA           Z   COPY public.halcon (id_halcon, "periodoDeIncubacion", vuela, "tamanoAla", id) FROM stdin;
    public          postgres    false    235   ��       �          0    33156    jaguar 
   TABLE DATA           u   COPY public.jaguar (id_jaguar, alimento, "periodoDeLactancia", "enCelo", "numManchas", "numDientes", id) FROM stdin;
    public          postgres    false    223   ҧ       �          0    33140    jirafa 
   TABLE DATA           x   COPY public.jirafa (id_jirafa, alimento, "periodoDeLactancia", "enCelo", "largoDeCuello", "numManchas", id) FROM stdin;
    public          postgres    false    219   �       �          0    33132    lechuza 
   TABLE DATA           W   COPY public.lechuza (id_lechuza, "peridodoDeIncubacion", vuela, color, id) FROM stdin;
    public          postgres    false    217   $�       �          0    33164 	   orangutan 
   TABLE DATA           p   COPY public.orangutan (id_orangutan, alimento, "periodoDeLactancia", "enCelo", iq, "conPareja", id) FROM stdin;
    public          postgres    false    225   A�       �          0    33172    oso 
   TABLE DATA           d   COPY public.oso (id_oso, alimento, "periodoDeLactancia", "enCelo", color, estatura, id) FROM stdin;
    public          postgres    false    227   q�       �          0    33008    rana 
   TABLE DATA           U   COPY public.rana (id_rana, "tipoDeAnfibio", venenosa, "colorDePiel", id) FROM stdin;
    public          postgres    false    209   ��       �          0    33027 
   salamandra 
   TABLE DATA           R   COPY public.salamandra (id_salamandra, "tipoDeAnfibio", venenosa, id) FROM stdin;
    public          postgres    false    211   ��       �          0    33191 	   serpiente 
   TABLE DATA           w   COPY public.serpiente (id_serpiente, "periodoDeIncubacion", escamas, patas, longitud, venenosa, color, id) FROM stdin;
    public          postgres    false    231   ��       �          0    33000 
   tipoAnimal 
   TABLE DATA           ;   COPY public."tipoAnimal" (id_tipo, nombretipo) FROM stdin;
    public          postgres    false    207   )�       �          0    33108    tucan 
   TABLE DATA           X   COPY public.tucan (id_tucan, "periodoDeIncubacion", vuela, "colorPico", id) FROM stdin;
    public          postgres    false    213   ��       �          0    24788    users 
   TABLE DATA           6   COPY public.users (username, email, pass) FROM stdin;
    public          postgres    false    202   ҩ       �           0    0    animal_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.animal_id_seq', 36, true);
          public          postgres    false    236            �           0    0    avestruz_id_avestruz_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.avestruz_id_avestruz_seq', 2, true);
          public          postgres    false    214            �           0    0    claseAnimal_id_clase_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public."claseAnimal_id_clase_seq"', 5, true);
          public          postgres    false    204            �           0    0    cocodrilo_id_cocodrilo_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.cocodrilo_id_cocodrilo_seq', 3, true);
          public          postgres    false    228            �           0    0    elefante_id_elefante_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.elefante_id_elefante_seq', 1, false);
          public          postgres    false    220            �           0    0    flamenco_id_flamenco_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.flamenco_id_flamenco_seq', 3, true);
          public          postgres    false    232            �           0    0    halcon_id_halcon_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.halcon_id_halcon_seq', 1, false);
          public          postgres    false    234            �           0    0    jaguar_id_jaguar_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.jaguar_id_jaguar_seq', 1, true);
          public          postgres    false    222            �           0    0    jirafa_id_jirafa_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.jirafa_id_jirafa_seq', 1, false);
          public          postgres    false    218            �           0    0    lechuza_id_lechuza_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.lechuza_id_lechuza_seq', 1, false);
          public          postgres    false    216            �           0    0    orangutan_id_orangutan_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.orangutan_id_orangutan_seq', 1, true);
          public          postgres    false    224            �           0    0    oso_id_oso_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.oso_id_oso_seq', 1, false);
          public          postgres    false    226            �           0    0    rana_id_rana_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.rana_id_rana_seq', 1, true);
          public          postgres    false    208            �           0    0    salamandra_id_salamandra_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.salamandra_id_salamandra_seq', 2, true);
          public          postgres    false    210            �           0    0    serpiente_id_serpiente_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.serpiente_id_serpiente_seq', 1, true);
          public          postgres    false    230            �           0    0    tipoAnimal_id_tipo_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public."tipoAnimal_id_tipo_seq"', 14, true);
          public          postgres    false    206            �           0    0    tucan_id_tucan_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.tucan_id_tucan_seq', 1, false);
          public          postgres    false    212                       2606    33260    flamenco Flamenco_pk 
   CONSTRAINT     ]   ALTER TABLE ONLY public.flamenco
    ADD CONSTRAINT "Flamenco_pk" PRIMARY KEY (id_flamenco);
 @   ALTER TABLE ONLY public.flamenco DROP CONSTRAINT "Flamenco_pk";
       public            postgres    false    233            �
           2606    32989    animal animal_pk 
   CONSTRAINT     N   ALTER TABLE ONLY public.animal
    ADD CONSTRAINT animal_pk PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.animal DROP CONSTRAINT animal_pk;
       public            postgres    false    203                       2606    33121    avestruz avestruz_pk 
   CONSTRAINT     [   ALTER TABLE ONLY public.avestruz
    ADD CONSTRAINT avestruz_pk PRIMARY KEY (id_avestruz);
 >   ALTER TABLE ONLY public.avestruz DROP CONSTRAINT avestruz_pk;
       public            postgres    false    215            �
           2606    32997    claseAnimal claseAnimal_pk 
   CONSTRAINT     b   ALTER TABLE ONLY public."claseAnimal"
    ADD CONSTRAINT "claseAnimal_pk" PRIMARY KEY (id_clase);
 H   ALTER TABLE ONLY public."claseAnimal" DROP CONSTRAINT "claseAnimal_pk";
       public            postgres    false    205                       2606    33188    cocodrilo cocodrilo_pk 
   CONSTRAINT     ^   ALTER TABLE ONLY public.cocodrilo
    ADD CONSTRAINT cocodrilo_pk PRIMARY KEY (id_cocodrilo);
 @   ALTER TABLE ONLY public.cocodrilo DROP CONSTRAINT cocodrilo_pk;
       public            postgres    false    229            	           2606    33153    elefante elefante_pk 
   CONSTRAINT     [   ALTER TABLE ONLY public.elefante
    ADD CONSTRAINT elefante_pk PRIMARY KEY (id_elefante);
 >   ALTER TABLE ONLY public.elefante DROP CONSTRAINT elefante_pk;
       public            postgres    false    221                       2606    33273    halcon halcon_pk 
   CONSTRAINT     U   ALTER TABLE ONLY public.halcon
    ADD CONSTRAINT halcon_pk PRIMARY KEY (id_halcon);
 :   ALTER TABLE ONLY public.halcon DROP CONSTRAINT halcon_pk;
       public            postgres    false    235                       2606    33161    jaguar jaguar_pk 
   CONSTRAINT     U   ALTER TABLE ONLY public.jaguar
    ADD CONSTRAINT jaguar_pk PRIMARY KEY (id_jaguar);
 :   ALTER TABLE ONLY public.jaguar DROP CONSTRAINT jaguar_pk;
       public            postgres    false    223                       2606    33145    jirafa jirafa_pk 
   CONSTRAINT     U   ALTER TABLE ONLY public.jirafa
    ADD CONSTRAINT jirafa_pk PRIMARY KEY (id_jirafa);
 :   ALTER TABLE ONLY public.jirafa DROP CONSTRAINT jirafa_pk;
       public            postgres    false    219                       2606    33137    lechuza lechuza_pk 
   CONSTRAINT     X   ALTER TABLE ONLY public.lechuza
    ADD CONSTRAINT lechuza_pk PRIMARY KEY (id_lechuza);
 <   ALTER TABLE ONLY public.lechuza DROP CONSTRAINT lechuza_pk;
       public            postgres    false    217                       2606    33169    orangutan orangutan_pk 
   CONSTRAINT     ^   ALTER TABLE ONLY public.orangutan
    ADD CONSTRAINT orangutan_pk PRIMARY KEY (id_orangutan);
 @   ALTER TABLE ONLY public.orangutan DROP CONSTRAINT orangutan_pk;
       public            postgres    false    225                       2606    33180 
   oso oso_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.oso
    ADD CONSTRAINT oso_pk PRIMARY KEY (id_oso);
 4   ALTER TABLE ONLY public.oso DROP CONSTRAINT oso_pk;
       public            postgres    false    227            �
           2606    33016    rana rana_pk 
   CONSTRAINT     O   ALTER TABLE ONLY public.rana
    ADD CONSTRAINT rana_pk PRIMARY KEY (id_rana);
 6   ALTER TABLE ONLY public.rana DROP CONSTRAINT rana_pk;
       public            postgres    false    209            �
           2606    33032    salamandra salamandra_pk 
   CONSTRAINT     a   ALTER TABLE ONLY public.salamandra
    ADD CONSTRAINT salamandra_pk PRIMARY KEY (id_salamandra);
 B   ALTER TABLE ONLY public.salamandra DROP CONSTRAINT salamandra_pk;
       public            postgres    false    211                       2606    33196    serpiente serpiente_pk 
   CONSTRAINT     ^   ALTER TABLE ONLY public.serpiente
    ADD CONSTRAINT serpiente_pk PRIMARY KEY (id_serpiente);
 @   ALTER TABLE ONLY public.serpiente DROP CONSTRAINT serpiente_pk;
       public            postgres    false    231            �
           2606    33005    tipoAnimal tipoAnimal_pk 
   CONSTRAINT     _   ALTER TABLE ONLY public."tipoAnimal"
    ADD CONSTRAINT "tipoAnimal_pk" PRIMARY KEY (id_tipo);
 F   ALTER TABLE ONLY public."tipoAnimal" DROP CONSTRAINT "tipoAnimal_pk";
       public            postgres    false    207                       2606    33113    tucan tucan_pk 
   CONSTRAINT     R   ALTER TABLE ONLY public.tucan
    ADD CONSTRAINT tucan_pk PRIMARY KEY (id_tucan);
 8   ALTER TABLE ONLY public.tucan DROP CONSTRAINT tucan_pk;
       public            postgres    false    213            &           2606    33291    flamenco Flamenco_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.flamenco
    ADD CONSTRAINT "Flamenco_fk0" FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 A   ALTER TABLE ONLY public.flamenco DROP CONSTRAINT "Flamenco_fk0";
       public          postgres    false    203    233    2807                       2606    33033    animal animal_fk0    FK CONSTRAINT        ALTER TABLE ONLY public.animal
    ADD CONSTRAINT animal_fk0 FOREIGN KEY (id_clase) REFERENCES public."claseAnimal"(id_clase);
 ;   ALTER TABLE ONLY public.animal DROP CONSTRAINT animal_fk0;
       public          postgres    false    203    205    2809                       2606    33038    animal animal_fk1    FK CONSTRAINT     |   ALTER TABLE ONLY public.animal
    ADD CONSTRAINT animal_fk1 FOREIGN KEY (id_tipo) REFERENCES public."tipoAnimal"(id_tipo);
 ;   ALTER TABLE ONLY public.animal DROP CONSTRAINT animal_fk1;
       public          postgres    false    207    203    2811                       2606    33286    avestruz avestruz_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.avestruz
    ADD CONSTRAINT avestruz_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY public.avestruz DROP CONSTRAINT avestruz_fk0;
       public          postgres    false    203    215    2807            $           2606    33326    cocodrilo cocodrilo_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.cocodrilo
    ADD CONSTRAINT cocodrilo_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 A   ALTER TABLE ONLY public.cocodrilo DROP CONSTRAINT cocodrilo_fk0;
       public          postgres    false    203    229    2807                        2606    33306    elefante elefante_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.elefante
    ADD CONSTRAINT elefante_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY public.elefante DROP CONSTRAINT elefante_fk0;
       public          postgres    false    203    221    2807            '           2606    33341    halcon halcon_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.halcon
    ADD CONSTRAINT halcon_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 ;   ALTER TABLE ONLY public.halcon DROP CONSTRAINT halcon_fk0;
       public          postgres    false    203    2807    235            !           2606    33311    jaguar jaguar_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.jaguar
    ADD CONSTRAINT jaguar_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 ;   ALTER TABLE ONLY public.jaguar DROP CONSTRAINT jaguar_fk0;
       public          postgres    false    203    223    2807                       2606    33301    jirafa jirafa_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.jirafa
    ADD CONSTRAINT jirafa_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 ;   ALTER TABLE ONLY public.jirafa DROP CONSTRAINT jirafa_fk0;
       public          postgres    false    2807    219    203                       2606    33296    lechuza lechuza_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.lechuza
    ADD CONSTRAINT lechuza_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 =   ALTER TABLE ONLY public.lechuza DROP CONSTRAINT lechuza_fk0;
       public          postgres    false    217    203    2807            "           2606    33316    orangutan orangutan_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.orangutan
    ADD CONSTRAINT orangutan_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 A   ALTER TABLE ONLY public.orangutan DROP CONSTRAINT orangutan_fk0;
       public          postgres    false    203    225    2807            #           2606    33321    oso oso_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.oso
    ADD CONSTRAINT oso_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 5   ALTER TABLE ONLY public.oso DROP CONSTRAINT oso_fk0;
       public          postgres    false    203    227    2807                       2606    33336    rana rana_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.rana
    ADD CONSTRAINT rana_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 7   ALTER TABLE ONLY public.rana DROP CONSTRAINT rana_fk0;
       public          postgres    false    2807    209    203                       2606    33346    salamandra salamandra_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.salamandra
    ADD CONSTRAINT salamandra_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 C   ALTER TABLE ONLY public.salamandra DROP CONSTRAINT salamandra_fk0;
       public          postgres    false    2807    211    203            %           2606    33331    serpiente serpiente_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.serpiente
    ADD CONSTRAINT serpiente_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 A   ALTER TABLE ONLY public.serpiente DROP CONSTRAINT serpiente_fk0;
       public          postgres    false    203    231    2807                       2606    33281    tucan tucan_fk0    FK CONSTRAINT     �   ALTER TABLE ONLY public.tucan
    ADD CONSTRAINT tucan_fk0 FOREIGN KEY (id) REFERENCES public.animal(id) ON UPDATE CASCADE ON DELETE CASCADE;
 9   ALTER TABLE ONLY public.tucan DROP CONSTRAINT tucan_fk0;
       public          postgres    false    203    213    2807            �   
  x���M�� ��Ï���>�V꭪�^{��'Y�,�+e}��䲕-�<��	�O�jL8��`@���.���Lզ5� �h�=�%^0�ᝦ�� ��P&3!�;`����qpħ�L~Y��R�Ci!�7H�]�#���R�j��� 	�
(84�K2��zq�H#���������ȫ���e]�\:�Y�D;|��ޏK>�k�;����ߝ���H_���X=�Fg�:�D)Yp6xr{����o��<�-G����zf�N�¨:�ma$�:�(�tܶN(}���kG�޺fA/Ts���ڂ�m�s�2��[�8W�S��ra�c�#�-�0��Z���u"N=�!�pqa��T��u�'��1Z����'w�onv�U���[�3�=��د\ +���Xb���9+)ᕭ<��%�����T�c��S�U.�m��K���G�>FB��Q�V��v�BֻK���\ODz����W�w���Z��Ҿ+Z=qt��J/���tW��B��!��9@�      �      x�3�4�L�4�3�4������ ��      �   1   x�3��M��LK-��2�L,K�2�,J-(���2�L�K�L������� ��      �   "   x�3�4�L�,��F\F�Ff`�!�W� PK�      �      x������ � �      �   ,   x�3�4�L�4�4��2�41�,Ɔ\Ɯ�@�)�m����� �G       �      x������ � �      �   %   x�3��-M�H,VH�/N,�4�,bN#s�=... �sI      �      x������ � �      �      x������ � �      �       x�3�LJ�BN#�4Ns3�N#3�=... T�\      �      x������ � �      �      x�3��I,J��,�,��J�44����� N1�      �   +   x�3��I,J��L�46�2�,I-*J-.)J�,�44����� �r�      �   !   x�3�42�LB �M,*���44����� V��      �   |   x��I�0�Κ�U�n�e�(\��C^��FU<3ͭ2��m͜�^�8�87f��L��F~��L<da��锖��%ܭ���U������νv<�����^���j�t�6����҄.R      �      x������ � �      �   :   x�K���K�L/M�L��wH�M���K�����
2�s28!�1�����W� $��     