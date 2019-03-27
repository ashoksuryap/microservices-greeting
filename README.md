greeting-server- http://localhost:8000/name
greeting-client-  http://localhost:8100/greeting
discovery-service- http://localhost:8761/

Gateway:-----------
gateway-service-service- 8765
http://localhost:8765/greeting-server/name
http://localhost:8765/greeting-client/greeting

http://localhost:8765/api/client/greeting
http://localhost:8765/api/greeting-server/name

Zipkin:----------
http://localhost:9411