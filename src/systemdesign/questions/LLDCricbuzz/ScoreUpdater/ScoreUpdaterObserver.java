package systemdesign.questions.LLDCricbuzz.ScoreUpdater;


import systemdesign.questions.LLDCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
