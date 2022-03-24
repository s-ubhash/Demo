pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh 'ls *.l'
                bat 'ls -R ../*.l'
            }
        }
    }
}
