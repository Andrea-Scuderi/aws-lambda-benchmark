MOUNT_ROOT=$(shell pwd)
DOCKER_IMAGE=benchmark-rust:latest

docker_build:
	docker build --tag $(DOCKER_IMAGE) .

build_lambda:
	docker run \
			-it \
			--rm \
			--volume "$(MOUNT_ROOT)/:/src" \
			--workdir "/src" \
			$(DOCKER_IMAGE) \
			/bin/bash -c "cargo build --release --target x86_64-unknown-linux-musl"

package_lambda: build_lambda
	zip -j rust.zip ./target/x86_64-unknown-linux-musl/release/bootstrap