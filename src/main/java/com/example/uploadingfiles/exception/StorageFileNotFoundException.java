package com.example.uploadingfiles.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message, Throwable cause) { super(message, cause); }

    public StorageFileNotFoundException(String message) { super(message); }
}
