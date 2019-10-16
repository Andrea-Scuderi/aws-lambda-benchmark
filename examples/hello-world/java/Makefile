MOUNT_ROOT=$(shell pwd)
DOCKER_IMAGE=benchmark-java:latest

docker_build:
	docker build --tag $(DOCKER_IMAGE) .

build_lambda:
	docker run \
			-it \
			--rm \
			--volume "$(MOUNT_ROOT)/:/src" \
			--workdir "/src" \
			$(DOCKER_IMAGE) \
			/bin/bash -c "gradle build"
