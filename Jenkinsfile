def project = "Parallel Test"

pipeline {
    agent any
    tools {
            maven 'apache-maven-3.8.4'
            jdk 'jdk1.8.0_341'
        }

    options{
        timestamps()
    }

    stages{
        stage ('Initialize') {
                    steps {
                        sh '''
                            echo "PATH = ${PATH}"
                            echo "M2_HOME = ${M2_HOME}"
                        '''
                    }
                }

        stage('Build') {
            steps {
                 echo 'Hi, Start testing'
                   }
            }
        stage("Execute Test"){
            steps{
                git 'https://github.com/EkoAgustina/Parallel_Test_in_Jenkins_Pipeline.git'
            script{
                bat(/mvn clean test/)
             }
                }
        }

          stage ('Cucumber Reports') {

                     steps {
                         cucumber buildStatus: "UNSTABLE",
                             fileIncludePattern: "**/cucumber.json",
                             jsonReportDirectory: 'target'

                     }

                 }
          stage('Generate Allure Report'){
                      steps {
                           allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
                     }
          }
    }


}