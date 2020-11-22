package dev.danielpadua.protobufexamplejava;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.type.Date;
import com.google.type.Money;
import dev.danielpadua.protobufexamplejava.contracts.Customer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static Logger LOGGER = Logger.getLogger(Application.class.getName());

    private final Args args;

    public Application(Args args) {
        this.args = args;
    }

    public void run() throws IOException {
        Date birthdate = Utils.toGoogleDate(LocalDate.of(1990, 4, 30));
        Money balance = Utils.toGoogleMoney(BigDecimal.valueOf(9000.53));
        Timestamp createdUpdateAt = Utils.toGoogleTimestampUTC(LocalDateTime.now());
        String fullPath = args.getOutputPath() + File.separator + "protobuf-customer";

        try (FileOutputStream fos = new FileOutputStream(fullPath)) {
            Customer daniel = Customer.newBuilder()
                    .setId(1)
                    .setPhoto(ByteString.EMPTY)
                    .setName("Daniel")
                    .setBirthdate(birthdate)
                    .setBalance(balance)
                    .setCreatedAt(createdUpdateAt)
                    .setUpdatedAt(createdUpdateAt)
                    .build();

            daniel.writeTo(fos);
            String log = daniel.toString();
            LOGGER.log(Level.INFO, "Protobuf customer created for dotnet: {0}", log);
            LOGGER.log(Level.INFO, "Successfully finished generating protobuf customer at: {0}", args.getOutputPath());
        }
    }
}
