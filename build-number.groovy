pipeline {
  agent any
  stages {
    stage('Hello') {
      steps {
        sh 'echo Hello World'
        echo "Build number is ${currentBuild.number}"
        echo "Project Full Name is ${currentBuild.fullProjectName}"
        echo "Project Display Name is ${currentBuild.fullDisplayName}"

      }
    }
  }
}