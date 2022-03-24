pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh 'find . -type f -name "*.l"'
            }
        }
    }
}
