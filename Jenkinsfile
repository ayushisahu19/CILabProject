pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Main Branch Pipeline') {
            when {
                branch 'main'
            }
            stages {
                stage('Build') {
                    steps {
                        echo 'Building application for MAIN branch'
                    }
                }
                stage('Test') {
                    steps {
                        echo 'Running full test suite for MAIN branch'
                    }
                }
                stage('Deploy') {
                    steps {
                        echo 'Deploying application from MAIN branch'
                    }
                }
            }
        }

        stage('Feature Branch Pipeline') {
            when {
                expression { env.BRANCH_NAME.startsWith('feature') }
            }
            stages {
                stage('Test') {
                    steps {
                        echo 'Running tests only for FEATURE branch'
                    }
                }
            }
        }

        stage('Release Branch Pipeline') {
            when {
                expression { env.BRANCH_NAME.startsWith('release') }
            }
            stages {
                stage('Test') {
                    steps {
                        echo 'Running tests for RELEASE branch'
                    }
                }
                stage('Security Scan') {
                    steps {
                        echo 'Running security scan for RELEASE branch'
                    }
                }
            }
        }
    }
}
