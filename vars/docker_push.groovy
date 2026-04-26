def call(String project, String imageTag) {

    withCredentials([
        usernamePassword(
            credentialsId: 'dockerHub',
            passwordVariable: 'dockerHubPass',
            usernameVariable: 'dockerHubUser'
        )
    ]) {

        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${project}:${imageTag}"
    }
}
