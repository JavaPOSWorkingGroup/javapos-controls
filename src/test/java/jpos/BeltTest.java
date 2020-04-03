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
 * Belt device control JUnit test.
 * <br>
 * Generated through jpos.build.controls.JavaPOSDeviceControlTestGenerator for JavaPOS version 1.14
 */
public class BeltTest {

    private static final String OPENNAME_ALL_METHODS_THROWING_NPE = "BeltTestServiceAlwaysThrowingNPE";
    private static final String OPENNAME_SERVICE_10 = "BeltTestService112";
    private static final String OPENNAME_SERVICE_112 = "BeltTestService112";
    private static final String OPENNAME_SERVICE_113 = "BeltTestService113";
    private static final String OPENNAME_SERVICE_114 = "BeltTestService114";

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Belt", OPENNAME_ALL_METHODS_THROWING_NPE, "1.14"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Belt", OPENNAME_SERVICE_112, "1.12"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Belt", OPENNAME_SERVICE_113, "1.13"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Belt", OPENNAME_SERVICE_114, "1.14"));
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.removeJposEntry(OPENNAME_ALL_METHODS_THROWING_NPE);
        registry.removeJposEntry(OPENNAME_SERVICE_112);
        registry.removeJposEntry(OPENNAME_SERVICE_113);
        registry.removeJposEntry(OPENNAME_SERVICE_114);
    }

    private Belt control;

    @Before
    public void setUp() throws Exception {
        this.control = new Belt();
    }

    @After
    public void tearDown() throws Exception {
        this.control = null;
    }

    /**
     * Test method for {@link jpos.Belt#createEventCallbacks()}.
     */
    @Test
    public final void testCreateEventCallbacks() {
        EventCallbacks callbacks = this.control.createEventCallbacks();
        assertThat(callbacks, is(notNullValue()));
    }
    
    @Test
    public final void testGetAutoStopBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoStopBackward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoStopBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoStopBackward(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoStopBackwardDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoStopBackwardDelayTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoStopBackwardDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoStopBackwardDelayTime(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoStopBackwardItemCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoStopBackwardItemCount();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoStopForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoStopForward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoStopForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoStopForward(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoStopForwardDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoStopForwardDelayTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoStopForwardDelayTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoStopForwardDelayTime(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoStopForwardItemCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoStopForwardItemCount();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapAutoStopBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapAutoStopBackward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapAutoStopBackwardItemCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapAutoStopBackwardItemCount();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapAutoStopForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapAutoStopForward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapAutoStopForwardItemCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapAutoStopForwardItemCount();
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
    public final void testGetCapLightBarrierBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapLightBarrierBackward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapLightBarrierForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapLightBarrierForward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapMoveBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapMoveBackward();
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
    public final void testGetCapRealTimeDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRealTimeData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSecurityFlapBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSecurityFlapBackward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSecurityFlapForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSecurityFlapForward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSpeedStepsBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSpeedStepsBackward();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSpeedStepsForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSpeedStepsForward();
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
    public final void testGetLightBarrierBackwardInterruptedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getLightBarrierBackwardInterrupted();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetLightBarrierForwardInterruptedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getLightBarrierForwardInterrupted();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMotionStatusFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMotionStatus();
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
    public final void testGetSecurityFlapBackwardOpenedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getSecurityFlapBackwardOpened();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetSecurityFlapForwardOpenedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getSecurityFlapForwardOpened();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testAdjustItemCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.adjustItemCount(0,0);
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
    public final void testMoveBackwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.moveBackward(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testMoveForwardFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.moveForward(0);
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
    public final void testResetBeltFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resetBelt();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testResetItemCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resetItemCount(0);
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
    public final void testStopBeltFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.stopBelt();
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
    public final void testGetAutoStopBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoStopBackward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoStopBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoStopBackward(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoStopBackwardDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoStopBackwardDelayTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoStopBackwardDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoStopBackwardDelayTime(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoStopBackwardItemCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoStopBackwardItemCount();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoStopForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoStopForward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoStopForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoStopForward(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoStopForwardDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoStopForwardDelayTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoStopForwardDelayTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoStopForwardDelayTime(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoStopForwardItemCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoStopForwardItemCount();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapAutoStopBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapAutoStopBackward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapAutoStopBackwardItemCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapAutoStopBackwardItemCount();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapAutoStopForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapAutoStopForward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapAutoStopForwardItemCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapAutoStopForwardItemCount();
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
    public final void testGetCapLightBarrierBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapLightBarrierBackward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapLightBarrierForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapLightBarrierForward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapMoveBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapMoveBackward();
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
    public final void testGetCapRealTimeDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRealTimeData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSecurityFlapBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSecurityFlapBackward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSecurityFlapForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSecurityFlapForward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSpeedStepsBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSpeedStepsBackward();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSpeedStepsForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSpeedStepsForward();
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
    public final void testGetLightBarrierBackwardInterruptedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getLightBarrierBackwardInterrupted();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetLightBarrierForwardInterruptedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getLightBarrierForwardInterrupted();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMotionStatusFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMotionStatus();
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
    public final void testGetSecurityFlapBackwardOpenedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getSecurityFlapBackwardOpened();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetSecurityFlapForwardOpenedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getSecurityFlapForwardOpened();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testAdjustItemCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.adjustItemCount(0,0);
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
    public final void testMoveBackwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.moveBackward(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testMoveForwardFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.moveForward(0);
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
    public final void testResetBeltFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resetBelt();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testResetItemCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resetItemCount(0);
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
    public final void testStopBeltFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.stopBelt();
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
    public final void testGetDeviceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            assertThat(this.control.getDeviceServiceVersion(), is(1012000));
        }
        catch (JposException e) {
            fail("Belt.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            assertThat(this.control.getDeviceServiceVersion(), is(1013000));
        }
        catch (JposException e) {
            fail("Belt.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            assertThat(this.control.getDeviceServiceVersion(), is(1014000));
        }
        catch (JposException e) {
            fail("Belt.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAutoStopBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoStopBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoStopBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoStopBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoStopBackward(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoStopBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoStopBackward(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoStopBackward(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAutoStopBackwardDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoStopBackwardDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopBackwardDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoStopBackwardDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopBackwardDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoStopBackwardDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopBackwardDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoStopBackwardDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoStopBackwardDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoStopBackwardDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopBackwardDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoStopBackwardDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAutoStopBackwardItemCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoStopBackwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopBackwardItemCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoStopBackwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopBackwardItemCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoStopBackwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetAutoStopForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoStopForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoStopForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoStopForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoStopForward(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoStopForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoStopForward(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoStopForward(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAutoStopForwardDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoStopForwardDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopForwardDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoStopForwardDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopForwardDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoStopForwardDelayTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopForwardDelayTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoStopForwardDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoStopForwardDelayTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoStopForwardDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoStopForwardDelayTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoStopForwardDelayTime(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAutoStopForwardItemCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoStopForwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopForwardItemCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoStopForwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoStopForwardItemCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoStopForwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapAutoStopBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapAutoStopBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapAutoStopBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapAutoStopBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapAutoStopBackwardItemCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapAutoStopBackwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopBackwardItemCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapAutoStopBackwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopBackwardItemCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapAutoStopBackwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapAutoStopForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapAutoStopForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapAutoStopForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapAutoStopForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapAutoStopForwardItemCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapAutoStopForwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopForwardItemCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapAutoStopForwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAutoStopForwardItemCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapAutoStopForwardItemCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetCapLightBarrierBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapLightBarrierBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapLightBarrierBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapLightBarrierBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapLightBarrierBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapLightBarrierBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapLightBarrierForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapLightBarrierForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapLightBarrierForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapLightBarrierForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapLightBarrierForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapLightBarrierForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapMoveBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapMoveBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapMoveBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapMoveBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapMoveBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapMoveBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetCapRealTimeDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRealTimeDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRealTimeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSecurityFlapBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSecurityFlapBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSecurityFlapBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSecurityFlapBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSecurityFlapBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSecurityFlapBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSecurityFlapForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSecurityFlapForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSecurityFlapForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSecurityFlapForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSecurityFlapForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSecurityFlapForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSpeedStepsBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSpeedStepsBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSpeedStepsBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSpeedStepsBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSpeedStepsBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSpeedStepsBackward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSpeedStepsForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSpeedStepsForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSpeedStepsForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSpeedStepsForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSpeedStepsForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSpeedStepsForward();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetCapUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetCapUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetLightBarrierBackwardInterruptedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getLightBarrierBackwardInterrupted();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetLightBarrierBackwardInterruptedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getLightBarrierBackwardInterrupted();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetLightBarrierBackwardInterruptedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getLightBarrierBackwardInterrupted();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetLightBarrierForwardInterruptedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getLightBarrierForwardInterrupted();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetLightBarrierForwardInterruptedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getLightBarrierForwardInterrupted();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetLightBarrierForwardInterruptedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getLightBarrierForwardInterrupted();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetMotionStatusCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMotionStatus();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMotionStatusCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMotionStatus();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMotionStatusCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMotionStatus();
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
    public void testGetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetPowerStateCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testGetSecurityFlapBackwardOpenedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getSecurityFlapBackwardOpened();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSecurityFlapBackwardOpenedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getSecurityFlapBackwardOpened();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSecurityFlapBackwardOpenedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getSecurityFlapBackwardOpened();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetSecurityFlapForwardOpenedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getSecurityFlapForwardOpened();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSecurityFlapForwardOpenedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getSecurityFlapForwardOpened();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSecurityFlapForwardOpenedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getSecurityFlapForwardOpened();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testAdjustItemCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.adjustItemCount(0,0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAdjustItemCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.adjustItemCount(0,0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAdjustItemCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.adjustItemCount(0,0);
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
    public void testCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testMoveBackwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.moveBackward(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testMoveBackwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.moveBackward(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testMoveBackwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.moveBackward(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testMoveForwardCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.moveForward(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testMoveForwardCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.moveForward(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testMoveForwardCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.moveForward(0);
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
    public void testResetBeltCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resetBelt();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetBeltCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resetBelt();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetBeltCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resetBelt();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testResetItemCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resetItemCount(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetItemCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resetItemCount(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetItemCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resetItemCount(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testResetStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testRetrieveStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testStopBeltCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.stopBelt();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStopBeltCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.stopBelt();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStopBeltCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.stopBelt();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
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
    public void testUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
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
