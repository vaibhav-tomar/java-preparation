package systemdesign.questions.LLDCricbuzz.Team;


import systemdesign.questions.LLDCricbuzz.Inning.BallDetails;
import systemdesign.questions.LLDCricbuzz.Inning.OverDetails;
import systemdesign.questions.LLDCricbuzz.Team.Player.PlayerDetails;

public class Wicket {

    public WicketType wicketType;
    public PlayerDetails takenBy;
    public OverDetails overDetail;
    public BallDetails ballDetail;

    public Wicket(WicketType wicketType, PlayerDetails takenBy, OverDetails overDetail, BallDetails ballDetail) {

        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}
