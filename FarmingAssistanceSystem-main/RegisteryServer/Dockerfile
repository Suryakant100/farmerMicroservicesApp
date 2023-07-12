FROM openjdk:11

#Copying jar file from build/libs to root directory and with name
COPY  build/libs/RegisteryServer-0.0.1-SNAPSHOT.jar /RegisteryServer-0.0.1-SNAPSHOT.jar

# Run the web service on container startup.
CMD java -jar RegisteryServer-0.0.1-SNAPSHOT.jar