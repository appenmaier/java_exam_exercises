package exams2.classdiagrams.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Represents a sports team whose members are mapped to their playing positions.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Team<T extends Sportsman>(String name, Map<T, Position> members) {

   /**
    * Adds a team member with the given position, throwing an exception if the member already exists.
    */
   public void addTeamMember(T member, Position position) throws DuplicateKeyException {
      if (members.containsKey(member)) {
         throw new DuplicateKeyException();
      }
      members.put(member, position);
   }

   /**
    * Returns the team member with the highest scorer points, if any.
    */
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

   /**
    * Returns all team members assigned to the specified position.
    */
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
