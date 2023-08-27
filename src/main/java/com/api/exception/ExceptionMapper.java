package com.api.exception;

public class ExceptionMapper {
    

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}

public class RequestFailedException extends RuntimeException {
    public RequestFailedException(String message) {
        super(message);
    }
}

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}

}
