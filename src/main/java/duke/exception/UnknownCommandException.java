package duke.exception;

public class UnknownCommandException extends DukeException {

    /**
     * Initialises a UnknownCommandException.
     *
     */
    public UnknownCommandException() {
        super("I'm sorry, but I don't know what that means :-( ");
    }
}
