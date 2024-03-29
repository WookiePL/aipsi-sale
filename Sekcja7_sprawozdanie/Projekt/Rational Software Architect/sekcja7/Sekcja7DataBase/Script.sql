--<ScriptOptions statementTerminator=";"/>

CREATE TABLE CLIENT (
		CLIENT_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		USER_ID INTEGER NOT NULL,
		COMPANYCOMPANY_ID INTEGER NOT NULL
	);

CREATE TABLE SYSTEMHISTORY (
		SYSTEMHISTORY_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		USERUSER_ID INTEGER NOT NULL
	);

CREATE TABLE SLA (
		SLA_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		FIRMACOMPANY_ID INTEGER NOT NULL,
		SIGNIFICANCESIGNIFICANCE_ID INTEGER NOT NULL,
		PRIORITYPRIORITY_ID INTEGER NOT NULL
	);

CREATE TABLE DEPARTMENT (
		DEPARTMENT_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1)
	);

CREATE TABLE ATTACHMENT (
		ATTACHMENT_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		TICKETTICKET_ID INTEGER NOT NULL,
		COMMENTCOMMENT_ID INTEGER NOT NULL
	);

CREATE TABLE COMPANY (
		COMPANY_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		DEPARTMENTDEPARTMENT_ID INTEGER NOT NULL
	);

CREATE TABLE PRIORITY (
		PRIORITY_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1)
	);

CREATE TABLE SIGNIFICANCE (
		SIGNIFICANCE_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1)
	);

CREATE TABLE USER (
		USER_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1)
	);

CREATE TABLE EMPLOYEE (
		EMPLOYEE_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		USER_ID INTEGER NOT NULL
	);

CREATE TABLE COMMENT (
		COMMENT_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		TICKETTICKET_ID INTEGER NOT NULL
	);

CREATE TABLE ROLE (
		ROLE_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		EMPLOYEEUSER_ID INTEGER NOT NULL,
		EMPLOYEEEMPLOYEE_ID INTEGER NOT NULL
	);

CREATE TABLE TICKET (
		TICKET_ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY  (START WITH 1 ,INCREMENT BY 1),
		SIGNIFICANCESIGNIFICANCE_ID INTEGER NOT NULL,
		PRIORITYPRIORITY_ID INTEGER NOT NULL,
		CLIENTUSER_ID INTEGER NOT NULL,
		CLIENTCLIENT_ID INTEGER NOT NULL
	);

CREATE TABLE TICKET_X_EMPLOYEE (
		TICKET_ID INTEGER NOT NULL,
		USER_ID INTEGER NOT NULL,
		EMPLOYEE_ID INTEGER NOT NULL
	);

ALTER TABLE ROLE ADD CONSTRAINT ROLE_PK PRIMARY KEY (ROLE_ID);

ALTER TABLE SIGNIFICANCE ADD CONSTRAINT SIGNIFICANCE_PK PRIMARY KEY (SIGNIFICANCE_ID);

ALTER TABLE CLIENT ADD CONSTRAINT CLIENT_PK PRIMARY KEY (USER_ID, CLIENT_ID);

ALTER TABLE TICKET ADD CONSTRAINT TICKET_PK PRIMARY KEY (TICKET_ID);

ALTER TABLE TICKET_X_EMPLOYEE ADD CONSTRAINT TICKET_X_EMPLOYEE_PK PRIMARY KEY (TICKET_ID, USER_ID, EMPLOYEE_ID);

ALTER TABLE ATTACHMENT ADD CONSTRAINT ATTACHMENT_PK PRIMARY KEY (ATTACHMENT_ID);

ALTER TABLE SLA ADD CONSTRAINT SLA_PK PRIMARY KEY (SLA_ID);

ALTER TABLE SYSTEMHISTORY ADD CONSTRAINT SYSTEMHISTORY_PK PRIMARY KEY (SYSTEMHISTORY_ID);

ALTER TABLE DEPARTMENT ADD CONSTRAINT DEPARTMENT_PK PRIMARY KEY (DEPARTMENT_ID);

ALTER TABLE COMPANY ADD CONSTRAINT COMPANY_PK PRIMARY KEY (COMPANY_ID);

ALTER TABLE EMPLOYEE ADD CONSTRAINT EMPLOYEE_PK PRIMARY KEY (USER_ID, EMPLOYEE_ID);

ALTER TABLE COMMENT ADD CONSTRAINT COMMENT_PK PRIMARY KEY (COMMENT_ID);

ALTER TABLE USER ADD CONSTRAINT USER_PK PRIMARY KEY (USER_ID);

ALTER TABLE PRIORITY ADD CONSTRAINT PRIORITY_PK PRIMARY KEY (PRIORITY_ID);

ALTER TABLE TICKET_X_EMPLOYEE ADD CONSTRAINT TICKET_X_E_EMPL_FK FOREIGN KEY (USER_ID, EMPLOYEE_ID)
	REFERENCES EMPLOYEE (USER_ID, EMPLOYEE_ID);

ALTER TABLE CLIENT ADD CONSTRAINT CLIENT_COMPANY_FK FOREIGN KEY (COMPANYCOMPANY_ID)
	REFERENCES COMPANY (COMPANY_ID);

ALTER TABLE TICKET ADD CONSTRAINT TICKET_PRIORITY_FK FOREIGN KEY (PRIORITYPRIORITY_ID)
	REFERENCES PRIORITY (PRIORITY_ID);

ALTER TABLE COMPANY ADD CONSTRAINT COMPA_DEPARTME_FK FOREIGN KEY (DEPARTMENTDEPARTMENT_ID)
	REFERENCES DEPARTMENT (DEPARTMENT_ID);

ALTER TABLE EMPLOYEE ADD CONSTRAINT EMPLOYEE_USER_FK FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID);

ALTER TABLE CLIENT ADD CONSTRAINT CLIENT_USER_FK FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID);

ALTER TABLE TICKET ADD CONSTRAINT TICK_SIGNIFICAN_FK FOREIGN KEY (SIGNIFICANCESIGNIFICANCE_ID)
	REFERENCES SIGNIFICANCE (SIGNIFICANCE_ID);

ALTER TABLE SLA ADD CONSTRAINT SLA_PRIORITY_FK FOREIGN KEY (PRIORITYPRIORITY_ID)
	REFERENCES PRIORITY (PRIORITY_ID);

ALTER TABLE ATTACHMENT ADD CONSTRAINT ATTACHME_COMME_FK FOREIGN KEY (COMMENTCOMMENT_ID)
	REFERENCES COMMENT (COMMENT_ID);

ALTER TABLE SYSTEMHISTORY ADD CONSTRAINT SYSTEMHIST_USER_FK FOREIGN KEY (USERUSER_ID)
	REFERENCES USER (USER_ID);

ALTER TABLE COMMENT ADD CONSTRAINT COMMENT_TICKET_FK FOREIGN KEY (TICKETTICKET_ID)
	REFERENCES TICKET (TICKET_ID);

ALTER TABLE ROLE ADD CONSTRAINT ROLE_EMPLOYEE_FK FOREIGN KEY (EMPLOYEEUSER_ID, EMPLOYEEEMPLOYEE_ID)
	REFERENCES EMPLOYEE (USER_ID, EMPLOYEE_ID);

ALTER TABLE ATTACHMENT ADD CONSTRAINT ATTACHMEN_TICKE_FK FOREIGN KEY (TICKETTICKET_ID)
	REFERENCES TICKET (TICKET_ID);

ALTER TABLE TICKET_X_EMPLOYEE ADD CONSTRAINT TICKET_X_E_TICK_FK FOREIGN KEY (TICKET_ID)
	REFERENCES TICKET (TICKET_ID);

ALTER TABLE SLA ADD CONSTRAINT SLA_COMPANY_FK FOREIGN KEY (FIRMACOMPANY_ID)
	REFERENCES COMPANY (COMPANY_ID);

ALTER TABLE SLA ADD CONSTRAINT SLA_SIGNIFICANC_FK FOREIGN KEY (SIGNIFICANCESIGNIFICANCE_ID)
	REFERENCES SIGNIFICANCE (SIGNIFICANCE_ID);

ALTER TABLE TICKET ADD CONSTRAINT TICKET_CLIENT_FK FOREIGN KEY (CLIENTUSER_ID, CLIENTCLIENT_ID)
	REFERENCES CLIENT (USER_ID, CLIENT_ID);

