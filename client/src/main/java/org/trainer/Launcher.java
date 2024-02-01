package org.trainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.trainer.payloads.TogglePropertyPayload;

import java.io.IOException;

public class Launcher {
    private static final Logger logger = LoggerFactory.getLogger(Launcher.class);
    private static Process agentProcess;
    private static Thread agentThread;

    public static void main(final String[] args) {
        agentThread = new Thread(() -> startAgent());
        agentThread.start();
        Client.main(args);
        System.exit(0);

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
            agentProcess = processBuilder.start();
            int exitCode = agentProcess.waitFor();
            logger.info("Agent process completed with exit code: {}", exitCode);
            System.exit(0);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
