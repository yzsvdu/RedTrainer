package org.trainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Launcher {
    private static final Logger logger = LoggerFactory.getLogger(Launcher.class);

    public static void main(final String[] args) {
        new Thread(() -> startAgent()).start();
        Client.main(args);

    }

    private static void startAgent() {
        logger.info("Starting agent");
        try {
            // Execute java command to start agent
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "java",
                    "-javaagent:agent-1.0-jar-with-dependencies.jar",
                    "-Xms128M",
                    "-Xmx384M",
                    "-Dfile.encoding=UTF-8",
                    "-Djava.library.path=natives/",
                    "-XstartOnFirstThread",
                    "-jar",
                    "PokeMMO.jar"
            );
            Process agent = processBuilder.start();
            int exitCode = agent.waitFor();
            logger.info("Agent process completed with exit code: {}", exitCode);

        } catch (IOException | InterruptedException e) {

            throw new RuntimeException(e);
        }
    }
}


