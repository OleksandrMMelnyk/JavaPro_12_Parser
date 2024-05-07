public enum Messages {

    PLEASE_ENTER_FILE_NAME("Please enter book name:"),
    FILE_NOT_FOUND("File not found, please type it again!"),
    EXIT("Do you want to exit  y/n :-)?"),
    INTERNAL_ERROR("Internal error, app will be closed, bye");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
