pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clone') {
		    steps {
		        git branch: 'main',
		        url: 'https://github.com/Pratap-Samal/devops-sonarqube-microservice-demo.git'
		    }
		}

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Scan') {
            steps {
                withSonarQubeEnv('sonarqube-server') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Quality Gate') {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t demo-sonar-app .'
            }
        }

    }
}