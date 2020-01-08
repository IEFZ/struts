FROM jboss/wildfly:10.0.0.Final
RUN /opt/jboss/wildfly/bin/add-user.sh linux linux666 --silent
ADD standalone.xml /opt/jboss/wildfly/standalone/configuration/
ADD struts1.war /opt/jboss/standalone/deployments/
EXPOSE 8080 9990 8009
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0","-bmanagement", "0.0.0.0", "-c", "standalone.xml"]





