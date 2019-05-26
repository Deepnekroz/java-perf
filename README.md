# Simple Spring Boot (Java) service
This is a simple Spring Boot service that listens for all requests on port :8080 and prints request path in response body after 200 millis, e.g.:
<br />GET http://localhost:8080/test
<br />Response: `{ "path": "/test" }`
<br />It also exposes prometheus metrics on :9090/actuator/metrics/prometheus.
# Docker image
Docker image is available on hub.docker.com as `deepnekro/java-perf:0.0.5`