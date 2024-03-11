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
                // Use tool syntax to reference Maven directly in the sh step
                sh "tool name: \'Maven\', type: \'maven\' mvn clean install"
            }
        }
    }
}
'''
        }
      }

    }
  }