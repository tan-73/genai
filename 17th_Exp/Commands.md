## Task 1
1. docker run -d nginx
2. docker run -d -p 8080:80 nginx

## Task 2
1. docker volume create myvolume
2. docker volume ls
3. docker run -it -v myvolume:/data ubuntu bash
4. cd /data
5. echo "Docker Volume Persistence Test" > test.txt
6. exit
7. docker run -it -v myvolume:/data ubuntu bash
8. cat /data/test.txt

## Task 3
1. docker run -d -p 8081:80 -v myvolume:/usr/share/nginx/html nginx
2. docker run -it -v myvolume:/data ubuntu bash
3. echo "<h1>Persistent Web Page</h1>" > /data/index.html
4. exit
5. docker volume inspect myvolume