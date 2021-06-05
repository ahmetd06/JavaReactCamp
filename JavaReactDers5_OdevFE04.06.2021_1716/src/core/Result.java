package core;

public class Result {
	private boolean Success;
	private String Message;

	public Result() {

	}

	public Result(boolean success, String message) {
		super();
		Success = success;
		Message = message;
	}

	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

}
