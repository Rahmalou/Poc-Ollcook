package fr.univ.rouen.ollcook.profile.ollcookprofile.Dto;

import org.springframework.http.HttpStatus;

public class ApiResponseDTO {
    private HttpStatus status;
    private String message;

    public ApiResponseDTO () {

    }

    public ApiResponseDTO (HttpStatus status, String message ) {
        this.status = status;
        this.message = message;

    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
