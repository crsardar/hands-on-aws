# hands-on-aws
Hands on AWS: Amazon Web Services

1. Create a AWS EC2 instance 
    Download and save the key file.

2. Open terminal and go to where the .pem (key) is saved
    chmod 400 my-key.pem
    
3. Open AWS console > Instances > Click on Instance Id > Connect > SSH 
    Copy it and run in terminal
    
### Routing Requests to AWS EC2 Instances 
1. Create an EC2 Instance and host Web-Service/Web-App in that instance.

    Refer - https://github.com/crsardar/hands-on-aws/tree/main/java/spring-boot-deployable
    
    #### Note : Configuration of the "Security Policy of the EC2 instance", as mentioned in above link. 
    
2. Go to "Route 53" - https://console.aws.amazon.com/route53

    i. Create hosted zone :
    
    Hosted Zone > Create hosted zone
        
        Enter domain name, without www.
            Like - crsardar.com
            
        Description is optional.
        
        Type = Public hosted zone
        
        Create hosted zone
         
    ii. Create Record One :
    
    Select the Hosted zone created above > Create record > Simple routing >
    Define simple record >
        
        Record name : Keep it EMPTY
        
        Value/Route traffic to : Select "IP address or another value depending on the type"
        In value field enter the "Public IPv4 address" of the CE2 instance where traffic should be diverted
        
        Record type = Select "A - Routes traffic to an IPv4 address and some AWS resources"
        
        TTL : Leave it default.
        
        Define simple record
        
        Select the Record name
        
        Create record
        
    ii. Create Record Two :
        
        Select the Hosted zone created above > Create record > Simple routing >
        Define simple record >
            
            Record name : www
            
            Value/Route traffic to : Select "IP address or another value depending on the type"
            In value field enter the NAME OF YOUR DOMAIN. 
            Eithout www 
            Like - crsardar.com
                        
            Record type = Select "CNAME - Routes traffic to another domain name and some AWS resource"
            
            TTL : Leave it default.
            
            Define simple record
            
            Select the Record name
            
            Create record
            
3. Update Nameservers into to Domain Provider Records.

    Like GoDaddy > My Products > Target Domain > Manage DNS > Nameservers > Change/Add >
        
    From "Route 53's Hosted zone" take all vales of "Value/Route traffic to" 
    where "Type" is "NS" and add those as "Nameserver"(in GoDaddy).
    
    Save.
   
All is done.
After few minutes try - www.your-doamin-name.domain
Like - www.crsardar.com 