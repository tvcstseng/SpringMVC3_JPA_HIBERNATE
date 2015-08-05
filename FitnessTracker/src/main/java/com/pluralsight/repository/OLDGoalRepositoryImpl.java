//package com.pluralsight.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
////import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//
//import org.springframework.stereotype.Repository;
//
//import com.pluralsight.model.Goal;
//import com.pluralsight.model.GoalReport;
//
//@Repository("goalRepository")
//public class OLDGoalRepositoryImpl implements GoalRepository {
//
//	@PersistenceContext
//	private EntityManager em;
//
//	public Goal save(Goal goal) {
//
//		if(goal.getId() == null){
//			em.persist(goal);
//
//			em.flush();
//		}
//		else{
//			em.merge(goal);
//		}
//		return goal;
//	}
//
//	//@SuppressWarnings({ "rawtypes", "unchecked" })
//	public List<Goal> loadAll() {
//
//		// ugly
//		// JPQL Java persistence Query Language
//		//Query query = em.createQuery("Select g from Goal g");
//		
//		//List goals = query.getResultList();
//		//return goals;
//		
//		
//		//  beautifull
//		TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
//		return query.getResultList();
//	}
//
//	// projection query
//	public List<GoalReport> findAllGoalReports() {
//		//Query query = em.createQuery("Select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) "
//		//		+ "from Goal g, Exercise e where g.id = e.goal.id");
//
//		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
//		
//		return query.getResultList();
//	}
//
//}
