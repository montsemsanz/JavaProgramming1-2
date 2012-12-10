public class Examples {

    public List<Track> findAllBestTracks(List<Track> l) {
        List<Track> res= new ArrayList<Track>();
        for ( Track t : l ) {
            if ( t.rating() == 5 ) {
                res.add(t);
            }
        }
        return res;
    }

    public List<Track> findAllSpringsteenTracks(List<Track> l) {
        List<Track> res= new ArrayList<Track>();
        for ( Track t : l ) {
            if ( t.artist().equals("Springsteen") ) {
                res.add(t);
            }
        }
        return res;
    }
    
    public List<Aircraft> findAllDash8Aircrafts(List<Aircraft> l) {
        List<Aircraft> res= new ArrayList<Aircraft>();
        for ( Aircraft a : l ) {
            if ( a.model().equals("Dash-8-400") ) {
                res.add(t);
            }
        }
        return res;
    }

    public List<Item> findAllExpensiveItems(List<Item> l) {
        List<Item> res= new ArrayList<Item>();
        for ( Item a : l ) {
            if ( i.price() >= 1000 ) {
                res.add(t);
            }
        }
        return res;
    }
}
