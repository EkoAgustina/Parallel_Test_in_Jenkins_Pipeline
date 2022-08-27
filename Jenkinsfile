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

    }
}