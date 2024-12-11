def call(String url)
pipeline {
 agent any
  environment {
    SERVICE_NAME='TEST'
  }
  stages {
    stage('test'){
      steps{
        script{ cloneRepo(url)}
      }
    }
  }
}

def cloneRepo(String url)
{
  echo 'cloneRepo'
}
