## Let's start
1.
        mvn clean install
    
2. 
        java - jar target/spring-boot-deployable-1.0-SNAPSHOT.jar
    
3.
        http://127.0.0.1:80/aws-spring-boot/
    
    Or
    PostMan
    
        http://127.0.0.1:80/aws-spring-boot/ 
        With Headers "Accept" = "application/json" OR "application/xml" 
        

##### Hosting is in a AWS EC2 instance and accessing it from outside(anywhere in the world)
1.
    Create EC2 Instance
    
2.
    Configure Security Policy of the EC2 instance(can also be done during instance creation) -
    Allow HTTP and HTTPS Protocol and Any Source of request, it should look something like - 
    
        Port range      Protocol        Source
        80	            TCP	            0.0.0.0/0
        80	            TCP	            ::/0	
        22	            TCP	            0.0.0.0/0	
        22	            TCP	            ::/0	        
        443	            TCP	            0.0.0.0/0	
    
3. Run this Web-Service at Port 80
    Add "server.port=80" in "application.properties" file
    
4. SSH to EC2 instance(see - connect option against EC2 instance in AWS Console/SSH)

5. Install Java and Maven in EC2 instance.

6. Install Git and Clone this Repo inside EC2 instance.
    Build jar -
    
        cd hands-on-aws/java/spring-boot-deployable
    
        mvn clean install
    
    (Or copy an already created jar inside EC2 instance.)
    
7. Run the jar as SUDO
    
        sudo java - jar target/spring-boot-deployable-1.0-SNAPSHOT.jar &
    
8. Access the Web-Service

    Using - http://[Public DNS of CE2]:80/aws-spring-boot/
    
    Example - http://ec2-18-188-137-3.us-east-2.compute.amazonaws.com:80/aws-spring-boot/
    