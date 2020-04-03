////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpos.config.JposEntryRegistry;
import jpos.loader.JposServiceLoader;
import jpos.services.EventCallbacks;

/**
 * POSPower device control JUnit test.
 * <br>
 * Generated through jpos.build.controls.JavaPOSDeviceControlTestGenerator for JavaPOS version 1.14
 */
public class POSPowerTest {

    private static final String OPENNAME_ALL_METHODS_THROWING_NPE = "POSPowerTestServiceAlwaysThrowingNPE";
    private static final String OPENNAME_SERVICE_10 = "POSPowerTestService15";
    private static final String OPENNAME_SERVICE_15 = "POSPowerTestService15";
    private static final String OPENNAME_SERVICE_16 = "POSPowerTestService16";
    private static final String OPENNAME_SERVICE_17 = "POSPowerTestService17";
    private static final String OPENNAME_SERVICE_18 = "POSPowerTestService18";
    private static final String OPENNAME_SERVICE_19 = "POSPowerTestService19";
    private static final String OPENNAME_SERVICE_110 = "POSPowerTestService110";
    private static final String OPENNAME_SERVICE_111 = "POSPowerTestService111";
    private static final String OPENNAME_SERVICE_112 = "POSPowerTestService112";
    private static final String OPENNAME_SERVICE_113 = "POSPowerTestService113";
    private static final String OPENNAME_SERVICE_114 = "POSPowerTestService114";

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_ALL_METHODS_THROWING_NPE, "1.14"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_15, "1.5"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_16, "1.6"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_17, "1.7"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_18, "1.8"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_19, "1.9"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_110, "1.10"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_111, "1.11"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_112, "1.12"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_113, "1.13"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("POSPower", OPENNAME_SERVICE_114, "1.14"));
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.removeJposEntry(OPENNAME_ALL_METHODS_THROWING_NPE);
        registry.removeJposEntry(OPENNAME_SERVICE_15);
        registry.removeJposEntry(OPENNAME_SERVICE_16);
        registry.removeJposEntry(OPENNAME_SERVICE_17);
        registry.removeJposEntry(OPENNAME_SERVICE_18);
        registry.removeJposEntry(OPENNAME_SERVICE_19);
        registry.removeJposEntry(OPENNAME_SERVICE_110);
        registry.removeJposEntry(OPENNAME_SERVICE_111);
        registry.removeJposEntry(OPENNAME_SERVICE_112);
        registry.removeJposEntry(OPENNAME_SERVICE_113);
        registry.removeJposEntry(OPENNAME_SERVICE_114);
    }

    private POSPower control;

    @Before
    public void setUp() throws Exception {
        this.control = new POSPower();
    }

    @After
    public void tearDown() throws Exception {
        this.control = null;
    }

    /**
     * Test method for {@link jpos.POSPower#createEventCallbacks()}.
     */
    @Test
    public final void testCreateEventCallbacks() {
        EventCallbacks callbacks = this.control.createEventCallbacks();
        assertThat(callbacks, is(notNullValue()));
    }
    
    @Test
    public final void testGetBatteryCapacityRemainingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getBatteryCapacityRemaining();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetBatteryCriticallyLowThresholdFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getBatteryCriticallyLowThreshold();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetBatteryCriticallyLowThresholdFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setBatteryCriticallyLowThreshold(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetBatteryLowThresholdFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getBatteryLowThreshold();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetBatteryLowThresholdFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setBatteryLowThreshold(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapBatteryCapacityRemainingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapBatteryCapacityRemaining();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapCompareFirmwareVersion();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapFanAlarmFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapFanAlarm();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapHeatAlarmFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapHeatAlarm();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapPowerReporting();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapQuickChargeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapQuickCharge();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapRestartPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRestartPOS();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapShutdownPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapShutdownPOS();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapStandbyPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStandbyPOS();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStatisticsReporting();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSuspendPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSuspendPOS();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUPSChargeStateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUPSChargeState();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUpdateFirmware();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUpdateStatistics();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapVariableBatteryCriticallyLowThresholdFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapVariableBatteryCriticallyLowThreshold();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapVariableBatteryLowThresholdFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapVariableBatteryLowThreshold();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCheckHealthText();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetClaimedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getClaimed();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDeviceEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceServiceDescription();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetEnforcedShutdownDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getEnforcedShutdownDelayTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetEnforcedShutdownDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setEnforcedShutdownDelayTime(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetFreezeEventsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getFreezeEvents();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetFreezeEventsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setFreezeEvents(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPhysicalDeviceDescription();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPhysicalDeviceName();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerFailDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerFailDelayTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerNotify();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetPowerNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setPowerNotify(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerSourceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerSource();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerStateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerState();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetQuickChargeModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getQuickChargeMode();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetQuickChargeTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getQuickChargeTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetUPSChargeStateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getUPSChargeState();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCheckHealthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.checkHealth(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClaimFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.claim(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCloseFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.close();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.compareFirmwareVersion("",new int[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testDirectIOFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.directIO(0,new int[0],new Object());
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testReleaseFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.release();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testResetStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resetStatistics("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRestartPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.restartPOS();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveStatistics(new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testShutdownPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.shutdownPOS();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testStandbyPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.standbyPOS(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSuspendPOSFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.suspendPOS(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testUpdateFirmwareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateFirmware("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testUpdateStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateStatistics("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetBatteryCapacityRemainingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getBatteryCapacityRemaining();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetBatteryCriticallyLowThresholdFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getBatteryCriticallyLowThreshold();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetBatteryCriticallyLowThresholdFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setBatteryCriticallyLowThreshold(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetBatteryLowThresholdFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getBatteryLowThreshold();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetBatteryLowThresholdFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setBatteryLowThreshold(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapBatteryCapacityRemainingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapBatteryCapacityRemaining();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapCompareFirmwareVersion();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapFanAlarmFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapFanAlarm();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapHeatAlarmFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapHeatAlarm();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapPowerReporting();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapQuickChargeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapQuickCharge();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapRestartPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRestartPOS();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapShutdownPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapShutdownPOS();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapStandbyPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStandbyPOS();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStatisticsReporting();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSuspendPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSuspendPOS();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUPSChargeStateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUPSChargeState();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUpdateFirmware();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUpdateStatistics();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapVariableBatteryCriticallyLowThresholdFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapVariableBatteryLowThresholdFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapVariableBatteryLowThreshold();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCheckHealthText();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetClaimedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getClaimed();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDeviceEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceServiceDescription();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetEnforcedShutdownDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getEnforcedShutdownDelayTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetEnforcedShutdownDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setEnforcedShutdownDelayTime(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetFreezeEventsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getFreezeEvents();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetFreezeEventsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setFreezeEvents(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPhysicalDeviceDescription();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPhysicalDeviceName();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerFailDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerFailDelayTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerNotify();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetPowerNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setPowerNotify(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerSourceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerSource();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerStateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerState();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetQuickChargeModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getQuickChargeMode();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetQuickChargeTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getQuickChargeTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetUPSChargeStateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getUPSChargeState();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCheckHealthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.checkHealth(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClaimFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.claim(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCloseFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.close();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testDirectIOFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.directIO(0,new int[0],new Object());
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testReleaseFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.release();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testResetStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resetStatistics("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRestartPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.restartPOS();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveStatistics(new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testShutdownPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.shutdownPOS();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testStandbyPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.standbyPOS(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSuspendPOSFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.suspendPOS(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testUpdateFirmwareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateFirmware("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testUpdateStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateStatistics("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            assertThat(this.control.getDeviceServiceVersion(), is(1005000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            assertThat(this.control.getDeviceServiceVersion(), is(1006000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            assertThat(this.control.getDeviceServiceVersion(), is(1007000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            assertThat(this.control.getDeviceServiceVersion(), is(1008000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            assertThat(this.control.getDeviceServiceVersion(), is(1009000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            assertThat(this.control.getDeviceServiceVersion(), is(1010000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            assertThat(this.control.getDeviceServiceVersion(), is(1011000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            assertThat(this.control.getDeviceServiceVersion(), is(1012000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            assertThat(this.control.getDeviceServiceVersion(), is(1013000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            assertThat(this.control.getDeviceServiceVersion(), is(1014000));
        }
        catch (JposException e) {
            fail("POSPower.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCapacityRemainingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getBatteryCapacityRemaining();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetBatteryCapacityRemainingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCapacityRemainingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCapacityRemainingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCapacityRemainingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCapacityRemainingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCapacityRemainingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetBatteryCriticallyLowThresholdFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getBatteryCriticallyLowThreshold();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetBatteryCriticallyLowThresholdCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCriticallyLowThresholdCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCriticallyLowThresholdCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCriticallyLowThresholdCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCriticallyLowThresholdCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryCriticallyLowThresholdCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryCriticallyLowThresholdFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setBatteryCriticallyLowThreshold(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetBatteryCriticallyLowThresholdCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setBatteryCriticallyLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetBatteryCriticallyLowThresholdCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setBatteryCriticallyLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryCriticallyLowThresholdCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setBatteryCriticallyLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryCriticallyLowThresholdCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setBatteryCriticallyLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryCriticallyLowThresholdCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setBatteryCriticallyLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryCriticallyLowThresholdCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setBatteryCriticallyLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryLowThresholdFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getBatteryLowThreshold();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetBatteryLowThresholdCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryLowThresholdCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryLowThresholdCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryLowThresholdCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryLowThresholdCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetBatteryLowThresholdCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryLowThresholdFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setBatteryLowThreshold(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetBatteryLowThresholdCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setBatteryLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetBatteryLowThresholdCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setBatteryLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryLowThresholdCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setBatteryLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryLowThresholdCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setBatteryLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryLowThresholdCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setBatteryLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetBatteryLowThresholdCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setBatteryLowThreshold(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapBatteryCapacityRemainingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapBatteryCapacityRemaining();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapBatteryCapacityRemainingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapBatteryCapacityRemainingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapBatteryCapacityRemainingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapBatteryCapacityRemainingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapBatteryCapacityRemainingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapBatteryCapacityRemainingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapBatteryCapacityRemaining();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapCompareFirmwareVersionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapCompareFirmwareVersion();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapFanAlarmCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapFanAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapHeatAlarmCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapHeatAlarm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapQuickChargeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapQuickCharge();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapRestartPOSFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapRestartPOS();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapRestartPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapRestartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRestartPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapRestartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRestartPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapRestartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRestartPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRestartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRestartPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRestartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRestartPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRestartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapShutdownPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapShutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapStandbyPOSFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapStandbyPOS();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapStandbyPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapStandbyPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStandbyPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStandbyPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStandbyPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStandbyPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStandbyPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStandbyPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStandbyPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStandbyPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStandbyPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStandbyPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapStatisticsReportingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapStatisticsReporting();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapSuspendPOSFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapSuspendPOS();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapSuspendPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapSuspendPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapSuspendPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapSuspendPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSuspendPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSuspendPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSuspendPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUPSChargeStateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapUpdateFirmwareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUpdateFirmware();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapUpdateStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapUpdateStatistics();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryCriticallyLowThresholdCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapVariableBatteryCriticallyLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapVariableBatteryLowThresholdFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapVariableBatteryLowThreshold();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapVariableBatteryLowThresholdCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapVariableBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryLowThresholdCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapVariableBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryLowThresholdCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapVariableBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryLowThresholdCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapVariableBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryLowThresholdCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapVariableBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapVariableBatteryLowThresholdCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapVariableBatteryLowThreshold();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetClaimedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEnforcedShutdownDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getEnforcedShutdownDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetEnforcedShutdownDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setEnforcedShutdownDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerFailDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerFailDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerSourceFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerSource();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerSourceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerSource();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerSourceCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerSource();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerSourceCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerSource();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerSourceCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerSource();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerSourceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerSource();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerSourceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerSource();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPowerStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeModeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getQuickChargeMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetQuickChargeTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getQuickChargeTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUPSChargeStateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getUPSChargeState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCheckHealthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClaimCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCloseCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testDirectIOCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testReleaseCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.resetStatistics("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testResetStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRestartPOSFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.restartPOS();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRestartPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.restartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRestartPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.restartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRestartPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.restartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRestartPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.restartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRestartPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.restartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRestartPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.restartPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.retrieveStatistics(new String[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testShutdownPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testShutdownPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.shutdownPOS();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStandbyPOSFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.standbyPOS(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testStandbyPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.standbyPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStandbyPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.standbyPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStandbyPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.standbyPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStandbyPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.standbyPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStandbyPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.standbyPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStandbyPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.standbyPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPOSFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.suspendPOS(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testSuspendPOSCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.suspendPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPOSCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.suspendPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPOSCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.suspendPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPOSCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.suspendPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPOSCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.suspendPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPOSCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.suspendPOS(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.updateFirmware("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.updateStatistics("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
}
