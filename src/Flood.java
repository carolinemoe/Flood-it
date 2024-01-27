// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {

    // Students implement this flood function.
    // o(n) time complexity
    public static void flood(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles,
                              Integer board_size) {
        for (int i = 0; i < flooded_list.size(); i++){
            Coord thisFlood = flooded_list.get(i);
            List<Coord> neighborList = thisFlood.neighbors(board_size);
            for (int j = 0; j < neighborList.size(); j++){
                Coord thisNeighbor = neighborList.get(j);
                Tile tile = tiles[thisNeighbor.getY()][thisNeighbor.getX()];
                WaterColor checkColor = tile.getColor();
                if ((checkColor.equals(color)) && !flooded_list.contains(thisNeighbor)){
                    flooded_list.add(thisNeighbor);
                }
            }
        }

    }

    // An alternative implementation goes here.
    public static void flood1(WaterColor color,
                             LinkedList<Coord> flooded_list,
                             Tile[][] tiles,
                             Integer board_size) {
        // YOUR CODE
    }

}
