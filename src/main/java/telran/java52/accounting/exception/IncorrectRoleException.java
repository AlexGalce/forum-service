package telran.java52.accounting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class IncorrectRoleException extends RuntimeException {

	private static final long serialVersionUID = -2430397451868958446L;

}
