def call(String url, String branch){
  echo "This is clonning the repository"
  git url: "${url}", branch: "${branch}"
  echo "Code clone successfully"
}
