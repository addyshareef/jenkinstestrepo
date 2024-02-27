pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add build steps here
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test steps here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Add deployment steps here
            }
        }
    }
}
post {
    always{
        body: "See the result of jenkins",
        recipientProviders: [requestor[]],
        subject: "Jenkins pipeline output report",
        to: "adnanshareef707@gmail.com"
    }

    }

