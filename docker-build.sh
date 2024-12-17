#!/bin/zsh

#docker buildx build --platform=linux/amd64,linux/arm64 -t kimmyungjin/kube-spring-app .
docker buildx build --platform=linux/amd64 -t kimmyungjin/kube-spring-app:2 .