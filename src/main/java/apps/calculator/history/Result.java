package apps.calculator.history;

public record Result(Integer result, String nameOfAction) {

    @Override
    public String toString() {
        if (nameOfAction != null) {
	    return nameOfAction + " " + result;
	}
	return result.toString();
    }
}