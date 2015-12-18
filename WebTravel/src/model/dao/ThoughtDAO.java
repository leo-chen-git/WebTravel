package model.dao;

import java.util.List;

import model.ThoughtBean;

public interface ThoughtDAO {

	List<ThoughtBean> select();

	ThoughtBean select(String thoughtName);

	ThoughtBean select(int thoughtId);

	ThoughtBean update(ThoughtBean thoughtBean);

	ThoughtBean insert(ThoughtBean thoughtBean);

	boolean delete(int thoughtId);

}