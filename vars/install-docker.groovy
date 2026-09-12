def call(){
  echo 'Installing Docker'
  sh 'sudo apt update'
  sh 'sudo apt install docker.io -y'
  sh 'sudo usermod -aG docker $USER'
  sh 'newgrp docker'
  sh 'sudo systemctl start docker && sudo systemctl enable docker'
}
