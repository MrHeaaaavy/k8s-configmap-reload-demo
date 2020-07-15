## Spring Cloud Kubernetes Configmap Reload Demo

- Clone project
- kubectl create configmap k8s-configmap-reload-demo --from-file=src/main/resources/application.properties
- mvn spring-boot:run
- curl http://localhost:8080/hello -> Hello World!
- kubectl edit configmap k8s-configmap-reload-demo
- curl http://localhost:8080/hello -> (The new message you typed.)