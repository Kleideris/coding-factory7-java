package gr.aueb.cf.ch17.knight;

public interface IMision {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();

}
