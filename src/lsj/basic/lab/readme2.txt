1. construct VO (value object) class
declare member variable
definite constructor
setter/getter
toString

2. construct interface
construct methods which have to be built in service class
use prefix such as new, read, readOne, modify, remove based on CRUD

3. construct service class
construct methods related to CRUD by using service interface
service class need to be created as a single object, so include
singleton pattern

4. definition of interface in DAO class
construct methods which have to be built in DAO class
use prefix such as new, read, readOne, modify, remove based on CRUD

5. definition of DAO class
construct methods related to CRUD by using DAO interface
DAO class need to be created as a single object, so include
singleton pattern

6. construct main class
class that contains main method
entry of the program execution

