MOUNT_ROOT=$(shell pwd)
DOCKER_IMAGE=benchmark-node:latest

docker_build:
	docker build --tag $(DOCKER_IMAGE) .

docker_bash:
	docker run \
			-it \
			--rm \
			--volume "$(MOUNT_ROOT)/:/src" \
			--workdir "/src" \
			$(DOCKER_IMAGE) \
			/bin/bash
