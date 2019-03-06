# cts-1
CTS-1

## UML
![uml diagram](http://acs.ase.ro/Media/Default/documents/cts/SeminarBoja/Factory%20Singleton.png "UML Diagram")

## Requirements
- (1 pct) implements the classes defined in the UML data diagram given at the seminar
- (1 pct) implements the Banker class to allow the creation of CurrentAccount or SavingsAccount objects; this is done by a method defined in the Banker class that receives the account type as a parameter (use an enumeration type); The IBAN is generated and managed by the Banker class
- (1 pct) in the given class hierarchy identify the class in which it is best to override the toString () method that provides a description of the account (IBAN and balance)
- (1 pct) tests in a separate class in main () the implemented hierarchy by defining a collection (of your choice) containing accounts of both types
- (1 pct) tests transactions between accounts
- (1 pct) using the try-catch mechanism tests operations that generate custom exceptions of the type previously defined
- (1 pct) implements the serialization mechanism and saves the data from the collection into a binary file
- (1 pct) loads the previously saved data into  a new collection that is displayed on the console
- (2 pct) using the data from the collection generates a text report that contains the account data only for a given type received as a parameter from the console

## Solution delivery requirements:
- The solution is uploaded into a .zip file (NOT winrar archives renamed with the .zip extension).
- The archive contains only the Java source directory (eg src for eclipse)
- The solution is developed into a root package named ro.ase.csie.cts.g[group_name] .name1.lastname.firstname (without brackets [])
- The solution is developed individually. Students can exchange ideas but not source code. Solutions that are similar in a ratio greater than 30% will be canceled. At first occurrence the students receive a warning and if the situation repeats then they lose the right to take the exam in the normal session and all their activity at the seminar is canceled (enter the exam with 0)
- Solutions with compilation errors are not considered for evaluation

