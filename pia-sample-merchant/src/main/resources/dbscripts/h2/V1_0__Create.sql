
create sequence order_seq start with 1 increment by 1;
create sequence token_seq start with 1 increment by 1;

create table cardtokens (token_id_pk bigint generated by default as identity, 
						name varchar(255) not null, 
						value varchar(255) not null,
						issuer varchar(64),
						expiry_date varchar(6),
						consumer_id_fk varchar(255) not null, 
						primary key (token_id_pk));
						
create table consumers (consumer_id_pk varchar(255) not null, 
						name varchar(255),
						card_verification_subsequent boolean not null default true,
						primary key (consumer_id_pk));
						
create table orders (order_id_pk bigint generated by default as identity, 
					currency varchar(255) not null, 
					total_amount bigint not null, 
					vat_amount bigint not null, 
					payment_state integer, 
					timestamp_created timestamp not null, 
					psp_transaction_id varchar(32) not null,
					method varchar(32),
					consumer_id_fk varchar(255), 
					primary key (order_id_pk));

alter table cardtokens add constraint FK4mq9n9ihg8h9qvl30v2r6pk04 foreign key (consumer_id_fk) references consumers;
alter table orders add constraint FK406316ska3o20euh93ydnp1gx foreign key (consumer_id_fk) references consumers;

