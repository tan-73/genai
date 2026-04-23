```
pipeline {
    agent any

    stages {
        stage('Clone Code') {
            steps {
                echo 'Cloning repository'
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('19th_Exp') {
                    bat 'docker build -t java-grade-app .'
                }
            }
        }

        stage('Stop Old Container') {
            steps {
                bat 'docker stop java-grade-container || exit 0'
                bat 'docker rm   java-grade-container || exit 0'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -t --name java-grade-container java-grade-app'
            }
        }
    }
}
```
