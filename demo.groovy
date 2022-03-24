pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('test') {
            steps {
              dir('f') {
                  sh 'find . -name "*.l"'
                  def files = findFiles(glob: "**/*.l") 
                  echo """${files[0].name} ${files[0].path} ${files[0].directory} ${files[0].length} ${files[0].lastModified}""" 
              }
            }
        }
        
        
    }
}
