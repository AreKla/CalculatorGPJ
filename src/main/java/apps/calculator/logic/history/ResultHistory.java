package apps.calculator.logic.history;

import java.util.ArrayList;
import java.util.List;

public class ResultHistory {
    private List<Integer> resultHistory;

    public ResultHistory() {
        resultHistory = new ArrayList<>();
    }

    public List<Integer> getResultHistory() {
        return resultHistory;
    }

    public void addToHistory(int result) {
        resultHistory.add(result);
    }
}