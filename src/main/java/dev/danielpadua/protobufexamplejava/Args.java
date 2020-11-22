package dev.danielpadua.protobufexamplejava;

import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(names = {"--outputPath", "-o"},
            description = "The output path of customer protobuf file for protobuf-example-csharp read later",
            required = true)
    private String outputPath;

    @Parameter(names = {"--help", "-h"}, help = true)
    private boolean help = false;

    public String getOutputPath() {
        return outputPath;
    }

    public boolean isHelp() {
        return help;
    }
}
