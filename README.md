# java

CREATING JAR FILE
 jar cvf new_name.jar program_name.class

EXECUTING JAR FILE
 java -jar name.jar

jar file should have a manifest that contains a line in the form "Main-Class:classname". store this in MANIFEST.MF.

adding manifest to jar file
 jar cvmf MANIFEST.MF name.jar name.class

execute jar file!

note:packages to be added 
