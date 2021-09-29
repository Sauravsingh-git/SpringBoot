# code for creating rest api with spring boot
  
> steps for creating a spring boot application
>> open the spring [intilizr website](https://start.spring.io/)  
>> configure the details of the project and add the required dependencies  
>> generate the files and extract them to desired location  
> ## open Eclipse  
>> File > import > select import wizard > search maven > existing maven projects > next > browse> finish  
>> build the controller and service layers in the project\

# hosting the spring boot application on heroku
> open [heroku webiste](https://dashboard.heroku.com/apps)
> add > create new app
> type application name and select region
> click on create app
> select a deployement method i.e., Use heroku CLI or connecting to git repository
> search for your git repository and upload the project

* Make sure the java version of your application in openJDK 8 as the heroku uses openJDK by deafult.  
 you can change the version in pom.xml file 
 
 
 Link of the current spring boot application is : [SpringBoot](https://heroku-rest-trail.herokuapp.com/home)
 
> Links for the following api calls 
>> for home page : https://heroku-rest-trail.herokuapp.com/home  
>> for all the courses available : https://heroku-rest-trail.herokuapp.com/courses  
>> for a specific courses with courseId : https://heroku-rest-trail.herokuapp.com/home/courseId  
>> here couseId is not a string but id of a valid course in the courses i.e, 133, 123 etc.
 

