1. docker build -f Dockerfile.sample -t my-python-sample .
2. docker build -f Dockerfile.app -t my-python-app .
3. docker images
3. docker run my-python-sample
4. docker run -d -p 5020:5020 --name python-web my-python-app
4. <ip>:5020
