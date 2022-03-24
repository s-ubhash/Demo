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
                  script{
                    def files = findFiles(glob: "**/*.yaml") 
                    echo """${files[0].name} ${files[0].path} ${files[0].directory} ${files[0].length} ${files[0].lastModified}""" 
                    for (int i = 0; i < files.size(); i++) {
                      def filename = files[i]
                      echo "${filename}"
                      data = readYaml file: "${filename}" 
                      scan_path = data[scan_path]
                        scan_path.each { e ->
                echo "Translating ${e.getAt('application')} application 
${e.getAt('path')}"
} 
                    }
                      
                  }
              }
            }
        }
        
        
    }
}
