pipeline {
    agent any
    stage('Build') {
      steps{
        sh 'echo "Hello World"'
      }
    }
}
