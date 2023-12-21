package ec.edu.espe.examenfaican.examen.service.exception;

public class ColegioNotFoundException extends RuntimeException {

    public ColegioNotFoundException(String message) {
        super(message);
    }

    public ColegioNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
