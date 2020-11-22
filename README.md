# README Localization
- [Português](README_pt.md)

# Goals
This repository is a working example of a java console application that generates a protobuf serialized file using the 
[customer defined contract](src/main/proto/customer.proto) to be later read by the 
[csharp application](https://github.com/danielpadua/protobuf-example-csharp), used to demonstrate protobuf in 
my medium article: [Understanding Protobuf]()

# Prerequisites
- OpenJDK 15

# How to run
1. Clone this project using: `git clone https://github.com/danielpadua/protobuf-example-java`
2. Navigate to the root of the repository: `cd protobuf-example-java`
3. Run the command:
```
./mvnw clean compile exec:java -o ${path}
```
or
```
./mvnw clean compile exec:java --outputPath ${path}
```
where: `${path}` stands for the path of the directory you want the project to generate the file. 
**Do not** include the file name itself, only the full path to the directory.
> **_NOTE:_** If you are using windows, run **`./mvnw.cmd`** instead of `./mvnw`
