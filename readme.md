# A REST API with Microprofile and Open Liberty

This is a simple REST API that I developed to help me write an article about the implementation of these technologies.

## How to run

After the repo cloned: `mvn clean package`

and then: `mvn liberty:run`

## How to test

GET  - curl --GET http://localhost:9080/data/persons

POST - curl --request POST --url http://localhost:9080/data/persons --header 'content-type: application/json' --data '{"name":"Name", "email":"example@email.com"}'
