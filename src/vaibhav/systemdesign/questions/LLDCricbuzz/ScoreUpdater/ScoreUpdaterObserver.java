package vaibhav.systemdesign.questions.LLDCricbuzz.ScoreUpdater;


import vaibhav.systemdesign.questions.LLDCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
