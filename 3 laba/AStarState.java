public class AStarState
{
    private Map2D map;

    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    public Map2D getMap()
    {
        return map;
    }

    public Waypoint getMinOpenWaypoint()
    {
   
        return null;
    }

    public boolean addOpenWaypoint(Waypoint newWP)
    {

        return false;
    }

    public int numOpenWaypoints()
    {

        return 0;
    }

    public void closeWaypoint(Location loc)
    {
    
    }

    public boolean isLocationClosed(Location loc)
    {
        
        return false;
    }
}