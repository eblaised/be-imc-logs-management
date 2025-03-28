## My project
imc_management_logs is a spring boot project that calculates a user's Imic and provides a recommendation in the event of an alert. The main aim of this application is to integrate log management and visualization with Grafana, Loki and Alloy, in order to better manage our logs.

## Setting up tools

- Create a network
```sh
  docker network create applications-network
```
- Tools instantiation
```sh
  docker compose up -d
```