pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                echo 'Building the application...'
            }
        }

        stage("Test") {
            when {
                expression {
                    env.BRANCH_NAME == 'origin'
                }
            }
            steps {
                echo 'Testing the application...'
            }
        }

        stage("Deploy") {
            steps {
                echo 'Deploying the application...'
            }
        }
    }

    post {
        always {

        }
    }
}