## Description

This project provides a few maven archetypes by matned. 

## Available archetypes

Simple GWT archetype:<br> a simple gwt project to run in a browser.<br> 
  `DarchetypeArtifactId=simple-gwt`<br>
  `Dmodule=simple-gwt`<br> 

## Usage

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned                
      -DarchetypeArtifactId={artifactName}          
      -DarchetypeVersion=0.1                
      -DgroupId={yourGroupId}                               
      -DartifactId={yourArtifactID}                            
      -Dmodule={moduleName}                                  
      -Dversion={yourVersion}

