Petstore API demonstrating CRUD
Implemented with Java on SpringBoot, tested on local server with Postman

Make sure to have Java, SpringBoot, Maven, Postman downloaded. 

To run, clone the respository to local machine and open in an IDE (I used IntelliJ). 
Make sure that dependencies (ie. Maven) are all up and running. 
Run the application and open a new tab in a broswer of your choice.
Navigate to http://localhost:8080/

To READ/GET:
  - http://localhost:8080/getAllPets
  - this will return a list in json format of all the pets in the store
  - there are 5 pets initially hardcoded into the pet store with a list 
  
To POST:
  - http://localhost:8080/pet
  - open Postman and toggle the request to POST
  - in the body, click the "raw" option and add a new pet in json format (make sure that headers are set to "content-type"
    and "application/json"
  - submit request and refresh localhost server to see the new pet added in the store 
  
To PUT:
  - http://localhost:8080/pet/{id}
  - toggle the request to PUT in Postman
  - follow the same steps in POST to update the information in the Pet of your choice and refresh the server to see applied changes 

To DELETE:
  - http://localhost:8080/pet/{id}
  - toggle the request to DELETE in Postman
  - simply send the request and refresh the server to see the pet deleted
