package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private String resourceName;
    private String fieldName;
    private Object fieldType;

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldType){
        super(String.format("%s not found with %s : '%s'",resourceName,fieldName,fieldType));
        this.fieldName = fieldName;
        this.resourceName = resourceName;
        this.fieldType = fieldType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldType() {
        return fieldType;
    }
}
