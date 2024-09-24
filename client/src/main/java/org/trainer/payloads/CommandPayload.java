package org.trainer.payloads;

public class CommandPayload implements Payload {

    private String type = "COMMAND";

    private String exitCommand = "EXIT";

    private String cmd;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return null;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getExitCommand() {
        return exitCommand;
    }

    public void setExitCommand(String exitCommand) {
        this.exitCommand = exitCommand;
    }
}
