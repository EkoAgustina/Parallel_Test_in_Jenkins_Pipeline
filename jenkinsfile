def project = "Cucumber and generate Allure Report"

pipeline {
    agent any

    options{
        timestamps()
    }

    stages{

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
    }


}