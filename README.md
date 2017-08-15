# Deployment Error in WF11

## Steps to reproduce

* Start with a clean Server Install
* Add the following user to the ApplicationRealm :
`${jboss.home.name}/bin/add-user.sh -a -u ejb -p ejb123`
* Run the server in domain mode
* Configure the server :
`${jboss.home.name}/bin/jboss-cli.sh -c --file=install-domain.cli`
* Build the artifacts :
`mvn clean install`
* Deploy :
`${jboss.home.name}/bin/jboss-cli.sh -c --file=deploy-domain.cli`

In Wildfly 10.1.0.Final => OK
In Wildfly 11.0.0.Beta1 => Deployement error 
