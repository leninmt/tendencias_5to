image:
        @ docker build -f Dockerfile -t quinto_b:1 .
volume:
        @ docker volume create pg_tendencia_data
network:
        @ docker network rm desarrollo_net
        @ docker network create --driver overlay --scope swarm desarrollo_net || true
deploy:
        @ docker stack deploy --with-registry-auth -c stack.yml instituto

rm:
        @ docker stack rm instituto
        @ docker volume rm  pg_tendencia_data
        @ docker network rm desarrollo_net
