## Description

This project provides a very simple maven archetypes to create a simple GWT projects ready to run and code. <br>
For bigger projects I suggest `tbroyer gwt archetypes`:  
https://github.com/tbroyer/gwt-maven-archetypes

## Archetypes

#### empty-gwt-archetype-by-matned 
- simple empty archetype to start coding
<br>

#### gwt-project-with-screen-manager
- like previously a gwt archetype, but this time with ready main menu 
and an easy screens manager
  <br>

#### gwt-project-with-screen-manager-2
- like previously a gwt archetype, but this time the screen manager is refactored and css styles are removed
  <br>

#### spring-rest-base-archetype
- base spring rest application with security and auditory archetype, tests are included all to do is move *.properties to resources folder and fill the application-dev.properties with your database data.
Check with integration tests.
  <br>

    


## Usage
<br>

#### empty gwt project:
-DarchetypeGroupId=eu.mrndesign.matned <br>
-DarchetypeArtifactId=empty-gwt-archetype-by-matned <br>
-DarchetypeVersion=0.1 <br>

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned -DarchetypeArtifactId=empty-gwt-archetype-by-matned -DarchetypeVersion=0.1 -DgroupId={yourGroupId} -DartifactId={yourArtifactID} -Dversion={yourVersion}
<br>
<br>

#### gwt project with screen manager: 
-DarchetypeGroupId=eu.mrndesign.matned <br>
-DarchetypeArtifactId=gwt-project-with-screen-manager <br>
-DarchetypeVersion=0.1 <br>

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned -DarchetypeArtifactId=gwt-project-with-screen-manager -DarchetypeVersion=0.1 -DgroupId={yourGroupId} -DartifactId={yourArtifactID} -Dversion={yourVersion}
<br>
<br>

#### rest spring base project: 
-DarchetypeGroupId=eu.mrndesign.matned <br>
-DarchetypeArtifactId=spring-rest-base-archetype <br>
-DarchetypeVersion=0.1 <br>

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned -DarchetypeArtifactId=spring-rest-base-archetype -DarchetypeVersion=0.1 -DgroupId={yourGroupId} -DartifactId={yourArtifactID} -Dversion={yourVersion}
<br>
<br>

#### gwt project with screen manager extended version: 
-DarchetypeGroupId=eu.mrndesign.matned <br>
-DarchetypeArtifactId=gwt-project-with-screen-manager-2 <br>
-DarchetypeVersion=0.2 <br>

    mvn archetype:generate -DarchetypeGroupId=eu.mrndesign.matned -DarchetypeArtifactId=gwt-project-with-screen-manager-2 -DarchetypeVersion=0.2 -DgroupId={yourGroupId} -DartifactId={yourArtifactID} -Dversion={yourVersion}
<br>
<br>