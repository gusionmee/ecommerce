package com.api.apiblog.Exception;


public class ResourceNotFound extends RuntimeException {
    public ResourceNotFound(String mess) {
        super(mess);
    }
}
