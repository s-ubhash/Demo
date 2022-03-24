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
              }
            }
        }
        
        
    }
}
