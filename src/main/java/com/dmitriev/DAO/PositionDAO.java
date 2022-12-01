package com.dmitriev.DAO;

import com.dmitriev.model.Position;

import java.util.List;

public interface PositionDAO {
    public List<Position> getPositions();
    public void savePosition(Position position);
    public Position getPosition(int id);
    public void deletePosition(int id);
}
