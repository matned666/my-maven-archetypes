## Description

This project provides a very simple maven archetypes to create a simple GWT projects ready to run and code. <br>
For bigger projects I suggest `tbroyer gwt archetypes`:  
https://github.com/tbroyer/gwt-maven-archetypes

## Archetypes

empty-gwt-archetype-by-matned <br>
- simple empty archetype to start coding
    
    
gwt-project-with-screen-manager
- like previously a gwt archetype, but this time with ready main menu 
and an easy screens manager
    

spring-rest-base-archetype
- base spring rest application with security and auditory archetype, tests are included all to do is move *.properties to resources folder and fill the application-dev.properties with your database data.
Check with integration tests.

    


## Usage
for empty gwt project:

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned                
      -DarchetypeArtifactId=empty-gwt-archetype-by-matned          
      -DarchetypeVersion=0.1                
      -DgroupId={yourGroupId}                               
      -DartifactId={yourArtifactID}                                                      
      -Dversion={yourVersion}


for gwt project with screen manager:

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned                
      -DarchetypeArtifactId=gwt-project-with-screen-manager          
      -DarchetypeVersion=0.1                
      -DgroupId={yourGroupId}                               
      -DartifactId={yourArtifactID}                                                      
      -Dversion={yourVersion}


for rest spring base project:

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned                
      -DarchetypeArtifactId=spring-rest-base-archetype          
      -DarchetypeVersion=0.1                
      -DgroupId={yourGroupId}                               
      -DartifactId={yourArtifactID}                                                      
      -Dversion={yourVersion}

