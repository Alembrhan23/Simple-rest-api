pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Hello jenkins'
      }
    }

    stage('Deploy') {
      steps {
        echo 'deploy'
        sh '''pipeline {
    agent any

    stages {
        stage(\'Build\') {
            steps {
                sh "/usr/bin/mvn clean install"
            }
        }
    }
}
'''
        }
      }

    }
  }