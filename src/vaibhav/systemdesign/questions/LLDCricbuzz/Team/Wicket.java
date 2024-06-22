package vaibhav.systemdesign.questions.LLDCricbuzz.Team;


import vaibhav.systemdesign.questions.LLDCricbuzz.Inning.BallDetails;
import vaibhav.systemdesign.questions.LLDCricbuzz.Inning.OverDetails;
import vaibhav.systemdesign.questions.LLDCricbuzz.Team.Player.PlayerDetails;

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
