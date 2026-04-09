1. docker --version
2. docker ps
3. docker ps -a
4. docker images

## Task 1
- docker run hello-world

## Task 2
- docker pull nginx
- docker run -d -p 8080:80 nginx
- http://localhost:8080

## Task 3
- docker ps
- docker stop <container_id>
- docker rm <container_id>