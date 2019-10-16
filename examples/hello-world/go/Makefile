MOUNT_ROOT=$(shell pwd)
DOCKER_IMAGE=benchmark-go:latest

docker_build:
	docker build --tag $(DOCKER_IMAGE) .

build_lambda:
	docker run \
			-it \
			--rm \
			--volume "$(MOUNT_ROOT)/:/src" \
			--workdir "/src" \
			$(DOCKER_IMAGE) \
			/bin/bash -c "GOOS=linux GOARCH=amd64 go build hello.go"

package_lambda: build_lambda
	zip -j go.zip hello