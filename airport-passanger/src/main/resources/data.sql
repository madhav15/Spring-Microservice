
create table passenger (
	passenger_id int primary key auto_increment,
	passenger_name text,
	seat_details text
) engine = InnoDB;

Insert into passenger (passenger_name, seat_details) values ( "John Doe", "Jet A303");

Insert into passenger (passenger_name, seat_details) values ( "Jack Samuel", "Jet B303");

select * from passenger;