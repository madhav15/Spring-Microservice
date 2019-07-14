create table passanger_booking (
	booking_id int primary key auto_increment,
	user_id int,
	booking_details text,
	booking_date datetime
) engine = InnoDB;


Insert into passanger_booking (user_id, booking_details, booking_date) values ( 101, "Booking to Canada", "2018-02-04");

Insert into passanger_booking (user_id, booking_details, booking_date) values ( 101, "Booking to Canada 2", "2019-02-04");
