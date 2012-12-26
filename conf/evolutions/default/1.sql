-- 
-- Copyright 2012 All rights reserved.
-- 
-- Database Terminology
-- ====================
-- 
-- Term	Meaning					Column
-- ~~~~	~~~~~~~					~~~~~~
-- uid	User Id 				account.id
-- upid	User Provider Id		account.provider_id


# --- !Ups

-- ==============================================================================
-- ==============================================================================
-- == BEGIN UPS                                                                ==
-- ==============================================================================
-- ==============================================================================

-- ================
-- == ENUM TYPES ==
-- ================

-- CREATE TYPE login_provider AS ENUM ('facebook','google','twitter','delixus');


-- ==============
-- == ACCOUNTS ==
-- ==============

-- account
-- ========
-- Core User information, including User login information. Users use the Shopping List UI. This 
-- table cannot be named User b/c User is a reserved keyword in Postgresql.

CREATE TABLE account
(
    id                      BIGSERIAL,
    provider_id		    	NUMERIC(21,0) NOT NULL,
    display_name 	    	VARCHAR(255) NOT NULL,
    email 		    		VARCHAR(255) NULL,
    provider 		    	VARCHAR(255) DEFAULT NULL,
    approved 				BOOLEAN DEFAULT FALSE,
    used_free_exam			BOOLEAN DEFAULT FALSE,
    last_login				TIMESTAMP DEFAULT NULL,
    updated_on 				TIMESTAMP DEFAULT NOW(),
    created_on              TIMESTAMP DEFAULT NULL,
    
    CONSTRAINT pk_account PRIMARY KEY (id)
);


-- ===========
-- == EXAMS ==
-- ===========

-- Each Exam has it's own table for storing user results since:
-- a.) there are a limited number of exams
-- b.) the use of separate tables will improve DB performance, and 
-- c.) this provides a first level of sharding


-- == Exam Tracker
-- ~~~~~~~~~~~~~~~~~~~~~~~~~
-- Exam Tracker allows us to keep track of how many times a student has attempted 
-- a particular exam, how many total correct answers they had, and when they started / completed
-- the exam. Exam Number is the index of the exam, such as subject_e010 is exam_number = 1.
-- attempt is the count of the number of times that the student has taken the exam. We use
-- attempt to keep track of how a student's score improves each time they take the exam.

CREATE TABLE tracker
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	subject					VARCHAR(256),
	exam_number				SMALLINT,
	attempt					SMALLINT,
	total_correct			SMALLINT,
	total_score				NUMERIC(6,2),
	score_percent			NUMERIC(6,2),
	start_time				TIMESTAMP DEFAULT NULL,
	end_time				TIMESTAMP DEFAULT NULL,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_tracker PRIMARY KEY (id)
);


-- == BIOLOGY EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~

-- Biology Exam 005
-- ================

CREATE TABLE biology_e005
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e005 PRIMARY KEY (id)
);

-- Biology Exam 006
-- ================

CREATE TABLE biology_e006
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e006 PRIMARY KEY (id)
);

-- Biology Exam 007
-- ================

CREATE TABLE biology_e007
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e007 PRIMARY KEY (id)
);

-- Biology Exam 008
-- ================

CREATE TABLE biology_e008
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e008 PRIMARY KEY (id)
);

-- Biology Exam 009
-- ================

CREATE TABLE biology_e009
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e009 PRIMARY KEY (id)
);

-- Biology Exam 010
-- ================

CREATE TABLE biology_e010
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e010 PRIMARY KEY (id)
);


-- Biology Exam 011
-- ================

CREATE TABLE biology_e011
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e011 PRIMARY KEY (id)
);


-- Biology Exam 012
-- ================

CREATE TABLE biology_e012
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_biology_e012 PRIMARY KEY (id)
);


-- == CHEMISTRY EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~~~

-- Chemistry Exam 009
-- ==================

CREATE TABLE chemistry_e009
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_chemistry_e009 PRIMARY KEY (id)
);

-- Chemistry Exam 010
-- ==================

CREATE TABLE chemistry_e010
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_chemistry_e010 PRIMARY KEY (id)
);


-- Chemistry Exam 011
-- ==================

CREATE TABLE chemistry_e011
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_chemistry_e011 PRIMARY KEY (id)
);


-- Chemistry Exam 012
-- ==================

CREATE TABLE chemistry_e012
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_chemistry_e012 PRIMARY KEY (id)
);


-- == MATH EXAMS ==
-- ~~~~~~~~~~~~~~~~

-- Math Exam 010
-- =============

CREATE TABLE math_e010
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_math_e010 PRIMARY KEY (id)
);


-- Math Exam 011
-- =============

CREATE TABLE math_e011
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_math_e011 PRIMARY KEY (id)
);


-- Math Exam 012
-- =============

CREATE TABLE math_e012
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_math_e012 PRIMARY KEY (id)
);


-- == Physics EXAMS ==
-- ~~~~~~~~~~~~~~~~

-- Physics Exam 009
-- ================

CREATE TABLE physics_e009
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_physics_e009 PRIMARY KEY (id)
);

-- Physics Exam 010
-- ================

CREATE TABLE physics_e010
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_physics_e010 PRIMARY KEY (id)
);


-- Physics Exam 011
-- ================

CREATE TABLE physics_e011
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_physics_e011 PRIMARY KEY (id)
);


-- Physics Exam 012
-- ================

CREATE TABLE physics_e012
(
	id                      BIGSERIAL,
	account_id				BIGINT NOT NULL,
	tracker_id				BIGINT NOT NULL,
	qid						VARCHAR(2000),
	answer					VARCHAR(2000),
	correct					BOOLEAN,
	updated_on 				TIMESTAMP DEFAULT NOW(),
	
	CONSTRAINT pk_physics_e012 PRIMARY KEY (id)
);


-- ===========================
-- == METRICS AND REPORTING ==
-- ===========================

-- Average Score per Exam
-- ======================
-- This is a temporary table until we get a genuine BI solution with Mondrian implemented
CREATE TABLE rpt_exam_average_score
(
	id                      BIGSERIAL,
	subject					VARCHAR(256),
	exam_number				SMALLINT,
	average_score			NUMERIC(6,2),
	average_percent     	NUMERIC(6,2),
	
	CONSTRAINT pk_rpt_exam_average_score PRIMARY KEY (id)
);


-- Correct Answers per Question 
-- ============================ 
-- Count of the total number of people who tried to answer a Question, a count of how many times
-- the Question was answered correctly, and a percentage of the correct answers for each question.
CREATE TABLE rpt_correct_answers_per_question
(
	id                      BIGSERIAL,
	subject					VARCHAR(256),
	exam_number				SMALLINT,
	qid						VARCHAR(2000),
	total_completes			BIGINT,
	total_correct			BIGINT,
	percentage_correct		NUMERIC(6,2),
	
	CONSTRAINT pk_rpt_correct_answers_per_question PRIMARY KEY (id)
);

-- IMPORTANT: The ALTER TABLE commands below must be after the CREATE INDEX commands.

-- =============
-- == INDEXES ==
-- =============

-- account
CREATE INDEX ix_account_provider_id 				ON account (provider_id);
CREATE INDEX ix_account_provider 					ON account (provider);

-- tracker
CREATE INDEX tracker_account_id						ON tracker (account_id);
CREATE INDEX tracker_exam_number					ON tracker (exam_number);

-- == BIOLOGY EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~

-- biology_e005
CREATE INDEX biology_e005_account_id				ON biology_e005 (account_id);
CREATE INDEX biology_e005_tracker_id				ON biology_e005 (tracker_id);

-- biology_e006
CREATE INDEX biology_e006_account_id				ON biology_e006 (account_id);
CREATE INDEX biology_e006_tracker_id				ON biology_e006 (tracker_id);

-- biology_e007
CREATE INDEX biology_e007_account_id				ON biology_e007 (account_id);
CREATE INDEX biology_e007_tracker_id				ON biology_e007 (tracker_id);

-- biology_e008
CREATE INDEX biology_e008_account_id				ON biology_e008 (account_id);
CREATE INDEX biology_e008_tracker_id				ON biology_e008 (tracker_id);

-- biology_e009
CREATE INDEX biology_e009_account_id				ON biology_e009 (account_id);
CREATE INDEX biology_e009_tracker_id				ON biology_e009 (tracker_id);

-- biology_e010
CREATE INDEX biology_e010_account_id				ON biology_e010 (account_id);
CREATE INDEX biology_e010_tracker_id				ON biology_e010 (tracker_id);

-- biology_e011
CREATE INDEX biology_e011_account_id				ON biology_e011 (account_id);
CREATE INDEX biology_e011_tracker_id				ON biology_e011 (tracker_id);

-- biology_e012
CREATE INDEX biology_e012_account_id				ON biology_e012 (account_id);
CREATE INDEX biology_e012_tracker_id				ON biology_e012 (tracker_id);


-- == CHEMISTRY EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~~~

-- chemistry_e009
CREATE INDEX chemistry_e009_account_id				ON chemistry_e009 (account_id);
CREATE INDEX chemistry_e009_tracker_id				ON chemistry_e009 (tracker_id);

-- chemistry_e010
CREATE INDEX chemistry_e010_account_id				ON chemistry_e010 (account_id);
CREATE INDEX chemistry_e010_tracker_id				ON chemistry_e010 (tracker_id);

-- chemistry_e011
CREATE INDEX chemistry_e011_account_id				ON chemistry_e011 (account_id);
CREATE INDEX chemistry_e011_tracker_id				ON chemistry_e011 (tracker_id);

-- chemistry_e012
CREATE INDEX chemistry_e012_account_id				ON chemistry_e012 (account_id);
CREATE INDEX chemistry_e012_tracker_id				ON chemistry_e012 (tracker_id);


-- == MATH EXAMS ==
-- ~~~~~~~~~~~~~~~~

-- math_e010
CREATE INDEX math_e010_account_id				ON math_e010 (account_id);
CREATE INDEX math_e010_tracker_id				ON math_e010 (tracker_id);

-- math_e011
CREATE INDEX math_e011_account_id				ON math_e011 (account_id);
CREATE INDEX math_e011_tracker_id				ON math_e011 (tracker_id);

-- math_e012
CREATE INDEX math_e012_account_id				ON math_e012 (account_id);
CREATE INDEX math_e012_tracker_id				ON math_e012 (tracker_id);


-- == PHYSICS EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~

-- physics_e009
CREATE INDEX physics_e009_account_id				ON physics_e009 (account_id);
CREATE INDEX physics_e009_tracker_id				ON physics_e009 (tracker_id);

-- physics_e010
CREATE INDEX physics_e010_account_id				ON physics_e010 (account_id);
CREATE INDEX physics_e010_tracker_id				ON physics_e010 (tracker_id);

-- physics_e011
CREATE INDEX physics_e011_account_id				ON physics_e011 (account_id);
CREATE INDEX physics_e011_tracker_id				ON physics_e011 (tracker_id);

-- physics_e012
CREATE INDEX physics_e012_account_id				ON physics_e012 (account_id);
CREATE INDEX physics_e012_tracker_id				ON physics_e012 (tracker_id);


-- ==================
-- == FOREIGN KEYS ==
-- ==================

-- CASCADE: when a referenced row is deleted, row(s) referencing it will be automatically deleted as well
-- RESTRICT: prevents deletion of a referenced row

-- == TRACKER ==
-- ~~~~~~~~~~~~~~~~

-- tracker
ALTER TABLE tracker			ADD CONSTRAINT fk_tracker_account_id		FOREIGN KEY (account_id)	REFERENCES account (id)		ON DELETE CASCADE ON UPDATE RESTRICT;


-- == BIOLOGY EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~

-- biology_e005
ALTER TABLE biology_e005		ADD CONSTRAINT fk_biology_e005_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e005		ADD CONSTRAINT fk_biology_e005_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e006
ALTER TABLE biology_e006		ADD CONSTRAINT fk_biology_e006_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e006		ADD CONSTRAINT fk_biology_e006_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e007
ALTER TABLE biology_e007		ADD CONSTRAINT fk_biology_e007_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e007		ADD CONSTRAINT fk_biology_e007_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e008
ALTER TABLE biology_e008		ADD CONSTRAINT fk_biology_e008_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e008		ADD CONSTRAINT fk_biology_e008_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e009
ALTER TABLE biology_e009		ADD CONSTRAINT fk_biology_e009_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e009		ADD CONSTRAINT fk_biology_e009_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e010
ALTER TABLE biology_e010		ADD CONSTRAINT fk_biology_e010_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e010		ADD CONSTRAINT fk_biology_e010_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e011
ALTER TABLE biology_e011		ADD CONSTRAINT fk_biology_e011_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e011		ADD CONSTRAINT fk_biology_e011_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- biology_e012
ALTER TABLE biology_e012		ADD CONSTRAINT fk_biology_e012_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE biology_e012		ADD CONSTRAINT fk_biology_e012_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;


-- == CHEMISTRY EXAMS ==
-- ~~~~~~~~~~~~~~~~~~~~~

-- chemistry_e009
ALTER TABLE chemistry_e009		ADD CONSTRAINT fk_chemistry_e009_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE chemistry_e009		ADD CONSTRAINT fk_chemistry_e009_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- chemistry_e010
ALTER TABLE chemistry_e010		ADD CONSTRAINT fk_chemistry_e010_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE chemistry_e010		ADD CONSTRAINT fk_chemistry_e010_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- chemistry_e011
ALTER TABLE chemistry_e011		ADD CONSTRAINT fk_chemistry_e011_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE chemistry_e011		ADD CONSTRAINT fk_chemistry_e011_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- chemistry_e012
ALTER TABLE chemistry_e012		ADD CONSTRAINT fk_chemistry_e012_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE chemistry_e012		ADD CONSTRAINT fk_chemistry_e012_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;


-- == MATH EXAMS ==
-- ~~~~~~~~~~~~~~~~

-- math_e010
ALTER TABLE math_e010		ADD CONSTRAINT fk_math_e010_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE math_e010		ADD CONSTRAINT fk_math_e010_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- math_e011
ALTER TABLE math_e011		ADD CONSTRAINT fk_math_e011_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE math_e011		ADD CONSTRAINT fk_math_e011_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- math_e012
ALTER TABLE math_e012		ADD CONSTRAINT fk_math_e012_account_id		FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE math_e012		ADD CONSTRAINT fk_math_e012_tracker_id		FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;


-- == PHYSICS EXAMS ==
-- ~~~~~~~~~~~~~~~~

-- physics_e009
ALTER TABLE physics_e009	ADD CONSTRAINT fk_physics_e009_account_id	FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE physics_e009	ADD CONSTRAINT fk_physics_e009_tracker_id	FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- physics_e010
ALTER TABLE physics_e010	ADD CONSTRAINT fk_physics_e010_account_id	FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE physics_e010	ADD CONSTRAINT fk_physics_e010_tracker_id	FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- physics_e011
ALTER TABLE physics_e011	ADD CONSTRAINT fk_physics_e011_account_id	FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE physics_e011	ADD CONSTRAINT fk_physics_e011_tracker_id	FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

-- physics_e012
ALTER TABLE physics_e012	ADD CONSTRAINT fk_physics_e012_account_id	FOREIGN KEY (account_id)	REFERENCES	account (id)	ON DELETE CASCADE ON UPDATE RESTRICT;
ALTER TABLE physics_e012	ADD CONSTRAINT fk_physics_e012_tracker_id	FOREIGN KEY (tracker_id)	REFERENCES	tracker (id)	ON DELETE CASCADE ON UPDATE RESTRICT;

# --- !Downs

-- ==============================================================================
-- ==============================================================================
-- == BEGIN DOWNS                                                              ==
-- ==============================================================================
-- ==============================================================================

DROP TABLE IF EXISTS biology_e005 				CASCADE;
DROP TABLE IF EXISTS biology_e006 				CASCADE;
DROP TABLE IF EXISTS biology_e007 				CASCADE;
DROP TABLE IF EXISTS biology_e008 				CASCADE;
DROP TABLE IF EXISTS biology_e009 				CASCADE;
DROP TABLE IF EXISTS biology_e010 				CASCADE;
DROP TABLE IF EXISTS biology_e011 				CASCADE;
DROP TABLE IF EXISTS biology_e012 				CASCADE;
DROP TABLE IF EXISTS chemistry_e009 			CASCADE;
DROP TABLE IF EXISTS chemistry_e010 			CASCADE;
DROP TABLE IF EXISTS chemistry_e011 			CASCADE;
DROP TABLE IF EXISTS chemistry_e012 			CASCADE;
DROP TABLE IF EXISTS math_e010 					CASCADE;
DROP TABLE IF EXISTS math_e011 					CASCADE;
DROP TABLE IF EXISTS math_e012 					CASCADE;
DROP TABLE IF EXISTS tracker					CASCADE;
DROP TABLE IF EXISTS physics_e009 				CASCADE;
DROP TABLE IF EXISTS physics_e010 				CASCADE;
DROP TABLE IF EXISTS physics_e011 				CASCADE;
DROP TABLE IF EXISTS physics_e012 				CASCADE;
DROP TABLE IF EXISTS account 					CASCADE;
