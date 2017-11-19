-- Table: country
CREATE TABLE country
(
  countryid smallint NOT NULL,
  countryname character varying(100) NOT NULL,
  alphacode2 character varying(2) NOT NULL,
  alphacode3 character varying(3) NOT NULL,
  iso3166code character varying(13) NOT NULL,
  CONSTRAINT pk_country PRIMARY KEY (countryid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE country
  OWNER TO postgres;

-- Table: state
CREATE TABLE state
(
  stateid integer NOT NULL,
  statename character varying(100) NOT NULL,
  countryid smallint NOT NULL,
  CONSTRAINT pk_state PRIMARY KEY (stateid),
  CONSTRAINT fk_country FOREIGN KEY (countryid)
      REFERENCES country (countryid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE state
  OWNER TO postgres;


-- Table: place
CREATE TABLE place
(
  placeid bigint NOT NULL,
  placename character varying(100) NOT NULL,
  stateid integer NOT NULL,
  latitude integer NOT NULL DEFAULT (-1),
  longitude integer NOT NULL DEFAULT (-1),
  CONSTRAINT pk_place PRIMARY KEY (placeid),
  CONSTRAINT fk_state FOREIGN KEY (stateid)
      REFERENCES state (stateid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE place
  OWNER TO postgres;


-- Table: gender
CREATE TABLE gender
(
  genderid smallint NOT NULL,
  gendername character varying(50) NOT NULL,
  CONSTRAINT pk_gender PRIMARY KEY (genderid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE gender
  OWNER TO postgres;


-- Table: maritalstatus
CREATE TABLE maritalstatus
(
  maritalstatusid smallint NOT NULL,
  maritalstatustext character varying(50) NOT NULL,
  CONSTRAINT pk_maritalstatus PRIMARY KEY (maritalstatusid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE maritalstatus
  OWNER TO postgres;


-- Table: familytype
CREATE TABLE familytype
(
  familytypeid smallint NOT NULL,
  familytypetext character varying(50) NOT NULL,
  CONSTRAINT pk_familytype PRIMARY KEY (familytypeid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE familytype
  OWNER TO postgres;

-- Table: education
CREATE TABLE education
(
  courseid integer NOT NULL,
  coursename character varying(50) NOT NULL,
  CONSTRAINT pk_education PRIMARY KEY (courseid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE education
  OWNER TO postgres;

  -- Table: degree
CREATE TABLE degree
(
  degreeid integer NOT NULL,
  degreeshort character varying(50) NOT NULL,
  degreename character varying(50) NOT NULL,
  CONSTRAINT pk_degree PRIMARY KEY (degreeid),
  CONSTRAINT fk_education FOREIGN KEY (courseid)
      REFERENCES education (courseid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE degree
  OWNER TO postgres;

-- Table: employment
CREATE TABLE employment
(
  employmentid smallint NOT NULL,
  employmenttext character varying(50) NOT NULL,
  CONSTRAINT pk_employment PRIMARY KEY (employmentid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE employment
  OWNER TO postgres;

-- Table: occupation
CREATE TABLE occupation
(
  occupationid smallint NOT NULL,
  occupationname character varying(50) NOT NULL,
  CONSTRAINT pk_occupation PRIMARY KEY (occupationid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE occupation
  OWNER TO postgres;

-- Table: currency
CREATE TABLE currency
(
  currencyid integer NOT NULL,
  currencyname character varying(50) NOT NULL,
  CONSTRAINT pk_currency PRIMARY KEY (currencyid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE currency
  OWNER TO postgres;

-- Table: user
CREATE TABLE userdetails
(
  userid bigint NOT NULL,
  firstname character varying(30) NOT NULL,
  lastname character varying(30) NOT NULL,
  mobileno bigint NOT NULL,
  isverifiedmobileno boolean NOT NULL DEFAULT false,
  genderid smallint NOT NULL,
  dateofbirth date NOT NULL,
  addressline1 character varying(100) NOT NULL,
  addressline2 character varying(100),
  placeid bigint NOT NULL,
  pincode integer NOT NULL DEFAULT (-1),
  profilepicturepath character varying(100),
  isdeleted boolean NOT NULL DEFAULT false,
  maritalstatusid smallint NOT NULL,
  height integer,
  familytypeid smallint,
  physicaldisability boolean NOT NULL,
  educationid integer NOT NULL,
  employmentid smallint NOT NULL,
  degreeid smallint NOT NULL,
  occupationid integer NOT NULL,
  income bigint NOT NULL,
  incomecurrencyid integer NOT NULL,
  citizenshipid smallint, 
  worklocation smallint,
  aboutme character varying(1000),
  CONSTRAINT pk_user PRIMARY KEY (userid),
  CONSTRAINT fk_gender FOREIGN KEY (genderid)
      REFERENCES gender (genderid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_place FOREIGN KEY (placeid)
      REFERENCES place (placeid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_maritalstatus FOREIGN KEY (maritalstatusid)
      REFERENCES maritalstatus (maritalstatusid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_familytype FOREIGN KEY (familytypeid)
      REFERENCES familytype (familytypeid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_education FOREIGN KEY (educationid)
      REFERENCES education (courseid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_employment FOREIGN KEY (employmentid)
      REFERENCES employment (employmentid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_degree FOREIGN KEY (degreeid)
      REFERENCES degree (degreeid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_occupation FOREIGN KEY (occupationid)
      REFERENCES occupation (occupationid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_incomecurrency FOREIGN KEY (incomecurrencyid)
      REFERENCES currency (currencyid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_citizenship FOREIGN KEY (citizenshipid)
      REFERENCES country (countryid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_worklocation FOREIGN KEY (worklocation)
      REFERENCES country (countryid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE userdetails
  OWNER TO postgres;


-- Table: usercredentials
CREATE TABLE usercredentials
(
  userid bigint NOT NULL,
  emailid character varying(50) NOT NULL,
  password character varying(100) NOT NULL,
  registeredon timestamp with time zone NOT NULL DEFAULT now(),
  lastloginon timestamp with time zone,
  CONSTRAINT pk_usercredentials PRIMARY KEY (userid),
  CONSTRAINT fk_user FOREIGN KEY (userid)
      REFERENCES userdetails (userid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT uk_usercredentials UNIQUE (emailid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE usercredentials
  OWNER TO postgres;