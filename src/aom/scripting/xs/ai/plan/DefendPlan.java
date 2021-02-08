package aom.scripting.xs.ai.plan;

import aom.scripting.xs.ai.Plan;
import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;
import aom.scripting.ui.AbstractGadget;

/**
 * This class provides a collection of AI commands concerning Plans.
 * 
 * @see <a href="{@docRoot}/resources/ai_reference.xs">AoM Reference</a> or <a href="{@docRoot}/resources/ai2_reference.xs">AoT Reference</a>
 * for a complete list of all plan constants and more.
 * 
 * @author WarriorMario - warriormario[a]live.com
 */
public class DefendPlan extends Plan{
	private DefendPlan () {}

	/** The ID value of the defend plan. */
	public final int cPlanDefend=22;
	
	//Defend Plan Variables:
	/** The target that the plan tries to defend. (defend command used?) */
	public final int cDefendPlanDefendTargetID=0;
	/** The area that is defended.*/
	public final int cDefendPlanDefendAreaID=1;
	/** The base that is defended.*/
	public final int cDefendPlanDefendBaseID=2;
	/** The point that is defended.*/
	public final int cDefendPlanDefendPoint=3;
	/** The aggro range of the units in the defend plan.
	 * @autocreated*/
	public final int cDefendPlanEngageRange=4;
	/** Set to 1 to enable patrolling over the given waypoints stored in cDefendPlanPatrolWaypoint. 
	 * @autocreated*/
	public final int cDefendPlanPatrol=5; 
	/** The waypoints to patrol over.
	 * If only one is provided then the defend point is used instead*/
	public final int cDefendPlanPatrolWaypoint=6; 
	/** The current waypoint of the patrol. 
	 * @autocreated*/
	public final int cDefendPlanCurrentWaypoint=7; 
	/** The current targets that are selected by the defend plan.
	 *  @readonly */
	public final int cDefendPlanTargetID=8;
	/** The maximum gather distance the units will use to gather around a point or when patrolling 
	 * the distance the units will have to be in reach of the waypoint before continueing with the next.
	 * @autocreated*/
	public final int cDefendPlanGatherDistance=9;
	/** How frequently the plan needs to update.
	 * @autocreated*/
	public final int cDefendPlanRefreshFrequency=10;
	/** Last time since the plan was updated.
	 * @readonly @autocreated */
	public final int cDefendPlanLastRefreshTime=11;
	/** The Type ID of the attack?*/
	public final int cDefendPlanAttackTypeID=12;
	/** The % of units in the plan that need to be gathered to consider the gathering complete. 
	 * @autocreated*/
	public final int cDefendPlanGatherPercentage=13;
	
}
