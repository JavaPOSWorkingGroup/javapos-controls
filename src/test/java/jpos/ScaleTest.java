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
 * Scale device control JUnit test.
 * <br>
 * Generated through jpos.build.controls.JavaPOSDeviceControlTestGenerator for JavaPOS version 1.14
 */
public class ScaleTest {

    private static final String OPENNAME_ALL_METHODS_THROWING_NPE = "ScaleTestServiceAlwaysThrowingNPE";
    private static final String OPENNAME_SERVICE_10 = "ScaleTestService12";
    private static final String OPENNAME_SERVICE_12 = "ScaleTestService12";
    private static final String OPENNAME_SERVICE_13 = "ScaleTestService13";
    private static final String OPENNAME_SERVICE_14 = "ScaleTestService14";
    private static final String OPENNAME_SERVICE_15 = "ScaleTestService15";
    private static final String OPENNAME_SERVICE_16 = "ScaleTestService16";
    private static final String OPENNAME_SERVICE_17 = "ScaleTestService17";
    private static final String OPENNAME_SERVICE_18 = "ScaleTestService18";
    private static final String OPENNAME_SERVICE_19 = "ScaleTestService19";
    private static final String OPENNAME_SERVICE_110 = "ScaleTestService110";
    private static final String OPENNAME_SERVICE_111 = "ScaleTestService111";
    private static final String OPENNAME_SERVICE_112 = "ScaleTestService112";
    private static final String OPENNAME_SERVICE_113 = "ScaleTestService113";
    private static final String OPENNAME_SERVICE_114 = "ScaleTestService114";

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_ALL_METHODS_THROWING_NPE, "1.14"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_12, "1.2"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_13, "1.3"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_14, "1.4"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_15, "1.5"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_16, "1.6"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_17, "1.7"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_18, "1.8"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_19, "1.9"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_110, "1.10"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_111, "1.11"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_112, "1.12"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_113, "1.13"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("Scale", OPENNAME_SERVICE_114, "1.14"));
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.removeJposEntry(OPENNAME_ALL_METHODS_THROWING_NPE);
        registry.removeJposEntry(OPENNAME_SERVICE_12);
        registry.removeJposEntry(OPENNAME_SERVICE_13);
        registry.removeJposEntry(OPENNAME_SERVICE_14);
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

    private Scale control;

    @Before
    public void setUp() throws Exception {
        this.control = new Scale();
    }

    @After
    public void tearDown() throws Exception {
        this.control = null;
    }

    /**
     * Test method for {@link jpos.Scale#createEventCallbacks()}.
     */
    @Test
    public final void testCreateEventCallbacks() {
        EventCallbacks callbacks = this.control.createEventCallbacks();
        assertThat(callbacks, is(notNullValue()));
    }
    
    @Test
    public final void testGetAsyncModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAsyncMode();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAsyncModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAsyncMode(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoDisableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoDisable();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoDisableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoDisable(true);
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
    public final void testGetCapDisplayFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapDisplay();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapDisplayTextFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapDisplayText();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapFreezeValueFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapFreezeValue();
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
    public final void testGetCapPriceCalculatingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapPriceCalculating();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapReadLiveWeightWithTareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapReadLiveWeightWithTare();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSetPriceCalculationModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSetPriceCalculationMode();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSetUnitPriceWithWeightUnitFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSetUnitPriceWithWeightUnit();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSpecialTareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSpecialTare();
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
    public final void testGetCapStatusUpdateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStatusUpdate();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapTarePriorityFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapTarePriority();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapTareWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapTareWeight();
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
    public final void testGetCapZeroScaleFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapZeroScale();
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
    public final void testGetDataCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataCount();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataEventEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDataEventEnabled(true);
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
    public final void testGetMaxDisplayTextCharsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMaxDisplayTextChars();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMaximumWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMaximumWeight();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMinimumWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMinimumWeight();
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
    public final void testGetSalesPriceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getSalesPrice();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetScaleLiveWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getScaleLiveWeight();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetStatusNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getStatusNotify();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetStatusNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setStatusNotify(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTareWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTareWeight();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetTareWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setTareWeight(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetUnitPriceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getUnitPrice();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetUnitPriceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setUnitPrice(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetWeightUnitFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getWeightUnit();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetZeroValidFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getZeroValid();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetZeroValidFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setZeroValid(true);
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
    public final void testClearInputFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.clearInput();
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
    public final void testDisplayTextFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.displayText("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testDoPriceCalculatingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.doPriceCalculating(new int[0],new int[0],new long[0],new long[0],new int[0],new int[0],new int[0],new long[0],0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testFreezeValueFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.freezeValue(0,true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testReadLiveWeightWithTareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.readLiveWeightWithTare(new int[0],new int[0],0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testReadWeightFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.readWeight(new int[0],0);
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
    public final void testSetPriceCalculationModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setPriceCalculationMode(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetSpecialTareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setSpecialTare(0,0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetTarePrioityFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setTarePrioity(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetTarePriorityFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setTarePriority(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetUnitPriceWithWeightUnitFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setUnitPriceWithWeightUnit(0,0,0,0);
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
    public final void testZeroScaleFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.zeroScale();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAsyncModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAsyncMode();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAsyncModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAsyncMode(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoDisableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoDisable();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoDisableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoDisable(true);
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
    public final void testGetCapDisplayFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapDisplay();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapDisplayTextFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapDisplayText();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapFreezeValueFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapFreezeValue();
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
    public final void testGetCapPriceCalculatingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapPriceCalculating();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapReadLiveWeightWithTareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapReadLiveWeightWithTare();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSetPriceCalculationModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSetPriceCalculationMode();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSetUnitPriceWithWeightUnitFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSetUnitPriceWithWeightUnit();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSpecialTareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSpecialTare();
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
    public final void testGetCapStatusUpdateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStatusUpdate();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapTarePriorityFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapTarePriority();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapTareWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapTareWeight();
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
    public final void testGetCapZeroScaleFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapZeroScale();
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
    public final void testGetDataCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataCount();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataEventEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDataEventEnabled(true);
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
    public final void testGetMaxDisplayTextCharsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMaxDisplayTextChars();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMaximumWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMaximumWeight();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMinimumWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMinimumWeight();
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
    public final void testGetSalesPriceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getSalesPrice();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetScaleLiveWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getScaleLiveWeight();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetStatusNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getStatusNotify();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetStatusNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setStatusNotify(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTareWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTareWeight();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetTareWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setTareWeight(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetUnitPriceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getUnitPrice();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetUnitPriceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setUnitPrice(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetWeightUnitFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getWeightUnit();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetZeroValidFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getZeroValid();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetZeroValidFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setZeroValid(true);
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
    public final void testClearInputFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.clearInput();
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
    public final void testDisplayTextFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.displayText("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testDoPriceCalculatingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.doPriceCalculating(new int[0],new int[0],new long[0],new long[0],new int[0],new int[0],new int[0],new long[0],0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testFreezeValueFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.freezeValue(0,true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testReadLiveWeightWithTareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.readLiveWeightWithTare(new int[0],new int[0],0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testReadWeightFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.readWeight(new int[0],0);
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
    public final void testSetPriceCalculationModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setPriceCalculationMode(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetSpecialTareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setSpecialTare(0,0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetTarePrioityFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setTarePrioity(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetTarePriorityFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setTarePriority(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetUnitPriceWithWeightUnitFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setUnitPriceWithWeightUnit(0,0,0,0);
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
    public final void testZeroScaleFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.zeroScale();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceVersion12() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            assertThat(this.control.getDeviceServiceVersion(), is(1002000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            assertThat(this.control.getDeviceServiceVersion(), is(1003000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            assertThat(this.control.getDeviceServiceVersion(), is(1004000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            assertThat(this.control.getDeviceServiceVersion(), is(1005000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            assertThat(this.control.getDeviceServiceVersion(), is(1006000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            assertThat(this.control.getDeviceServiceVersion(), is(1007000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            assertThat(this.control.getDeviceServiceVersion(), is(1008000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            assertThat(this.control.getDeviceServiceVersion(), is(1009000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            assertThat(this.control.getDeviceServiceVersion(), is(1010000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            assertThat(this.control.getDeviceServiceVersion(), is(1011000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            assertThat(this.control.getDeviceServiceVersion(), is(1012000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            assertThat(this.control.getDeviceServiceVersion(), is(1013000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            assertThat(this.control.getDeviceServiceVersion(), is(1014000));
        }
        catch (JposException e) {
            fail("Scale.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getAsyncMode();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setAsyncMode(true);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getAutoDisable();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setAutoDisable(true);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoDisable(true);
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
    public void testGetCapDisplayCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapDisplay();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapDisplayTextFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapDisplayText();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDisplayTextCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapDisplayText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapFreezeValueFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapFreezeValue();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapFreezeValueCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapFreezeValue();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapPowerReportingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapPowerReporting();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion15() {
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
    public void testGetCapPriceCalculatingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapPriceCalculating();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPriceCalculatingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapPriceCalculating();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapReadLiveWeightWithTareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapReadLiveWeightWithTare();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapReadLiveWeightWithTareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapReadLiveWeightWithTare();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSetPriceCalculationModeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSetPriceCalculationMode();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapSetPriceCalculationModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSetPriceCalculationMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSetUnitPriceWithWeightUnitFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSetUnitPriceWithWeightUnit();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapSetUnitPriceWithWeightUnitCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSetUnitPriceWithWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSpecialTareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSpecialTare();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapSpecialTareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSpecialTare();
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
    public void testGetCapStatusUpdateFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapStatusUpdate();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapStatusUpdateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapStatusUpdate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatusUpdateCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStatusUpdate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatusUpdateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStatusUpdate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatusUpdateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStatusUpdate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatusUpdateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStatusUpdate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatusUpdateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStatusUpdate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapTarePriorityFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapTarePriority();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapTarePriorityCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapTarePriority();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapTareWeightFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapTareWeight();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTareWeightCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapTareWeight();
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
    public void testGetCapZeroScaleFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapZeroScale();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapZeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapZeroScaleCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapZeroScale();
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
    public void testGetCheckHealthTextCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetClaimedCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetDataCountFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDataCount();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetDataCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDataEventEnabledFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDataEventEnabled();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setDataEventEnabled(true);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDataEventEnabled(true);
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
    public void testGetDeviceEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testSetDeviceEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetFreezeEventsCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testSetFreezeEventsCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetMaxDisplayTextCharsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getMaxDisplayTextChars();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaxDisplayTextCharsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMaxDisplayTextChars();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMaximumWeightCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMaximumWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetMinimumWeightFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMinimumWeight();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetMinimumWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMinimumWeight();
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
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetPhysicalDeviceNameCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testGetPowerNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPowerNotify();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion15() {
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
    public void testSetPowerNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setPowerNotify(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion15() {
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
    public void testGetPowerStateFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPowerState();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion15() {
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
    public void testGetSalesPriceFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getSalesPrice();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSalesPriceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getSalesPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetScaleLiveWeightFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getScaleLiveWeight();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetScaleLiveWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getScaleLiveWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetScaleLiveWeightCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getScaleLiveWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetScaleLiveWeightCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getScaleLiveWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetScaleLiveWeightCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getScaleLiveWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetScaleLiveWeightCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getScaleLiveWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetScaleLiveWeightCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getScaleLiveWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetStatusNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getStatusNotify();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetStatusNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getStatusNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStatusNotifyCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getStatusNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStatusNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getStatusNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStatusNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getStatusNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStatusNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getStatusNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStatusNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getStatusNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStatusNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setStatusNotify(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetStatusNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setStatusNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetStatusNotifyCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setStatusNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStatusNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setStatusNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStatusNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setStatusNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStatusNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setStatusNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStatusNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setStatusNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTareWeight();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTareWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTareWeightCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTareWeight();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setTareWeight(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTareWeightCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setTareWeight(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getUnitPrice();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetUnitPriceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getUnitPrice();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setUnitPrice(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetUnitPriceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setUnitPrice(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWeightUnitCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getWeightUnit();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetZeroValidFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getZeroValid();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetZeroValidCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getZeroValid();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetZeroValidCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getZeroValid();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetZeroValidFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setZeroValid(true);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetZeroValidCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setZeroValid(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetZeroValidCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setZeroValid(true);
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
    public void testCheckHealthCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testClaimCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testClearInputFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.clearInput();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testClearInputCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.clearInput();
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
    public void testCloseCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testDirectIOCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testDisplayTextFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.displayText("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testDisplayTextCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDisplayTextCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.displayText("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDoPriceCalculatingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.doPriceCalculating(new int[0],new int[0],new long[0],new long[0],new int[0],new int[0],new int[0],new long[0],0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testDoPriceCalculatingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.doPriceCalculating(new int[0],new int[0],new long[0],new long[0],new int[0],new int[0],new int[0],new long[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testFreezeValueFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.freezeValue(0,true);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testFreezeValueCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.freezeValue(0,true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testReadLiveWeightWithTareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.readLiveWeightWithTare(new int[0],new int[0],0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testReadLiveWeightWithTareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.readLiveWeightWithTare(new int[0],new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testReadWeightCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.readWeight(new int[0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReadWeightCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.readWeight(new int[0],0);
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
    public void testReleaseCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
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
    public void testSetPriceCalculationModeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setPriceCalculationMode(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testSetPriceCalculationModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setPriceCalculationMode(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetSpecialTareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setSpecialTare(0,0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testSetSpecialTareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setSpecialTare(0,0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetTarePrioityFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setTarePrioity(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testSetTarePrioityCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setTarePrioity(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetTarePriorityFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setTarePriority(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testSetTarePriorityCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setTarePriority(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetUnitPriceWithWeightUnitFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setUnitPriceWithWeightUnit(0,0,0,0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testSetUnitPriceWithWeightUnitCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setUnitPriceWithWeightUnit(0,0,0,0);
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
    
    @Test
    public void testZeroScaleFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.zeroScale();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testZeroScaleCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testZeroScaleCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.zeroScale();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
}
