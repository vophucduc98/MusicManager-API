package api;

import java.util.List;

import model.SongVO;

public interface SongDAOMbean {
	public void add(SongVO vo) throws InterruptedException;
	public void delete(int id) throws InterruptedException;
	public void update(SongVO dto) throws InterruptedException;
	public List<SongVO> findAll();
	public SongVO findOne(int id);
}
