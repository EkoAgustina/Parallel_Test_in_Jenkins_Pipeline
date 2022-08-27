pipeline {
    agent any
    environment {
        APPIUM_PORT= 5555
    }
stages {
        stage('Build') {
            steps {
                echo "Building.."
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh "appium --port ${APPIUM_PORT}"

            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying...."
            }
        }
        post {
            always{

                echo "Stop appium server"
                sh "kill \$(lsof -t -i :${APPIUM_PORT})"
            }
            success{

            }
            failure{

            }
            cleanup{

            }
       }
    }
}