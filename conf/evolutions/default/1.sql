-- 
-- Copyright 2012 All rights reserved.
-- 
-- Database Terminology
-- ====================
-- 
-- Term	Meaning						Column
-- ~~~~	~~~~~~~						~~~~~~
-- cid	Customer Id 				customer.id
-- cpid	Customer Provider Id		customer.pid


# --- !Ups

-- ==============================================================================
-- ==============================================================================
-- == BEGIN UPS                                                                ==
-- ==============================================================================
-- ==============================================================================

-- ================
-- == ENUM TYPES ==
-- ================

-- CREATE TYPE login_provider AS ENUM ('facebook','google','twitter','dreamhutinteriors');


-- ==============
-- == CUSTOMER ==
-- ==============

-- customer
-- ========
-- Core Customer information, including Customer login information.

CREATE TABLE customer
(
    id                      BIGSERIAL,
    pid 		    		NUMERIC(21,0) NOT NULL,
    name 	    			VARCHAR(255) NOT NULL,
    email 		    		VARCHAR(255) NULL,
    provider 		    	VARCHAR(255) DEFAULT NULL,
    last_login				TIMESTAMP DEFAULT NULL,
    updated_on 				TIMESTAMP DEFAULT NOW(),
    created_on              TIMESTAMP DEFAULT NULL,
    
    CONSTRAINT pk_customer PRIMARY KEY (id)
);

-- IMPORTANT: The ALTER TABLE commands below must be after the CREATE INDEX commands.

-- =============
-- == INDEXES ==
-- =============

-- customer
CREATE INDEX ix_customer_pid 						ON customer (pid);
CREATE INDEX ix_customer_provider 					ON customer (provider);

# --- !Downs

-- ==============================================================================
-- ==============================================================================
-- == BEGIN DOWNS                                                              ==
-- ==============================================================================
-- ==============================================================================

DROP TABLE IF EXISTS customer 					CASCADE;
