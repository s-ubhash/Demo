pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                bat 'ls'
            }
        }
        
        stage('test') {
            steps {
              dir('f') {
                  sh "find . -name '*.l'"
              }
            }
        }
        
        
    }
}
