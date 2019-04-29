# Live Coding Demos

Live Coding Demo for OAuth 2.0 & OpenID Connect with Spring Security 5.

## Setting up JBoss Keycloak

The binary to install keycloak can be downloaded [here (zip archive)](https://downloads.jboss.org/keycloak/6.0.1/keycloak-6.0.1.zip).
Just extract the contents in a directory of your choice.
Keycloak should be run in standalone mode using default 
settings (_standalone.sh_ or _standalone.bat_ scripts in _bin_ sub directory).

After start of keycloak has finished the admin console is reachable at [http://localhost:8080/auth](http://localhost:8080/auth).

This demo app requires the following configuration in keycloak:

### Users

* username=bwayne, email=bruce.wayne@example.com, password=wayne, scope=user
* username=ckent, email=clark.kent@example.com, password=kent, scope=admin

### Client

* client-id: hello-world
* client-secret: --> will be generated
* consent required: enabled
* access-type: confidential
* redirect-uri: http://localhost:9090/hello-client/login/oauth2/code/keycloak
* web origins: http://localhost:9090
* standard flow: enabled
* direct access grant: enabled
* service accounts: enabled

## Resource Server

The resource server provides two REST API endpoints:

* [localhost:9091/hello-server/hello-user](http://localhost:9091/hello-server/hello-user)
* [localhost:9091/hello-server/hello-admin](http://localhost:9091/hello-server/hello-admin)

Both endpoints are secured and require a JWT access token being transmitted as bearer token header.
The first endpoint requires the 'user' or 'admin' scope, the second endpoint is only accessible for 'admin' scope.  

## Client

The client is reachable at [localhost:9090/hello-client](http://localhost:9090/hello-client)
