package apps.calculator.history;

import java.util.ArrayList;
import java.util.List;

public class ResultHistory {
    private List<Result> resultHistory = new ArrayList<>();

    //można zapisywać wartości jako nowy obiekt Result i dodawać do listy

    public List<Result> getResultHistory() {
        return resultHistory;
    }

    public void addToHistory(int result, String nameOfAction) {
        resultHistory.add(new Result(result, nameOfAction));
    }

    public String getLastResult() {
        if (resultHistory.isEmpty()) {
            return "Brak wyników w historii.";
        } else {
            int lastResult = resultHistory.get(resultHistory.size() - 1).result();
            return "Ostatni wynik: " + lastResult;
        }
    }
}