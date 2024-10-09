package exams2.classdiagrams.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Team
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Team<T extends Sportsman>(String name, Map<T, Position> members) {

  public void addTeamMember(T member, Position position) throws DuplicateKeyException {
    if (members.containsKey(member)) {
      throw new DuplicateKeyException();
    }
    members.put(member, position);
  }

  public Optional<T> getBestScorer() {
    T bestScorer = null;
    int score = 0;

    for (T t : members.keySet()) {
      if (t.getScorerPoints() > score) {
        bestScorer = t;
        score = t.getScorerPoints();
      }
    }

    return Optional.ofNullable(bestScorer);
  }

  public List<T> getAllTeamMembersByPosition(Position position) {
    List<T> membersByPosition = new ArrayList<>();

    for (Entry<T, Position> entry : members.entrySet()) {
      if (entry.getValue().equals(position)) {
        membersByPosition.add(entry.getKey());
      }
    }

    return membersByPosition;
  }

}
