sudo docker build -t lithiumcell/all-docker-images/jenkins-tutorial .

sudo docker tag lithiumcell/all-docker-images/jenkins-tutorial lithiumcell/all-docker-images:jenkins-tutorial-1.1

sudo docker push lithiumcell/all-docker-images:jenkins-tutorial-1.1

sudo docker-compose -f /home/lithium/workspace/jenkins-tutorial/mongo-docker-compose.yaml up
