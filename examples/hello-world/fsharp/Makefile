MOUNT_ROOT=$(shell pwd)
DOCKER_IMAGE=benchmark-netcore:latest

docker_build:
	docker build --tag $(DOCKER_IMAGE) .

package_lambda:
	docker run \
			-it \
			--rm \
			--volume "$(MOUNT_ROOT)/:/src" \
			--workdir "/src" \
			$(DOCKER_IMAGE) \
			/bin/bash -c "dotnet build && dotnet lambda package -c Release -o ./HelloWorldLambda.zip -f netcoreapp2.1"