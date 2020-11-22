package dev.danielpadua.protobufexamplejava;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {

    private static final Logger LOGGER = Logger.getLogger(Program.class.getName());

    public static void main(String... argv) {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");

        LOGGER.log(Level.INFO, "Starting to generate protobuf customer...");
        Args args = new Args();

        JCommander jc = JCommander.newBuilder()
                .addObject(args)
                .programName("generate-protobuf-file")
                .build();
        try {
            jc.parse(argv);
            if (args.isHelp()) {
                jc.usage();
            } else {
                Application app = new Application(args);
                app.run();
                LOGGER.log(Level.INFO, "Gracefully shutting down application...");
            }
            System.exit(0);
        } catch (ParameterException e) {
            jc.usage();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Fatal error occurred");
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            LOGGER.log(Level.SEVERE, "Exiting application");
        }
        System.exit(1);
    }


}
