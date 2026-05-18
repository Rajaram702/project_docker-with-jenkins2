FROM tomcat:10.1-jdk17
COPY target/next_project_3.0.war /usr/local/tomcat/webapps/
