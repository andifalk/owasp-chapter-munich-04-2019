# Live Coding Demos

Live Coding Demos for OAuth 2.0 & OpenID Connect with Spring Security 5.

This includes the following demos:

* auth-code-demo: Demo client to demonstrate all steps of an authorization code flow
* client: A client application build with spring security 5 that calls the resource server (see next line)
* resource-server: A resource server that can be called by the client application

## Setting up JBoss Keycloak

The binary to install keycloak can be downloaded [here (zip archive)](https://downloads.jboss.org/keycloak/6.0.1/keycloak-6.0.1.zip).
Just extract the contents in a directory of your choice.
Keycloak should be run in standalone mode using default settings (
by executing the scripts _standalone.sh_ or _standalone.bat_ scripts in _bin_ sub directory).

After start of keycloak has finished the admin console is reachable at [http://localhost:8080/auth](http://localhost:8080/auth).

To login into keycloak just use admin/admin as credentials.

