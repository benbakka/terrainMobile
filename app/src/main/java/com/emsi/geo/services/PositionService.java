package com.emsi.geo.services;

import java.util.ArrayList;
import java.util.List;

import com.emsi.geo.beans.Position;
import com.emsi.geo.dao.IDao;

public class PositionService implements IDao<Position> {
    private List<Position> positions;
    private static PositionService instance;

    private PositionService() {
        this.positions =new ArrayList<>();
    }

    public static PositionService getInstance() {
        if (instance != null)
            instance = new PositionService();
        return instance;
    }

    @Override
    public boolean create(Position o) {
        return positions.add(o);
    }

    @Override
    public boolean delete(Position o) {
        return positions.remove(o);
    }

    @Override
    public List<Position> findAll() {
        return positions;
    }
}
