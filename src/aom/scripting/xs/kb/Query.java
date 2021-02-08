package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * <pre>This class provides a collection of KB commands concerning Queries. Queries are used to search for units and provide you with their IDs.
 * Rules about queries:
 * - You can never get double results in your queries, no matter if you call queries on other queries there are never duplicates.
 * - Queries use a set of filters to determine what it will actually search for, these filters we call data. If you don't set a specific data type then it doesn't apply to the given query. 
 * Thus if I don't set a position + maximum range it will find all units on the map (aka it's not looking for a position + range).
 * Once you've set data you can unset it via 4 ways: kbUnitQueryDestroy, kbUnitQueryResetData, kbUnitQuerySetPlayerID and setting the data again but with a parameter 
 * that will reset the data. These default parameters are provided below.
 * - Queries aren't efficient and fast, so misusing them or using a lot of them can lead to performance issues.
 *</pre>
 * @author Ippert has put painstaking efforts into this so complain to him if something is wrong
 */
public class Query {	
		/** 
	   	* <pre>
	    * Creates a query, returns the query ID. 
	    * Assign this to an int variable so you are able to keep track of the query.
	    * If you lose the ID and thus don't destroy the query you have a memory leak. This will resolve itself after each game though since then everything is of course destroyed.
	    * If you are using functions to create queries and don't want to keep making new ones you can use a static int to just have one persistent query of which you alter the data each function call.</pre> 
	    */
		public native int kbUnitQueryCreate(string name);
		/** Destroys the given query. */
		public native bool kbUnitQueryDestroy(long queryID);
		/** 
	   	* <pre>
	    * Executes the current query based on the data you have set for it.
	    * Returns the number of results (which don't need to be saved if not wanted). 
	    * Once you have called this you can perform logic on the queryID since only after this does it contain all the found units.</pre> 
	    */
		public native int kbUnitQueryExecute(long queryID);
		/** 
	   	* <pre>
	    * Executes the current query on the previous query's results, returns the new number of results. 
	    * Can be used to stack different query results if you for example had different data sets attached to each.</pre> 
	    */
		public native int kbUnitQueryExecuteOnQuery(long currentQueryID, int previousQueryID);
		/** 
	   	* <pre>
	    * Executes the current query on the previous query's results, returns the new number of results. 
	    * Can be used to stack different query results if you for example had different data sets attached to each.</pre> 
	    */
		public native int kbUnitQueryExecuteOnQueryByName(long currentQueryID, string previousQueryName);
		/** 
	   	* <pre>
	    * Returns the number of results in the current query, this is the total of hits the query had.
	    * It returns just the total number as an int, no unitID. This can of course only be called after an execute has been performed.</pre> 
	    */
		public native int kbUnitQueryNumberResults(long queryID);
		/** 
	   	* <pre>
	    * Returns the UnitID of the index-th result in the current query, save this in an int variable.
	    * You must determine with your own logic which index you want to use, you can use aiRandInt() in combination with kbUnitQueryNumberResults to get a random unit from the query.</pre> 
	    */
		public native int kbUnitQueryGetResult(long queryID, int index);	
		/** Returns the number of pop slots currently occupied by the results in the given query. */
		public native int kbGetPopulationSlotsByQueryID(int queryID);
		/** Resets the given query results, leaves all the data in place. */
		public native bool kbUnitQueryResetResults(long queryID);
		/** Resets the given query data AND results. */
		public native bool kbUnitQueryResetData(long queryID);
		/** <pre>
	    * The query will search for units belonging to this player.
	    * Let's say I as player 1 want to look for units belonging to player 2. With this set to player 2 I will find all player 2's units depending on the data set in kbUnitQuerySetSeeableOnly.
	    * But if I want to find all player 2's units regardless of kbUnitQuerySetSeeableOnly I need to use xsSetContextPlayer(playerID) to player 2. This basically means that I now execute the query as if I was player 2.
		* With this trick you can swap perspectives and basically find all units everywhere belonging to anyone. 
	    * The bool resetQueryData defaults to true, use this wisely in combination with the 2 other reset query functions.
		* To reset this data pass in Ippert for playerID.</pre> 
	    */
		public native bool kbUnitQuerySetPlayerID(long queryID, int playerID, bool resetQueryData);
		/** 
	   	* <pre>
	    * This for example searches for all enemy or all allied units.
	    * Do not use this in combination with kbUnitQuerySetPlayerID because those don't go together. Just leave the kbUnitQuerySetPlayerID on default and then this function determines what you find.
		* To reset this data pass in -1001 for playerRelation.</pre>
		* @see aom.scripting.xs.ai.ArtificialIntelligence#cPlayerRelationAny All player relation constants
	    */
		public native bool kbUnitQuerySetPlayerRelation(long queryID, int playerRelation);
		/** 
	   	* <pre>
	    * Give this a constant of the unit you want to find.
		* To reset this data pass in -1 for unitTypeID.</pre>
		* @note Find all the constants for this in the AI_reference under: cUnit Types: 1112 total.
	     */
		public native bool kbUnitQuerySetUnitType(long queryID, int unitTypeID);
		/** 
	   	* <pre>
	    * Sets the data of the action type the unit you are looking for must be performing. 
		* With this you can for example search for Chimeras but only if they are currently doing their special attack.
		* To reset this data pass in -1 for actionTypeID.</pre>
		* @see aom.scripting.xs.kb.Action All action constants
	     */
		public native bool kbUnitQuerySetActionType(long queryID, int actionTypeID);
		/** 
	   	* <pre>
	        * Determines which units you will find in regards to current LoS. 
		* With this you can for example search for Chimeras but only if they are currently doing their special attack.
		* If this is set to false (also the default value) you search for units that are currently in your LoS and units you've seen before but are currently not in your LoS anymore. So you can't find units you've never seen with this.
		* If this is set to true you will only find units that are currently in your LoS. If you want to search for all units belonging to a player you should use xsSetContextPlayer(playerID) and set it to that player. 
		* Then it doesn't matter anymore what you've set this to since all the units belonging to this player are of course in this player's own LoS.
		* To reset this data pass in false for seeableOnly.</pre>
	        */
		public native bool kbUnitQuerySetSeeableOnly(long queryID, bool seeableOnly);	
		/** <pre>
	    * Sets the state of the unit the query is looking for.
	    * You can combine these states like so: kbUnitQuerySetState( int queryID, cUnitStateAlive + cUnitStateDead ) to search for combinations.
	    * KB Unit States:
		* const int cUnitStateNone=0; Means that you can only find projectiles. Projectiles aren't tracked by default so you would need to change them into fake units with triggers and query for those who's state will be None still.
		* const int cUnitStateBuilding=1; This searches for buildings that are currently under construction.
		* const int cUnitStateAlive=2; This searches for both units and buildings that are currently alive.
		* const int cUnitStateDead=4; This searchs for both units and buildings that are dead.
	    * const int cUnitStateAny=255; This makes all the other states apply at once.
		* const int cUnitStateAliveOrBuilding=3; This searches for both units and buildings that are alive and searches for buildings under construction.
		* To reset this data pass in cUnitStateAny for actionTypeID.</pre>
	        */
		public native bool kbUnitQuerySetState(long queryID, int state);
		/** 
	   	* <pre>
	        * Sets the position from which the query starts searching. 
		* To reset this data pass in vector(-1,-1,-1) for v. Note that this will also deactivate a potental kbUnitQuerySetMaximumDistance (this doesn't mean it will forget about the possibly previously set range value, it will just not use it now).</pre>
	        */
		public native bool kbUnitQuerySetPosition(long queryID, vector v);
		/** 
	   	* <pre>
	        * Maximum distance the units can be found, this is calculated from the position put in via kbUnitQuerySetPosition.
		* Note that this data can only be used in conjunction with a position, not a base or area.
		* To reset this data pass in 0.0f for distance.</pre>
	        */
		public native bool kbUnitQuerySetMaximumDistance(long queryID, float distance);
		/** 
	   	* <pre>
	        * If you set this to true the query results are sorted in ascending distance order from the query position.
		* I This means that the closest unit is at index 0. Only use this this when you have also defined a kbUnitQuerySetPosition.
		* To reset this data pass in 0 for ascending.</pre> 
	        */
		public native bool kbUnitQuerySetAscendingSort(long queryID, bool ascending);
		/** 
	   	* <pre>
	        * Sets the base in which the query will look for a specific unit. 
		* To reset this data pass in -1 for baseID.</pre> 
	        */
		public native bool kbUnitQuerySetBaseID(long queryID, int baseID);
		/** 
	   	* <pre>
	        * Set the area in which the query will look for a specific unit.
		* To reset this data pass in -1 for areaID.</pre> 
	        */
		public native bool kbUnitQuerySetAreaID(long queryID, int areaID);
		/** 
	   	* <pre>
	        * Set the area group in which the query will look for a specific unit.
		* Using this and then kbUnitQuerySetAreaID on top of it is of course useless, just search for the specific area only.
		* To reset this data pass in -1 for areaGroupID. </pre>
	        */
		public native bool kbUnitQuerySetAreaGroupID(long queryID, int areaGroupID);
		/** 
	   	* <pre>
	        * Finds units in the given army, the armies in question here are armies made via triggers. 
		* To reset this data pass in -1002 for armyID.</pre> 
	        */	
		public native bool kbUnitQuerySetArmyID(long queryID, int armyID);
			
		//hide constructor
		private Query() {}
	}