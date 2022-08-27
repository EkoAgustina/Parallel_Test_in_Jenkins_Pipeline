def project = "Parallel Test"

pipeline {
    agent any
    environment {
            APPIUM_PORT= 4723
        }

    stages{

        stage('Build') {
            steps {
                 echo 'Hi, Start testing'
                   }
            }

        stage('Start appium server') {
                    steps {
                        bat 'appium --p ${APPIUM_PORT}'
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

          stage ('Generate Cucumber Report') {

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