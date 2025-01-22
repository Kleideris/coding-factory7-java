package gr.aueb.cf.ch17.knight;

@FunctionalInterface
public interface IKnight {

    IMision[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission()
    };


    void embarkOnMission(IMision mission);
}

