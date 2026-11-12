package chapter05.solution04;

public enum ErrorCode {
    NORMAL(0, "OK"),
    IO_EXCEPTION(10, "Couldn't read the file"),
    INPUT_MISMATCH_EXCEPTION(20, "Incorrect number in the file");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return this == NORMAL;
    }
}
