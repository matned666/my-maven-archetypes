## Description

This project provides a very simple maven archetype to create a simple GWT project ready to run and code. <br>
For bigger projects I suggest `tbroyer gwt archetypes`:  
https://github.com/tbroyer/gwt-maven-archetypes
## Usage

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned                
      -DarchetypeArtifactId=simple-gwt-archetype-by-matned          
      -DarchetypeVersion=0.1                
      -DgroupId={yourGroupId}                               
      -DartifactId={yourArtifactID}                                                      
      -Dversion={yourVersion}

