package Abstract;

import java.util.List;

import Entities.Game;

public interface IGameService {
	public List<Game> getLowRequirementGames();
	public List<Game> getHighRequirementGames();
}
