package daos;

import entities.Routine;

import java.util.List;


public interface RoutineDao {

    public abstract Routine createRoutine(Routine r);

    public abstract Routine getRoutine(String routineId);

    //Not sure if we need
    public abstract List<Routine> getAllRoutines();

    public abstract List<Routine> getAllRoutinesForUser(String username);

    public abstract Routine updateRoutine(Routine r);

    public abstract String deleteRoutine(String routineId);

}
