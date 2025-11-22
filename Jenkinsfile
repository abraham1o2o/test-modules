pipeline {
    agent any

    tools {
        // Assuming 'maven' is configured in Jenkins Global Tool Configuration
        maven 'maven' 
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
