package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of AI commands concerning Plans.
 * 
 * @see <a href="{@docRoot}/resources/ai_reference.xs">AoM Reference</a> or <a href="{@docRoot}/resources/ai2_reference.xs">AoT Reference</a>
 * for a complete list of all plan constants and more.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class DefendPlan {
	private DefendPlan () {}
	
	public final int cPlanDefend=22;
	
	//Defend Plan Variables:
	public final int cDefendPlanDefendTargetID=0; //(RO=0, AC=0).
	public final int cDefendPlanDefendAreaID=1; //(RO=0, AC=0).
	public final int cDefendPlanDefendBaseID=2; //(RO=0, AC=0).
	public final int cDefendPlanDefendPoint=3; //(RO=0, AC=0).
	public final int cDefendPlanEngageRange=4; //(RO=0, AC=1).
	public final int cDefendPlanPatrol=5; //(RO=0, AC=1).
	public final int cDefendPlanPatrolWaypoint=6; //(RO=0, AC=0).
	public final int cDefendPlanCurrentWaypoint=7; //(RO=0, AC=1).
	public final int cDefendPlanTargetID=8; //(RO=1, AC=0).
	public final int cDefendPlanGatherDistance=9; //(RO=0, AC=1).
	public final int cDefendPlanRefreshFrequency=10; //(RO=0, AC=1).
	public final int cDefendPlanLastRefreshTime=11; //(RO=1, AC=1).
	public final int cDefendPlanAttackTypeID=12; //(RO=0, AC=0).
	public final int cDefendPlanGatherPercentage=13; //(RO=0, AC=1).
	/*
	//Gather Plan Variables:
	public final int cGatherPlanMaximumDistance=0;
	public final int cGatherPlanMaximumWalkDistance=1;
	public final int cGatherPlanKBResourceID=2;
	public final int cGatherPlanAutoBuildDropsite=3;
	public final int cGatherPlanResourceID=4;
	public final int cGatherPlanResourceType=5;
	public final int cGatherPlanResourceSubType=6;
	public final int cGatherPlanBreakDownID=7;
	public final int cGatherPlanDropsiteTimeLimit=8;
	public final int cGatherPlanDropsiteTime=9;
	public final int cGatherPlanDropsiteID=10;
	public final int cGatherPlanDropsitePUID=11;

	//Build Plan Variables:
	public final int cBuildPlanBuildingPlacementID=0; //(RO=0, AC=1).
	public final int cBuildPlanBuildingTypeID=1; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceUnitTypeID=2; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceUnitDistance=3; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceUnitValue=4; //(RO=0, AC=1).
	public final int cBuildPlanAreaID=5; //(RO=0, AC=1).
	public final int cBuildPlanCenterPosition=6; //(RO=0, AC=1).
	public final int cBuildPlanCenterPositionDistance=7; //(RO=0, AC=1).
	public final int cBuildPlanBuildUnitID=8; //(RO=0, AC=1).
	public final int cBuildPlanFoundationID=9; //(RO=0, AC=0).
	public final int cBuildPlanInfluencePosition=10; //(RO=0, AC=1).
	public final int cBuildPlanInfluencePositionDistance=11; //(RO=0, AC=1).
	public final int cBuildPlanInfluencePositionValue=12; //(RO=0, AC=1).
	public final int cBuildPlanDockPlacementPoint=13; //(RO=0, AC=1).
	public final int cBuildPlanNumAreaBorderLayers=14; //(RO=0, AC=1).
	public final int cBuildPlanBuildingBufferSpace=15; //(RO=0, AC=1).
	public final int cBuildPlanSettlementPlacementPoint=16; //(RO=0, AC=1).
	public final int cBuildPlanFailOnUnaffordable=17; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceKBResourceID=18; //(RO=0, AC=1).
	public final int cBuildPlanRandomBPValue=19; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceAtBuilderPosition=20; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceBuilderPositionValue=21; //(RO=0, AC=1).
	public final int cBuildPlanInfluenceBuilderPositionDistance=22; //(RO=0, AC=1).
	public final int cBuildPlanRetries=23; //(RO=0, AC=1).
	public final int cBuildPlanMaxRetries=24; //(RO=0, AC=1).
	public final int cBuildPlanPendingCommands=25; //(RO=0, AC=1).
	public final int cBuildPlanFailureCause=26; //(RO=1, AC=1).
	public final int cBuildPlanFailureCauseFloat=27; //(RO=1, AC=1).
	public final int cBuildPlanMaxCanPaths=28; //(RO=1, AC=1).
	public final int cBuildPlanCanPathStartIndex=29; //(RO=0, AC=1).

	//Train Plan Variables:
	public final int cTrainPlanBuildingID=0; //(RO=0, AC=1).
	public final int cTrainPlanIntoArmyID=1; //(RO=0, AC=1).
	public final int cTrainPlanIntoPlanID=2; //(RO=0, AC=1).
	public final int cTrainPlanIntoBaseID=3; //(RO=0, AC=1).
	public final int cTrainPlanNumberToTrain=4; //(RO=0, AC=1).
	public final int cTrainPlanNumberToMaintain=5; //(RO=0, AC=1).
	public final int cTrainPlanNumberTrained=6; //(RO=1, AC=1).
	public final int cTrainPlanUnitType=7; //(RO=0, AC=1).
	public final int cTrainPlanBuildFromType=8; //(RO=0, AC=1).
	public final int cTrainPlanTrainedUnitID=9; //(RO=1, AC=0).
	public final int cTrainPlanFrequency=10; //(RO=0, AC=1).
	public final int cTrainPlanUseMultipleBuildings=11; //(RO=0, AC=1).
	public final int cTrainPlanGatherPoint=12; //(RO=0, AC=1).
	public final int cTrainPlanGatherTargetID=13; //(RO=0, AC=1).
	public final int cTrainPlanMaintainBaseID=14; //(RO=0, AC=1).
	public final int cTrainPlanMaintainAreaID=15; //(RO=0, AC=1).

	//Explore Plan Variables:
	public final int cExplorePlanLOSMultiplier=0; //(RO=0, AC=1).
	public final int cExplorePlanDoLoops=1; //(RO=0, AC=1).
	public final int cExplorePlanDoneLoops=2; //(RO=1, AC=1).
	public final int cExplorePlanNumberOfLoops=3; //(RO=0, AC=1).
	public final int cExplorePlanPointsInLoop=4; //(RO=0, AC=1).
	public final int cExplorePlanAvoidingAttackedAreas=5; //(RO=0, AC=1).
	public final int cExplorePlanReExploreAreas=6; //(RO=1, AC=1).
	public final int cExplorePlanLOSProtoUnitID=7; //(RO=1, AC=1).
	public final int cExplorePlanBuildPosition=8; //(RO=1, AC=1).
	public final int cExplorePlanBuilderUnitType=9; //(RO=1, AC=1).
	public final int cExplorePlanCanBuildLOSProto=10; //(RO=0, AC=1).
	public final int cExplorePlanHandleDamageTime=11; //(RO=1, AC=1).
	public final int cExplorePlanHandleDamageFrequency=12; //(RO=0, AC=1).
	public final int cExplorePlanQuitWhenPointIsVisible=13; //(RO=0, AC=1).
	public final int cExplorePlanQuitWhenPointIsVisiblePt=14; //(RO=0, AC=1).
	public final int cExplorePlanOracleExplore=15; //(RO=0, AC=1).

	//Research Plan Variables:
	public final int cResearchPlanBuildingID=0; //(RO=0, AC=1).
	public final int cResearchPlanBuildingTypeID=1; //(RO=0, AC=1).
	public final int cResearchPlanTechID=2; //(RO=0, AC=1).
	public final int cResearchPlanBuildingAbstractTypeID=3; //(RO=0, AC=1).

	//Attack Plan Variables:
	public final int cAttackPlanPlayerID=0; //(RO=0, AC=1).
	public final int cAttackPlanSpecificTargetID=1; //(RO=0, AC=0).
	public final int cAttackPlanTargetTypeID=2; //(RO=0, AC=0).
	public final int cAttackPlanQueryID=3; //(RO=0, AC=0).
	public final int cAttackPlanAttackRouteID=4; //(RO=0, AC=1).
	public final int cAttackPlanAttackRoutePattern=5; //(RO=0, AC=1).
	public final int cAttackPlanGatherPoint=6; //(RO=0, AC=1).
	public final int cAttackPlanGatherDistance=7; //(RO=0, AC=1).
	public final int cAttackPlanTargetID=8; //(RO=1, AC=0).
	public final int cAttackPlanMoveAttack=9; //(RO=0, AC=1).
	public final int cAttackPlanNumberAttacks=10; //(RO=1, AC=1).
	public final int cAttackPlanRefreshFrequency=11; //(RO=0, AC=1).
	public final int cAttackPlanLastRefreshTime=12; //(RO=1, AC=1).
	public final int cAttackPlanHandleDamageTime=13; //(RO=1, AC=1).
	public final int cAttackPlanHandleDamageFrequency=14; //(RO=0, AC=1).
	public final int cAttackPlanBaseAttackMode=15; //(RO=0, AC=1).
	public final int cAttackPlanPathID=16; //(RO=0, AC=1).
	public final int cAttackPlanFromGoalID=17; //(RO=0, AC=1).
	public final int cAttackPlanRetreatMode=18; //(RO=0, AC=1).
	public final int cAttackPlanTargetAreaGroups=19; //(RO=0, AC=0).
	public final int cAttackPlanTeleportLocation=20; //(RO=1, AC=1).
	public final int cAttackPlanAutoUseGPs=21; //(RO=0, AC=1).
	public final int cAttackPlanPowerID=22; //(RO=1, AC=1).
	public final int cAttackPlanGatherStartTime=23; //(RO=1, AC=1).
	public final int cAttackPlanDestTeleporterID=24; //(RO=0, AC=0).
	public final int cAttackPlanSrceTeleporterID=25; //(RO=0, AC=0).
	public final int cAttackPlanAttackRoutePatternLRU=0;
	public final int cAttackPlanAttackRoutePatternMRU=1;
	public final int cAttackPlanAttackRoutePatternRandom=2;
	public final int cAttackPlanAttackRoutePatternBest=3;
	public final int cAttackPlanBaseAttackModeNone=0;
	public final int cAttackPlanBaseAttackModeWeakest=1;
	public final int cAttackPlanBaseAttackModeStrongest=2;
	public final int cAttackPlanBaseAttackModeLRU=3;
	public final int cAttackPlanBaseAttackModeMRU=4;
	public final int cAttackPlanBaseAttackModeRandom=5;
	public final int cAttackPlanBaseAttackModeClosest=6;
	public final int cAttackPlanBaseAttackModeFarthest=7;
	public final int cAttackPlanRetreatModeNone=0;
	public final int cAttackPlanRetreatModeOutnumbered=1;
	public final int cAttackPlanRetreatModeWillLose=2;

	//Build Wall Plan Variables:
	public final int cBuildWallPlanWallType=0; //(RO=0, AC=1).
	public final int cBuildWallPlanWallStart=1; //(RO=0, AC=1).
	public final int cBuildWallPlanWallEnd=2; //(RO=0, AC=1).
	public final int cBuildWallPlanWallRingCenterPoint=3; //(RO=0, AC=1).
	public final int cBuildWallPlanWallRingRadius=4; //(RO=0, AC=1).
	public final int cBuildWallPlanNumberOfGates=5; //(RO=0, AC=1).
	public final int cBuildWallPlanAreaIDs=6; //(RO=0, AC=1).
	public final int cBuildWallPlanFoundationID=7; //(RO=0, AC=1).
	public final int cBuildWallPlanGateIndices=8; //(RO=0, AC=1).
	public final int cBuildWallPlanGateProtoIDs=9; //(RO=0, AC=1).
	public final int cBuildWallPlanEdgeOfMapBuffer=10; //(RO=0, AC=1).
	public final int cBuildWallPlanPieces=11; //(RO=1, AC=1).
	public final int cBuildWallPlanPiecePositions=12; //(RO=1, AC=1).
	public final int cBuildWallPlanPieceRotations=13; //(RO=1, AC=1).
	public final int cBuildWallPlanEnRoute=14; //(RO=0, AC=1).

	//Build Wall Plan Wall Types:
	public final int cBuildWallPlanWallTypeStraight=0;
	public final int cBuildWallPlanWallTypeRing=1;
	public final int cBuildWallPlanWallTypeArea=2;

	//Herd Plan Variables:
	public final int cHerdPlanBuildingID=0;
	public final int cHerdPlanBuildingTypeID=1;
	public final int cHerdPlanDistance=2;

	//Farm Plan Variables:
	public final int cFarmPlanDropsiteTypeID=0;
	public final int cFarmPlanDropsiteID=1;
	public final int cFarmPlanFarmingPosition=2;
	public final int cFarmPlanAutoBuildDropsite=3;
	public final int cFarmPlanResourceID=4;
	public final int cFarmPlanBreakDownID=5;
	public final int cFarmPlanResourceType=6;
	public final int cFarmPlanResourceSubType=7;
	public final int cFarmPlanFarmID=8;

	//Empower Plan Variables:
	public final int cEmpowerPlanTargetID=0;
	public final int cEmpowerPlanTargetTypeID=1;

	//Fish Plan Variables:
	public final int cFishPlanLandPoint=0; //(RO=0, AC=1).
	public final int cFishPlanWaterPoint=1; //(RO=0, AC=1).
	public final int cFishPlanLandGroupID=2; //(RO=0, AC=1).
	public final int cFishPlanWaterGroupID=3; //(RO=0, AC=1).
	public final int cFishPlanAutoTrainBoats=4; //(RO=0, AC=1).
	public final int cFishPlanNumberInTraining=5; //(RO=0, AC=1).
	public final int cFishPlanDockID=6; //(RO=0, AC=1).
	public final int cFishPlanMaximumDockDist=7; //(RO=0, AC=1).
	public final int cFishPlanPlaceRetries=8; //(RO=0, AC=1).
	public final int cFishPlanMaxPlaceRetries=9; //(RO=0, AC=1).

	//Transport Plan Variables:
	public final int cTransportPlanTransportID=0; //(RO=0, AC=1).
	public final int cTransportPlanTransportTypeID=1; //(RO=0, AC=1).
	public final int cTransportPlanGatherPoint=2; //(RO=0, AC=1).
	public final int cTransportPlanTargetPoint=3; //(RO=0, AC=1).
	public final int cTransportPlanGatherAreaGroup=4; //(RO=0, AC=1).
	public final int cTransportPlanTargetAreaGroup=5; //(RO=0, AC=1).
	public final int cTransportPlanGatherArea=6; //(RO=0, AC=1).
	public final int cTransportPlanTargetArea=7; //(RO=0, AC=1).
	public final int cTransportPlanPathType=8; //(RO=0, AC=1).
	public final int cTransportPlanPathPlanned=9; //(RO=0, AC=1).
	public final int cTransportPlanReturnWhenDone=10; //(RO=0, AC=1).
	public final int cTransportPlanMaximizeXportMovement=11; //(RO=0, AC=1).
	public final int cTransportPlanUnitsMoved=12; //(RO=0, AC=0).
	public final int cTransportPlanIgnoreAreaIDs=13; //(RO=0, AC=1).
	public final int cTransportPlanBestDangerArea=14; //(RO=0, AC=1).
	public final int cTransportPlanBestDangerValue=15; //(RO=0, AC=1).
	public final int cTransportPlanDropOffPoint=16; //(RO=0, AC=1).
	public final int cTransportPlanPersistent=17; //(RO=0, AC=1).
	public final int cTransportPlanMiddleAreaGroups=18; //(RO=0, AC=0).
	public final int cTransportPlanTakeMoreUnits=19; //(RO=0, AC=1).

	//Repair Plan Variables:
	public final int cRepairPlanTargetID=0; //(RO=0, AC=1).
	public final int cRepairPlanIsTitanGate=1; //(RO=0, AC=1).

	//Trade Plan Variables:
	public final int cTradePlanTargetUnitTypeID=0; //(RO=0, AC=1).
	public final int cTradePlanTargetUnitID=1; //(RO=0, AC=1).
	public final int cTradePlanStartPosition=2; //(RO=0, AC=1).
	public final int cTradePlanTradeUnitType=3; //(RO=0, AC=1).
	public final int cTradePlanTradeUnitTypeMax=4; //(RO=0, AC=1).
	public final int cTradePlanMarketID=5; //(RO=0, AC=1).

	//Dropoff Resource Plan Variables:
	public final int cDropoffResourcePlanBuildingID=0;
	public final int cDropoffResourcePlanBuildingTypeID=1;

	//Gather Relic Plan Variables:
	public final int cGatherRelicPlanDropsiteID=0; //(RO=0, AC=1).
	public final int cGatherRelicPlanDropsiteTypeID=1; //(RO=0, AC=1).
	public final int cGatherRelicPlanTargetID=2; //(RO=0, AC=1).
	public final int cGatherRelicPlanTargetTypeID=3; //(RO=0, AC=1).
	public final int cGatherRelicPlanTargetPosition=4; //(RO=0, AC=1).
	public final int cGatherRelicPlanPickingUp=5; //(RO=0, AC=1).

	//Attack Strategy Plan Variables:
	public final int cAttackStrategyPlanPlayerID=0; //(RO=0, AC=0).
	public final int cAttackStrategyPlanNumberTotalAttacks=1; //(RO=1, AC=1).


	//Reserve Plan Variables:
	public final int cReservePlanPlanType=0; //(RO=0, AC=0).

	//Goal Plan Variables:
	public final int cGoalPlanGoalType=0; //(RO=0, AC=1).
	public final int cGoalPlanGoalSubType=1; //(RO=0, AC=1).
	public final int cGoalPlanMinTime=2; //(RO=0, AC=1).
	public final int cGoalPlanMaxTime=3; //(RO=0, AC=1).
	public final int cGoalPlanMinAge=4; //(RO=0, AC=1).
	public final int cGoalPlanMaxAge=5; //(RO=0, AC=1).
	public final int cGoalPlanRepeat=6; //(RO=0, AC=1).
	public final int cGoalPlanExecuteCount=7; //(RO=0, AC=1).
	public final int cGoalPlanDoneGoal=8; //(RO=0, AC=0).
	public final int cGoalPlanFailGoal=9; //(RO=0, AC=0).
	public final int cGoalPlanExecuteGoal=10; //(RO=0, AC=0).
	public final int cGoalPlanAutoUpdateState=11; //(RO=0, AC=1).
	public final int cGoalPlanAutoUpdateBase=12; //(RO=0, AC=1).
	public final int cGoalPlanAutoUpdateAttackPlayerID=13; //(RO=0, AC=1).
	public final int cGoalPlanTargetType=14; //(RO=0, AC=1).
	public final int cGoalPlanTarget=15; //(RO=0, AC=1).
	public final int cGoalPlanTargetPoint=16; //(RO=0, AC=1).
	public final int cGoalPlanTargetNumber=17; //(RO=0, AC=1).
	public final int cGoalPlanMinUnitNumber=18; //(RO=0, AC=1).
	public final int cGoalPlanMaxUnitNumber=19; //(RO=0, AC=1).
	public final int cGoalPlanUnitPickerID=20; //(RO=0, AC=1).
	public final int cGoalPlanUnitPickerFrequency=21; //(RO=0, AC=1).
	public final int cGoalPlanUnitPickerTime=22; //(RO=0, AC=1).
	public final int cGoalPlanAttackPlayerID=23; //(RO=0, AC=1).
	public final int cGoalPlanAttackStartFrequency=24; //(RO=0, AC=1).
	public final int cGoalPlanAttackStartTime=25; //(RO=0, AC=1).
	public final int cGoalPlanUnitTypeID=26; //(RO=0, AC=0).
	public final int cGoalPlanBaseID=27; //(RO=0, AC=0).
	public final int cGoalPlanAllowRetreat=28; //(RO=0, AC=1).
	public final int cGoalPlanUpgradeBuilding=29; //(RO=0, AC=1).
	public final int cGoalPlanSetAreaGroups=30; //(RO=0, AC=1).
	public final int cGoalPlanIdleAttack=31; //(RO=0, AC=1).
	public final int cGoalPlanAreaGroupID=32; //(RO=0, AC=0).
	public final int cGoalPlanFunctionID=33; //(RO=0, AC=0).
	public final int cGoalPlanFunctionParm=34; //(RO=0, AC=0).
	public final int cGoalPlanBuildingTypeID=35; //(RO=0, AC=0).
	public final int cGoalPlanBuildingPlacementID=36; //(RO=0, AC=0).
	public final int cGoalPlanBuildingSearchID=37; //(RO=0, AC=0).
	public final int cGoalPlanActiveHealthTypeID=38; //(RO=0, AC=1).
	public final int cGoalPlanActiveHealth=39; //(RO=0, AC=1).
	public final int cGoalPlanAttackRoutePatternType=40; //(RO=0, AC=1).
	public final int cGoalPlanUpgradeFilterType=41; //(RO=0, AC=1).

	//Goal Plan Goal Types:
	public final int cGoalPlanGoalTypeForwardBase=0;
	public final int cGoalPlanGoalTypeCreateBase=1;
	public final int cGoalPlanGoalTypeMainBase=2;
	public final int cGoalPlanGoalTypeAttack=3;
	public final int cGoalPlanGoalTypeDefend=4;
	public final int cGoalPlanGoalTypeTrain=5;
	public final int cGoalPlanGoalTypeMaintain=6;
	public final int cGoalPlanGoalTypeResearch=7;
	public final int cGoalPlanGoalTypeAge=8;
	public final int cGoalPlanGoalTypeCallback=9;
	public final int cGoalPlanGoalTypeBuilding=10;
	public final int cGoalPlanGoalTypeBuildSettlement=11;

	//Goal Plan Goal Sub Types:
	public final int cGoalPlanGoalSubTypeEmpty1=0;
	public final int cGoalPlanGoalSubTypeEmpty2=1;

	//Goal Plan Target Types:
	public final int cGoalPlanTargetTypeArea=0;
	public final int cGoalPlanTargetTypeAreaGroup=1;
	public final int cGoalPlanTargetTypePoint=2;
	public final int cGoalPlanTargetTypeUnitType=3;
	public final int cGoalPlanTargetTypeUnit=4;
	public final int cGoalPlanTargetTypePlayer=5;
	public final int cGoalPlanTargetTypePlayerRelation=6;
	public final int cGoalPlanTargetTypeTech=7;

	//Tower Plan Variables:
	public final int cTowerPlanCenterLocation=0; //(RO=0, AC=1).
	public final int cTowerPlanAreaID=1; //(RO=0, AC=1).
	public final int cTowerPlanDistanceFromCenter=2; //(RO=0, AC=1).
	public final int cTowerPlanMaximizeLOS=3; //(RO=0, AC=1).
	public final int cTowerPlanMaximizeAttack=4; //(RO=0, AC=1).
	public final int cTowerPlanNumberToBuild=5; //(RO=0, AC=1).
	public final int cTowerPlanBuildLocations=6; //(RO=1, AC=1).
	public final int cTowerPlanProtoIDToBuild=7; //(RO=0, AC=1).
	public final int cTowerPlanAttackLOSModifier=8; //(RO=0, AC=1).
	public final int cTowerPlanLOSModifier=9; //(RO=0, AC=1).

	//Gather Goal Plan Variables:
	public final int cGatherGoalPlanScriptRPGPct=0; //(RO=0, AC=1).
	public final int cGatherGoalPlanCostRPGPct=1; //(RO=0, AC=1).
	public final int cGatherGoalPlanGathererPct=2; //(RO=0, AC=1).
	public final int cGatherGoalPlanNumFoodPlans=3; //(RO=0, AC=1).
	public final int cGatherGoalPlanNumWoodPlans=4; //(RO=0, AC=1).
	public final int cGatherGoalPlanNumGoldPlans=5; //(RO=0, AC=1).
	public final int cGatherGoalPlanNumFavorPlans=6; //(RO=0, AC=1).
	public final int cGatherGoalPlanMinResourceAmt=7; //(RO=0, AC=1).
	public final int cGatherGoalPlanResourceCostWeight=8; //(RO=0, AC=1).
	public final int cGatherGoalPlanFarmLimitPerPlan=9; //(RO=0, AC=1).
	public final int cGatherGoalPlanMaxFarmLimit=10; //(RO=0, AC=1).
	public final int cGatherGoalPlanResourceSkew=11; //(RO=0, AC=1).

	//God Power Plan Variables:
	public final int cGodPowerPlanPowerTechID=0; //(RO=0, AC=1).
	public final int cGodPowerPlanPowerProtoID=1; //(RO=1, AC=1).
	public final int cGodPowerPlanCastNow=2; //(RO=0, AC=1).
	public final int cGodPowerPlanAutoCast=3; //(RO=0, AC=1).
	public final int cGodPowerPlanTargetingModel=4; //(RO=0, AC=1).
	public final int cGodPowerPlanTargetLocation=5; //(RO=0, AC=1).
	public final int cGodPowerPlanTargetUnit=6; //(RO=0, AC=0).
	public final int cGodPowerPlanAttackPlanID=7; //(RO=0, AC=1).
	public final int cGodPowerPlanResourceType=8; //(RO=0, AC=0).
	public final int cGodPowerPlanEvaluationModel=9; //(RO=0, AC=1).
	public final int cGodPowerPlanCount=10; //(RO=0, AC=0).
	public final int cGodPowerPlanBPID=11; //(RO=0, AC=0).
	public final int cGodPowerPlanBPBufferSpace=12; //(RO=0, AC=1).
	public final int cGodPowerPlanDistance=13; //(RO=0, AC=0).
	public final int cGodPowerPlanTargetHintLocation=14; //(RO=1, AC=0).
	public final int cGodPowerPlanUnitTypeID=15; //(RO=0, AC=1).
	public final int cGodPowerPlanType=16; //(RO=1, AC=1).
	public final int cGodPowerPlanQueryID=17; //(RO=0, AC=0).
	public final int cGodPowerPlanBuildingPlacementDistance=18; //(RO=0, AC=1).
	public final int cGodPowerPlanBPInfluence=19; //(RO=0, AC=0).
	public final int cGodPowerPlanBPInfluenceValue=20; //(RO=0, AC=0).
	public final int cGodPowerPlanBPInfluenceDistance=21; //(RO=0, AC=0).
	public final int cGodPowerPlanBPLocationPreference=22; //(RO=0, AC=0).
	public final int cGodPowerPlanResourceSubType=23; //(RO=0, AC=0).
	public final int cGodPowerPlanResourceFilterHuntable=24; //(RO=0, AC=0).
	public final int cGodPowerPlanResourceFilterTotal=25; //(RO=0, AC=0).
	public final int cGodPowerPlanQueryHitpointFilter=26; //(RO=0, AC=0).
	public final int cGodPowerPlanTargetHintUnitID=27; //(RO=1, AC=0).
	public final int cGodPowerPlanQueryPlayerID=28; //(RO=0, AC=1).
	public final int cGodPowerPlanQueryPlayerRelation=29; //(RO=0, AC=0).
	public final int cGodPowerPlanExplorePlanID=30; //(RO=1, AC=0).
	public final int cGodPowerPlanCastAttempts=31; //(RO=1, AC=1).
	public final int cGodPowerPlanCheckVisibility=32; //(RO=0, AC=1).
	public final int cGodPowerPlanNotification=33; //(RO=1, AC=1).
	public final int cGodPowerPlanDoNotWaitForNotification=34; //(RO=0, AC=1).
	public final int cGodPowerPlanTownDefensePlan=35; //(RO=0, AC=1).
	public final int cGodPowerPlanQueryLocation=36; //(RO=0, AC=1).
	public final int cGodPowerPlanUnbuildBuilding=37; //(RO=0, AC=0).
	public final int cGodPowerPlanUnbuildProto=38; //(RO=0, AC=0).
	public final int cGodPowerPlanMultiCast=39; //(RO=0, AC=1).

	//GodPower Targeting Models:
	public final int cGodPowerTargetingModelUnit=0;
	public final int cGodPowerTargetingModelLocation=1;
	public final int cGodPowerTargetingModelDualUnit=2;
	public final int cGodPowerTargetingModelDualLocation=3;
	public final int cGodPowerTargetingModelWorld=4;
	public final int cGodPowerTargetingModelTown=5;
	public final int cGodPowerTargetingModelAttachedPlanLocation=6;
	public final int cGodPowerTargetingModelTownCenter=7;
	public final int cGodPowerTargetingModelMilitaryGatherPoint=8;
	public final int cGodPowerTargetingModelNearbyUnitType=9;
	public final int cGodPowerTargetingModelDualPlace=10;
	public final int cGodPowerTargetingModelUnbuild=11;

	//GodPower Evaluation Models:
	public final int cGodPowerEvaluationModelNone=0;
	public final int cGodPowerEvaluationModelWorkers=1;
	public final int cGodPowerEvaluationModelCombatDistance=2;
	public final int cGodPowerEvaluationModelCombatDistanceSelf=3;
	public final int cGodPowerEvaluationModelQuery=4;
	public final int cGodPowerEvaluationModelKBResource=5;
	public final int cGodPowerEvaluationModelCombatDistancePosition=6;

	//GodPower Plan Types:
	public final int cGodPowerPlanTypeDefault=0;
	public final int cGodPowerPlanTypeRequiresAttackPlan=1;
*/	
}
