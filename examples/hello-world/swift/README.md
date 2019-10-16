# hello-world

HelloWorld lambda example.

The folder contains a prebuild lambda in Swift and the aws custom runtime layer.

To know more on how to develop a AWS Lambda in Swift please visit [https://github.com/swift-sprinter/aws-lambda-swift-sprinter]("https://github.com/swift-sprinter/aws-lambda-swift-sprinter-core)

- Use MacOS or Linux
- Install [Docker](https://docs.docker.com/docker-for-mac/install/)
- From command line run `make docker_build`
- From command line run `make package_layer`
- From command line run `make package_lambda`
- Go to `AWS Lambda -> Layers` in AWS Console and create a new layer from scratch
- Enter layer name "swift-lambda-runtime-5-1-1"
- Upload the zip file `build/swift-lambda-runtime-5-1-1.zip`
- Leave "Compatible runtimes" empty.
- Click "Create"
- Copy the `arn` from the created layer, you need it to setup the lambda.
- Go to `AWS Lambda` in AWS Console and create a new function from scratch
- Enter function name "benchmark-swift-hello" and select "Provide your own boostrap" as runtime
- Choose the execution role created above
- Upload the zip file we created as function code you can find under `build/lambda.zip`
- Input "HelloWorld.helloWorld" in "Handler"
- Click "Layers"
- Click "Add Layer"
- Click "Provide a layer version"
- Add the `arn` of the layer you have uploaded previously.
- Click "Add"
- Click "Save"
- Test the function by clicking `Test` in the top right corner
