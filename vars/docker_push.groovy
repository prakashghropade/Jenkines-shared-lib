def call(String Project, String ImageTag, String dockerhubuser){
    withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }

  sh  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
