pipeline {
    agent any
    properties([
     parameters([
       booleanParam(
         defaultValue: false,
         description: 'isFoo should be false',
         name: 'isFoo'
       ),
       booleanParam(
         defaultValue: true,
         description: 'isBar should be true',
         name: 'isBar'
       ),
     ])
   ])
    stages {
        stage('Printing name') {
            steps {
                script {
                    def name = "${params.NAME}"
                    def gender = "${params.GENDER}"
                    if(gender == "Male") {
                        echo "Mr. $name"    
                    } else {
                        echo "Mrs. $name"
                    }
                }
            }
        }
   }
}
