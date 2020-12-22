
/*Insertion dans la table quality_prefernece*/
alter table quality_preference alter column qualite_preference_id uuid DEFAULT random_uuid();
INSERT INTO quality_preference (label) VALUES ('Bio(AB)');
INSERT INTO quality_preference (label) VALUES ('Equitable (Ecocert, Fairtrade)');
INSERT INTO quality_preference (label) VALUES ('AOP/AOC');
INSERT INTO quality_preference (label) VALUES ('IGT/STG');
INSERT INTO quality_preference (label) VALUES ('Label Rouge');


/*Insertion dans la table origin_preference*/
alter table ORIGIN_PREFERENCE alter column ORIGIN_PREFERENCE_id uuid DEFAULT random_uuid();
INSERT INTO ORIGIN_PREFERENCE (label) VALUES ('Local');
INSERT INTO ORIGIN_PREFERENCE (label) VALUES ('France');
INSERT INTO ORIGIN_PREFERENCE (label) VALUES ('Europe');
INSERT INTO ORIGIN_PREFERENCE (label) VALUES ('Monde');

/*Insertion dans la table alimentary_regime*/
alter table alimentary_regime alter column alimentary_regime_id uuid DEFAULT random_uuid();
INSERT INTO alimentary_regime (label) VALUES ('Omnivore');
INSERT INTO alimentary_regime (label) VALUES ('Végétarien');
INSERT INTO alimentary_regime (label) VALUES ('Végétalien');
INSERT INTO alimentary_regime (label) VALUES ('Flexitarien');
INSERT INTO alimentary_regime (label) VALUES ('Hyperprotéiné');
INSERT INTO alimentary_regime (label) VALUES ('Hypoglucidique');

alter table profile alter column profile_id uuid DEFAULT random_uuid();



