def loadValuesYaml(x){
  def valuesYaml = readYaml (file: './f/a.yaml')
  return valuesYaml[x];
}

pipeline {
  agent any
  environment {
    APP=loadValuesYaml('appName')
    REPLICACOUNT=loadValuesYaml('replicaCount')
  }
  stages {
    stage('CICD Initialize') {
      steps {
        script{
          println APP
          println REPLICACOUNT
        }
      }
    }
  }
}
