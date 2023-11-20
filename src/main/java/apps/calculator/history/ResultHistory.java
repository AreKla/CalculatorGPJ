package apps.calculator.history;

import java.util.ArrayList;
import java.util.List;

public class ResultHistory {
    private List<Integer> resultHistory = new ArrayList<>();

    public List<Integer> getResultHistory() {
        return resultHistory;
    }

    public void addToHistory(int result) {
        resultHistory.add(result);
    }

    public String getLastResult() {
        if (resultHistory.isEmpty()) {
            return "Brak wyników w historii.";
        } else {
            int lastResult = resultHistory.get(resultHistory.size() - 1);
            return "Ostatni wynik: " + lastResult;
        }
    }
}
