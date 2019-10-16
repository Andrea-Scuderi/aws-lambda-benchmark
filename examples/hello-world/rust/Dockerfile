FROM rust:latest

RUN rustup target add x86_64-unknown-linux-musl
RUN git clone git://git.musl-libc.org/musl
WORKDIR /src/musl
RUN ./configure && make install
WORKDIR /src
RUN ln -s /usr/local/musl/bin/musl-gcc /usr/local/bin/musl-gcc