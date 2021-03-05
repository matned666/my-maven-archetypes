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

