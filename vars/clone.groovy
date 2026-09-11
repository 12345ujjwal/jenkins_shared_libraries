def call(String GitUrl, String GitBranch){
  echo "Code clonning started"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "Code Cloning Successfull"
} 
