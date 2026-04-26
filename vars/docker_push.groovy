def call(script, String project, String imageTag, String dockerhubuser) {

    script.withCredentials([
        script.usernamePassword(
            credentialsId: 'dockerHub',
            passwordVariable: 'dockerHubPass',
            usernameVariable: 'dockerHubUser'
        )
    ]) {

        script.sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }

    script.sh "docker push ${dockerhubuser}/${project}:${imageTag}"
}
