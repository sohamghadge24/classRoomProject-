CREATE TABLE student (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    fname VARCHAR(255),
    lname VARCHAR(255),
    birthday DATE,
    aadhar_Number BIGINT,
    phone_Number BIGINT,
    qualifications VARCHAR(255),
    address VARCHAR(255),
    gender VARCHAR(10),
    email VARCHAR(255),
    password VARCHAR(255)
);
INSERT INTO student (fname, lname, birthday, aadhar_Number, phone_Number, qualifications, address, gender, email, password)
VALUES 
    ('John', 'Doe', '2000-05-15', 123456789012, 1234567890, 'High School Diploma', '123 Main St, City', 'Male', 'john.doe@example.com', 'password123'),
    ('Alice', 'Smith', '2001-08-20',987654321098, 9876543210, 'Bachelor of Science', '456 Elm St, Town', 'Female', 'alice.smith@example.com', 'securepassword'),
    ('Bob', 'Johnson', '2002-03-10',876543210987, 8765432109, 'High School Diploma', '789 Oak St, Village', 'Male', 'bob.johnson@example.com', 'pass123word'),
    ('Eva', 'Davis', '2000-12-05', 765432109876, 7654321098, 'Bachelor of Arts', '321 Pine St, Countryside', 'Female', 'eva.davis@example.com', 'studentpass'),
    ('Michael', 'Brown', '2001-10-25',654321098765, 6543210987, 'Associate Degree', '654 Cedar St, Suburb', 'Male', 'michael.brown@example.com', 'password456'),
    ('Sophia', 'Wilson', '2002-07-15',543210987654, 5432109876, 'High School Diploma', '987 Maple St, Coastal', 'Female', 'sophia.wilson@example.com', 'securepass321'),
    ('David', 'Lee', '2000-09-30',432109876543, 4321098765, 'Bachelor of Engineering', '741 Birch St, Mountain', 'Male', 'david.lee@example.com', 'passpasspass'),
    ('Emma', 'White', '2001-04-12',321098765432, 3210987654, 'Bachelor of Commerce', '852 Walnut St, Valley', 'Female', 'emma.white@example.com', 'password789'),
    ('Daniel', 'Harris', '2002-01-03',210987654321, 2109876543, 'High School Diploma', '963 Cherry St, River', 'Male', 'daniel.harris@example.com', 'student123'),
    ('Olivia', 'Miller', '2000-11-18',109876543210, 1098765432, 'Associate Degree', '159 Spruce St, Lakeside', 'Female', 'olivia.miller@example.com', 'passpasspass');

    
    
    -- Create table for teachers
CREATE TABLE teachers (
    teacher_id INT PRIMARY KEY,
    name VARCHAR(100),
    subject VARCHAR(100)
);

-- Insert example data for teachers
INSERT INTO teachers (teacher_id, name, subject)
VALUES
    (1, 'John Smith', 'Mathematics'),
    (2, 'Emma Johnson', 'Physics'),
    (3, 'Michael Brown', 'History'),
    (4, 'Sarah Lee', 'Biology'),
    (5, 'David Miller', 'Chemistry'),
    (6, 'Emily Davis', 'English'),
    (7, 'Daniel Wilson', 'Computer Science'),
    (8, 'Olivia Taylor', 'Art'),
    (9, 'James Martinez', 'Geography'),
    (10, 'Sophia Anderson', 'Music');
 
    -- Create table for admins
CREATE TABLE admins (
    admin_id INT PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(100)
);

-- Insert example data for admins
INSERT INTO admins (admin_id, name, role)
VALUES
    (1, 'Admin1', 'System Administrator'),
    (2, 'Admin2', 'Database Administrator');
