pipeline { 
agent { label 'any'} 
stages { 
stage ('test') { 
steps { 
sh "JAVA_HOME=/usr/lib/jvm/jdk-11-openjdk-amd64 mvn clean compile test" 
} 
}
stage ('Build application') { 
steps { 
sh "JAVA_HOME=/usr/lib/jvm/jdk-11-openjdk-amd64 mvn -f pom.xml clean install -Dmaven.test.skip=true" 
} 
}
stage ('Pasamos a producción') { 
steps { 
echo "Movemos al servidor y lo ponemos en producción"

} 
} 
} 
}
